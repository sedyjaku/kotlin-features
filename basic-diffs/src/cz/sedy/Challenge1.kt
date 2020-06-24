package cz.sedy

fun main(args: Array<String>) {

    val hello1= "Hello"
    val hello2= "Hello"

    //compare references
    print("are strings references equal? ${hello1 === hello2}")

    //compare structure
    print("are strings equal? ${hello1 == hello2}")

    //idea underlines var variables
    var num = 2988

    val anyVar: Any = "The Any type is the root of the Kotlin class Hierarchy"

    //smart cast
    if (anyVar is String){
        println(anyVar.toUpperCase())
    }

    val singleLineString = "   1|  11| 111|1111".trimMargin("|")
    println(singleLineString)

    val multiLineString = """
           1
          11
         111
        1111
    """.trimIndent()
    println(multiLineString)

    val multiLineStringTrimWithOne = """
        1   1
        1  11
        1 111
        11111
    """.trimMargin("1")

    println(multiLineStringTrimWithOne)

}