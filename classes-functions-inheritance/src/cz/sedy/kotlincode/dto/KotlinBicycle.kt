package cz.sedy.kotlincode.dto

open class KotlinBicycle (
    var gear: Int,
    var cadence: Int,
    var speed: Int = 10
)
{
    fun applyBrake(decrement: Int){
        speed -= decrement
    }

    fun speedUp(increment: Int){
        speed+= increment
    }

    open fun printDescription(){
        println("""Bike is in gear $gear with cadence of $cadence travelling at a speed of $speed.""")
    }
}