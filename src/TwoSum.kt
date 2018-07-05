class TwoSum {
    /*----------------------------------------------------------------------------------------------
    * Solution with (n) responses
    * Method: Brute Force
    * Developed by: Edwin Orbes*/
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
        throw IllegalArgumentException("No two sum solution =(")
    }

    /*----------------------------------------------------------------------------------------------
    * Solution with two responses
    * Method: Brute Force
    * Developed by: Edwin Orbes*/
    fun twoSum2(nums:IntArray, target:Int):IntArray {
        for (index in nums.indices) {
            for(index2 in index+1 until nums.size){
                if (nums[index]+nums[index2] == target)
                    return intArrayOf(index, index2)
            }
        }
        throw IllegalArgumentException("No two sum solution =(")
    }
    /*----------------------------------------------------------------------------------------------
    * Solution with two responses
    * Method: Two-pass Hash Map
    * Developed by: LeetCode*/
    fun twoSum2Pass(nums: IntArray, target:Int):IntArray {
        val map:HashMap<Int, Int> = HashMap()
        for (index in nums.indices)
            map.put(nums[index],index)

        for (index in nums.indices) {
            val complement:Int = target - nums[index]
            if (map.containsKey(complement) && map.get(complement) != index) {
                return intArrayOf(index, map.get(complement)!!)
            }
        }

        throw IllegalArgumentException("No two sum solution =(")
    }
    /*----------------------------------------------------------------------------------------------
    * Solution with two responses
    * Method: One-pass Hash Map
    * Developed by: LeetCode*/
    fun twoSum1Pass(nums:IntArray, target: Int):IntArray {
        val map:HashMap<Int,Int> = HashMap()
        for (index in nums.indices){
            val complement:Int = target - nums[index]
            if (map.containsKey(complement))
                return intArrayOf(index, map.get(complement)!!)
            map.put(nums[index],index)
        }

        throw IllegalArgumentException("No two sum solution =(")
    }
}