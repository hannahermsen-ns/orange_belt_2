package com.gildedrose

class GildedRose(var items: List<Item>) {

    companion object {
        private const val MAX_QUALITY_SCORE = 50
        private const val BACKSTAGE_SELL_IN_THRESHOLD_FOR_TRIPLE_INCREASE = 5
        private const val BACKSTAGE_SELL_IN_THRESHOLD_FOR_DOUBLE_INCREASE = 10
        private const val AGED_BRIE = "Aged Brie"
        private const val BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert"
        private const val SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros"
    }

    fun updateQuality() { // long method,

        for (i in items.indices) {
            val item = items[i]

            if (item.name != AGED_BRIE && item.name != BACKSTAGE_PASSES) {
                if (item.quality > 0) {
                    if (item.name != SULFURAS_HAND_OF_RAGNAROS) {
                        decreaseQualityForSulfuras(item)
                    }
                }
            } else {
                if (item.quality < MAX_QUALITY_SCORE) { // magic number
                    item.quality = item.quality + 1

                    if (item.name == BACKSTAGE_PASSES) {
                        if (item.sellIn <= BACKSTAGE_SELL_IN_THRESHOLD_FOR_DOUBLE_INCREASE) {
                            increaseQualityIfPossible(item)
                        }

                        if (item.sellIn <= BACKSTAGE_SELL_IN_THRESHOLD_FOR_TRIPLE_INCREASE) { // magic number
                            increaseQualityIfPossible(item)
                        }
                    }
                }
            }

            if (item.name != SULFURAS_HAND_OF_RAGNAROS) {
                item.sellIn = item.sellIn - 1
            }

            if (item.sellIn < 0) {
                if (item.name != AGED_BRIE) {
                    if (item.name != BACKSTAGE_PASSES) {
                        if (item.quality > 0) {
                            if (item.name != SULFURAS_HAND_OF_RAGNAROS) {
                                decreaseQualityForSulfuras(item)
                            }
                        }
                    } else {
                        item.quality = item.quality - item.quality
                    }
                } else {
                    increaseQualityIfPossible(item)
                }
            }
        }
    }

    private fun decreaseQualityForSulfuras(item: Item) {
        item.quality = item.quality - 1
    }

    fun increaseQualityIfPossible(item: Item) {
        if (item.quality < MAX_QUALITY_SCORE) {// magic number
            item.quality = item.quality + 1
        }
    }

}

