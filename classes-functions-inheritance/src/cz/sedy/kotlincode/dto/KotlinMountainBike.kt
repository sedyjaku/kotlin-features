package cz.sedy.kotlincode.dto

import cz.sedy.javacode.MountainBike

class KotlinMountainBike(
    var seatHeight: Int,
    gear: Int,
    cadence: Int,
    speed: Int = 20
) : KotlinBicycle(gear, cadence, speed) {

    constructor(seatHeight: Int, gear: Int, cadence: Int, speed: Int = 20, color: String) :
            this(seatHeight, gear, cadence, speed) {
        println("color is $color")
    }

    companion object {
        val availableColors = listOf<String>("blue", "red", "white", "black", "green")
    }


    override fun printDescription() {
        super.printDescription()
        println("""The mountaint bike has a seat height of $seatHeight""")
    }
}