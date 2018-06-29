fun main(args:Array<String>) {
    var solution:Solution = Solution()
    val nums:IntArray = intArrayOf(2, 7, 3, 11, 15, 1, 8, 6)

    val res:MutableList<Int> = solution.twoSum(nums, 9)
    for (r in res) println(r)
}