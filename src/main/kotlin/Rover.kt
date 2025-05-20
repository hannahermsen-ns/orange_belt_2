package org.example

class Rover {
    constructor(rawPositionData: String) { // primitive obsession
        val startingPosition = rawPositionData.split(' ')
        if (startingPosition.size >= 3) {
            // primitive obsession, feature envy, data clump?,
            roverState.xx = startingPosition[0].toInt()
            roverState.yy = startingPosition[1].toInt()
            roverState.dd = startingPosition[2][0]
        }
    }

    fun executeInstructions(instructions: String) { // long method
        // primitive obsession (not a string but a list of enum values representing the commands)
        for (instruction in instructions) {
            when (instruction) { // switch statement
                'L' -> { // primitive obsession
                    when (roverState.dd) { // too many levels of indentation, bad indentation, switch statement, feature envy
                        'E' -> roverState.dd = 'N'
                        'N' -> roverState.dd = 'W'
                        'W' -> roverState.dd = 'S'
                        'S' -> roverState.dd = 'E'
                    }
                }
                'R' -> {
                    when (roverState.dd) {
                        // using the same when in multiple places (duplicated code)
                        'E' -> roverState.dd = 'S' 'S' -> roverState.dd = 'W' 'W' -> roverState.dd = 'N' 'N' -> roverState.dd = 'E'
                    }
                }
                'M' -> {
                    when (roverState.dd) {
                        'E' -> roverState.xx++ 'S' -> roverState.yy-- 'W' -> roverState.xx-- 'N' -> roverState.yy++
                    }
                }
            }
        }
    }

    fun g(z: Char) {
        executeInstructions(z.toString())
    }

    // feature envy
    val roverStateString: String
        get() = "${roverState.xx} ${roverState.yy} ${roverState.dd}"

    fun pos(): String = roverStateString

    constructor() : this("")

    private var roverState = RoverState() // Unclear naming
}

class RoverState {
    var xx: Int = 0 // Unclear naming
    var yy: Int = 0 // Unclear naming
    var dd: Char = 'N' // Unclear naming
}
