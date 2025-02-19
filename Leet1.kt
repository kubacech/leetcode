class Leet1 {
    
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result: IntArray = IntArray(2)
        nums.forEachIndexed { i, v1 -> 
            nums.forEachIndexed { j, v2 ->
                 if (i != j && v1 + v2 == target) {
                    result[0] = i
                    result[1] = j
                    return result
                 }
            }
        }
        return result
    }
}
