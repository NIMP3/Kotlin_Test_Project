class Solution {
    fun twoSum(nums: IntArray, target:Int):MutableList<Int> {
        val arraySolution:MutableList<Int> = mutableListOf()
        for(index in nums.indices){
            for (index2 in index until nums.size){
                if (nums[index]+nums[index2] == target) {
                    arraySolution.add(index)
                    arraySolution.add(index2)

                    nums[index] += target
                    nums[index2] += target
                }
            }
        }
        return arraySolution
    }
}