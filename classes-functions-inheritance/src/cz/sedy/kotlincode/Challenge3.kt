package cz.sedy.kotlincode

import cz.sedy.javacode.MountainBike
import cz.sedy.kotlincode.dto.KotlinBicycle
import cz.sedy.kotlincode.dto.KotlinMountainBike
import cz.sedy.kotlincode.dto.KotlinRoadBike

fun main(args: Array<String>) {
    val normalBike = KotlinBicycle(10, 30, 50)
    normalBike.printDescription()
    val mountainBike = KotlinMountainBike(3, 10, 30, 50)
    mountainBike.printDescription()
    val roadBike = KotlinRoadBike(3, 10, 30, 50)
    roadBike.printDescription()

    //no gear
    val normalBikeWithoutSpeed = KotlinBicycle(30, 50)
    normalBike.printDescription()
    val mountainBikeWithoutSpeed = KotlinMountainBike(10, 30, 50)
    mountainBike.printDescription()
    val roadBikeWithoutSpeed = KotlinRoadBike(10, 30, 50)
    roadBike.printDescription()
    //new parameter at the end
    val mountainBikeWithoutSpeedWithColor = KotlinMountainBike(10, 30, 50, color = "blue")
    mountainBike.printDescription()
    //better to have new parameter at start so we can state optional ones at the end without specifying it
    val roadBikeWithoutSpeedWithColor = KotlinRoadBike("red", 10, 30, 50)
    roadBike.printDescription()

    KotlinMountainBike.availableColors.forEach {
        println(it)
    }
}