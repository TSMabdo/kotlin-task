import javax.print.attribute.standard.MediaSize.Other



fun sumOFEventNumbers(numbers:List<Int>): Int {
return numbers.filter { it % 2==0}.sum()

}

fun Number_Categorization(number: Int) {

    if (number > 0) {
        println("the number is positive")
    } else if (number < 0) {
        println("the number is negative")
    } else {
        println("the number is zero")
    }

    when {
        number > 0 -> println("the number is postive")
        number < 0 -> println("the number is negative")
        else -> println("the number is zero")
    }
}
fun Fibonacci_Sequence() {
    val n = 10
    var f1 = 0
    var f2 = 1
    print("first $n numbers of the fibonacci sequence: ")

    for (i in 1..n) {
        print("$f1 ")
        val sum = f1 + f2
        f1 = f2
        f2 = sum
    }

}

fun applyToStrings(strings: List<String>, func: (String) -> String): List<String> {
        return strings.map {
            func(it)
        }

    }
fun filterEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 == 0 }

}


fun filterStrings(strings: List<String>): List<String> {
    return strings.filter { it.length > 4 }
}

fun mapStringsToUpper(strings: List<String>): List<String> {
    return strings.map { it.uppercase() }
}

fun reduceStrings(strings: List<String>): String {
    return strings.reduce { acc, s -> "$acc, $s" }
}

fun filterEvenNumbers(numbers: Set<Int>): List<Int> {
    return numbers.filter { it % 2 == 0 }
}

fun mapNumbersToSquare(numbers: Set<Int>): List<Int> {
    return numbers.map { it * it }
}

fun reduceNumbers(numbers: Set<Int>): Int {
    return numbers.reduce { acc, n -> acc + n }
}

fun filterMapByValue(map: Map<String, Int>): Map<String, Int> {
    return map.filter { it.value > 4 }
}

fun incrementMapValues(map: Map<String, Int>): Map<String, Int> {
    return map.mapValues { it.value + 1 }
}

fun reduceMapValues(map: Map<String, Int>): Int {
    return map.values.reduce { acc, v -> acc + v }
}


fun mapStringLengths(strings: List<String>): Map<String, Int> {
    val result = mutableMapOf<String, Int>()
    for (string in strings) {
        result[string] = string.length
    }
    return result
}


fun nullableStringLength(input: String?): Int {
    return input?.length?:0

}

fun String.countVowels():Int{
    val vowels="aeiouAEIOU"
    var count=0
    for (char in this){
        if (char in vowels ){
            count++
        }
    }
    return count


}



    fun main() {

        val obj=Basic_Syntaxx()
        obj.Basic_Syntax()

        val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        val sum = sumOFEventNumbers(numbers)
        println("sum of even numbers:$sum")

        print("Enter an integer number :")
        val number = readLine()?.toIntOrNull()
        if (number != null) {
            Number_Categorization(number)
        } else {
            println("invalid input")
        }
       println("~~~~~~~~~~~~~~~~~~~~~~~~~")
        Fibonacci_Sequence()


        println()
        val strings = listOf("hello", "world", "kotlin", "abdo", "itworx")

        val uppercasedStrings = applyToStrings(strings) {
            it.uppercase()
        }

        println("Original strings: $strings")
        println("Uppercased strings: $uppercasedStrings")

        println("~~~~~~~~~~~~~~~~~~~~~~~~~")

        val numberss= listOf(1,2,3,4,5,6,7,8,9)
        val evennumbers=filterEvenNumbers(numberss)
        println("original numbers $numberss")
        println("even numbers $evennumbers")




        val stringList = listOf("apple", "banana", "kiwi", "orange", "grape")
        println("Filtered List (length > 3): ${filterStrings(stringList)}")
        println("Mapped List (uppercase): ${mapStringsToUpper(stringList)}")
        println("Reduced String: ${reduceStrings(stringList)}")
        println("~~~~~~~~~~~~~~~~~~~~~~~~~")
        val numberSet = setOf(1, 2, 3, 4, 5)
        println("Filtered Set (even numbers): ${filterEvenNumbers(numberSet)}")
        println("Mapped Set (squared): ${mapNumbersToSquare(numberSet)}")
        println("Reduced Sum: ${reduceNumbers(numberSet)}")
        println("~~~~~~~~~~~~~~~~~~~~~~~~~")
        val fruitMap = mapOf("apple" to 5, "banana" to 6, "kiwi" to 4)
        println("Filtered Map (value > 4): ${filterMapByValue(fruitMap)}")
        println("Mapped Map (values incremented): ${incrementMapValues(fruitMap)}")
        println("Reduced Map Sum (values): ${reduceMapValues(fruitMap)}")

        println("~~~~~~~~~~~~~~~~~~~~~~~~~")

        val stringLengths = mapStringLengths(strings)
        println("String Length Map: $stringLengths")

        println("~~~~~~~~~~~~~~~~~~~~~~~~~")

        val person1 =person("ahmed",20)
        val person2 =person("abdo",30)
        person1.display()
        person2.display()
        println("~~~~~~~~~~~~~~~~~~~~~~~~~")

        val Car=car("BMW","M4",2)
        val motor=motorcycle("yamaha","R1",160)
        println("car info")
        Car.displayinfo()

        println("motorcycle info")
        motor.displayinfo()

        println("~~~~~~~~~~~~~~~~~~~~~~~~~")

        val string1:String?="Eng.abdelrahman"
        val string2:String?=""
        println("length of string 1 = ${nullableStringLength(string1)}")
        println("lenght of string 2 = ${nullableStringLength(string2)}")

        println("~~~~~~~~~~~~~~~~~~~~~~~~~")

        val nullableString1: String? = "abdelrahman ayman"
        val nullableString2: String? = null

        val length1 = nullableString1?.length ?: 0
        val length2 = nullableString2?.length ?: 0

        println("Length of nullableString1 (with Elvis operator): $length1")
        println("Length of nullableString2 (with Elvis operator): $length2")

        fun printStringLength(str: String?) {
            val length = str?.length ?: 0
            println("Length of the string: $length")
        }

        printStringLength("Hello, World!")
        printStringLength(null)

        println("~~~~~~~~~~~~~~~~~~~~~~~~~")

        val str1 = "hello world"
        val str2 = "itworx"
        val str3 = "string Extension Functionsa"

        println("Number of vowels in $str1: ${str1.countVowels()}")
        println("Number of vowels in $str2: ${str2.countVowels()}")
        println("Number of vowels in $str3: ${str3.countVowels()}")

        println("~~~~~~~~~~~~~~~~~~~~~~~~~")

        val complex1=complexnumber(4,6)
        val complex2=complexnumber(2,4)
        val summ = complex1.plus(complex2)
        println("($complex1) + ($complex2) = ($summ)")


    }
