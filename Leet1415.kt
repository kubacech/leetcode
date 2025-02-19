import kotlin.math.*

class Leet1415 {

    fun getHappyString(n: Int, k: Int): String {
        var result = generate("", 1, n).toMutableList()

        if (result.size < k) {
            return ""
        }

        result.sort()
        return result[k-1]
    }

    private fun generate(currentSting: String, currentIndex: Int, n: Int): List<String> {
        if (currentIndex > n) {
            return listOf(currentSting)
        }
        if (currentSting.isEmpty()) {
            return generate("a", currentIndex+1, n) + generate("b", currentIndex+1, n) + generate("c", currentIndex+1, n)
        }

        return when (currentSting.last()){
            'a' -> generate("${currentSting}b", currentIndex+1, n) +  generate("${currentSting}c", currentIndex+1, n)
            'b' ->  generate("${currentSting}a", currentIndex+1, n) +  generate("${currentSting}c", currentIndex+1, n)
            'c' ->  generate("${currentSting}a", currentIndex+1, n) +  generate("${currentSting}b", currentIndex+1, n)
            else -> throw IllegalStateException()
        }
    } 
}
