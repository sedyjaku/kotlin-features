package cz.sedy.kotlincode.dto

class KotlinRoadBike (
    val tireWidth: Int,
    gear: Int,
    cadence: Int,
    speed: Int = 30
) : KotlinBicycle(gear, cadence, speed){


    constructor(color: String, tireWidth: Int, gear: Int, cadence: Int, speed: Int = 20) :
            this(tireWidth, gear, cadence, speed) {
        println("color is $color")
    }

    override fun printDescription() {
        super.printDescription()
        println("""The 
                |road bike has a 
                |tire width of 
                |$tireWidth""".trimMargin())
    }

}