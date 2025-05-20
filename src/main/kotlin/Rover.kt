package org.example

class Rover {
    constructor(rawPositionData: String) { // primitive obsession
        val startingPosition = rawPositionData.split(' ')
        if (startingPosition.size >= 3) {
            // primitive obsession, feature envy, data clump?,
            rs.xx = startingPosition[0].toInt()
            rs.yy = startingPosition[1].toInt()
            rs.dd = startingPosition[2][0]
        }
    }

    fun executeCommands(cms: String) { // unclear naming (cms), long method
        // primitive obsession (not a string but a list of enum values representing the commands)
        for (c in cms) { // Unclear naming
            when (c) { // switch statement
                'L' -> { // primitive obsession, unclear naming
                    when (rs.dd) { // too many levels of indentation, bad indentation, switch statement, feature envy
                        'E' -> rs.dd = 'N'
                        'N' -> rs.dd = 'W'
                        'W' -> rs.dd = 'S'
                        'S' -> rs.dd = 'E'
                    }
                }
                'R' -> {
                    when (rs.dd) {
                        // using the same when in multiple places (duplicated code)
                        'E' -> rs.dd = 'S' 'S' -> rs.dd = 'W' 'W' -> rs.dd = 'N' 'N' -> rs.dd = 'E'
                    }
                }
                'M' -> {
                    when (rs.dd) {
                        'E' -> rs.xx++ 'S' -> rs.yy-- 'W' -> rs.xx-- 'N' -> rs.yy++
                    }
                }
            }
        }
    }

    fun g(z: Char) {
        executeCommands(z.toString())
    }

    // unclear naming, feature envy
    val xyd: String
        get() = "${rs.xx} ${rs.yy} ${rs.dd}"

    fun pos(): String = xyd

    constructor() : this("")

    private var rs = RoverState() // Unclear naming
}

class RoverState {
    var xx: Int = 0 // Unclear naming
    var yy: Int = 0 // Unclear naming
    var dd: Char = 'N' // Unclear naming
}
