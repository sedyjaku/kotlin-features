package cz.sedy

fun main(args: Array<String>) {
    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    val people = mapOf("Jones" to joe,
        "Smith" to jane,
        "Wilson" to mary,
        "Adams" to john,
        "Smithson" to jean
        )

    println(people.filter { it.value.lastName.startsWith('S') }.count())

    val namePairs = people.map { Pair(it.value.firstName, it.value.lastName) }

    val firstNames = people.map { it.value.firstName }
    val lastNames = people.map { it.value.lastName }
    val namePairs2 = firstNames.zip(lastNames)

    println(namePairs2)

    val (fName, lName, age) = joe
    println("fName = $fName, lName = $lName, age = $age")

    val list1 = listOf(1,4,9,15,33)
    val list2= listOf(4,55,-98, 15,22,42314)

    println(list1.union(list2))
    println(list1.intersect(list2
    ))

    var regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    //covariance
//    paper = regularPaper


//    paper.addPaper(Premium())


    //contravariance
    regularPaper = paper

}


class Person(val firstName: String, val lastName: String, val age: Int){

    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age
}

class Box<in T> {

//    fun takePaper(): T {
//
//    }


// cant do
 fun addPaper(paper: T){

    }
}


open class Paper {

}

class Regular: Paper(){

}

class Premium: Paper(){

}