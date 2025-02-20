class Leet9 {
    fun isPalindrome(x: Int): Boolean = 
        x.toString().let { it == it.reversed( )}
}

fun main(args: Array<String>) {
    Leet9().run {
        println(isPalindrome(121))
        println(isPalindrome(-121))
        println(isPalindrome(10))
        println(isPalindrome(-101))
    }
}
