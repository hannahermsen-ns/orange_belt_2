package org.example

class Rover {
    constructor(rawPositionData: String) { // primitive obsession
        val startingPosition = rawPositionData.split(' ')
        if (startingPosition.size >= 3) {
            // primitive obsession, feature envy, data clump?,
            roverState.x = startingPosition[0].toInt()
            roverState.y = startingPosition[1].toInt()
            roverState.orientation = startingPosition[2][0]
        }
    }

    fun executeInstructions(instructions: String) {
        // primitive obsession (not a string but a list of enum values representing the commands)
        for (instruction in instructions) {
            when (instruction) { // switch statement
                'L' -> { // primitive obsession
                    handleLeftInstruction()
                }
                'R' -> {
                    handleRightInstruction()
                }
                'M' -> {
                    handleMoveInstruction()
                }
            }
        }
    }

    private fun handleMoveInstruction() {
        when (roverState.orientation) {
            'E' -> roverState.x++
            'S' -> roverState.y--
            'W' -> roverState.x--
            'N' -> roverState.y++
        }
    }

    private fun handleRightInstruction() {
        when (roverState.orientation) {
            // using the same when in multiple places (duplicated code)
            'E' -> roverState.orientation = 'S'
            'S' -> roverState.orientation = 'W'
            'W' -> roverState.orientation = 'N'
            'N' -> roverState.orientation = 'E'
        }
    }

    private fun handleLeftInstruction() {
        when (roverState.orientation) { // too many levels of indentation, bad indentation, switch statement, feature envy
            'E' -> roverState.orientation = 'N'
            'N' -> roverState.orientation = 'W'
            'W' -> roverState.orientation = 'S'
            'S' -> roverState.orientation = 'E'
        }
    }

    fun g(z: Char) {
        executeInstructions(z.toString())
    }

    // feature envy
    val roverStateString: String
        get() = "${roverState.x} ${roverState.y} ${roverState.orientation}"

    fun pos(): String = roverStateString

    constructor() : this("")

    private var roverState = RoverState()
}

class RoverState {
    var x: Int = 0 // primitive obsession
    var y: Int = 0 // primitive obsession
    var orientation: Char = 'N' // primitive obsession
}
