package cz.sedy

import org.w3c.dom.ranges.Range

fun main(args: Array<String>) {
//    for (i in 5..5000 step(5)){
//        println(i)
//    }

//    for (j in -500..0){
//        println(j)
//    }

    var prevFib = 1
    var prevprevFib = 0
    var fib = prevFib + prevprevFib
    println(prevprevFib)
    println(prevFib)
    for (i in 0..12) {
        println(fib)
        prevprevFib = prevFib
        prevFib = fib
        fib = prevFib + prevprevFib
    }

    mainloop@
    for (i in 1..5) {
        println(i)
        if (i == 2)
            break
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) {
                    continue@mainloop
                }
            }
        }
    }

    val num = 150
    val dnum = when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        else -> 0.0
    }

}