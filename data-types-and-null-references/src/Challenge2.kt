fun main(args: Array<String>) {

    val nonNullableFloat1 = -3847.384f
    val nonNullableFloat2 = (-3847.384).toFloat()

    val nullableFloat1: Float? = -3847.384f
    val nullableFloat2: Float? = (-3847.384).toFloat()

    val shortArray1: Array<Short> = arrayOf(1,2,3,4,5)
    val shortArray2 = shortArrayOf(1,2,3,4,5)

    val intArrayFromRange = Array<Int?>(40){ i -> (i + 1) * 5}

    //array that can be passed to (char[] charArray] in java
    val arrayToCallFromJava = charArrayOf('a', 'b', 'c')

    val nullableString: String? = "I AM IN UPPERCASE"

    val conditionalString = nullableString?.toLowerCase()?: "I give up!"
    println(conditionalString)

    println(nullableString?.let { nullableString.toLowerCase().replace("am", "am not") })

    //this will throw null pointer exc
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()

}