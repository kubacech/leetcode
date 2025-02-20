class Leet1980 {

    fun findDifferentBinaryString(nums: Array<String>): String {
        if (nums.isEmpty()) return ""
    
        return generate("", nums[0].length, nums)
    }

    private fun generate(currentValue: String, n: Int, nums: Array<String>): String {
        if (currentValue.length == n) {
            return if (nums.contains(currentValue)) "" else currentValue
        }

        val result = generate("${currentValue}0", n, nums)
        
        return if (result.isEmpty()) {
            generate("${currentValue}1", n, nums)
        } else {
            result
        }
    }
}

fun main(args: Array<String>) {
    Leet1980().run {
        println(findDifferentBinaryString(arrayOf("01", "10")))
        println(findDifferentBinaryString(arrayOf("00", "01")))
        println(findDifferentBinaryString(arrayOf("111", "011", "001")))
    }
}
