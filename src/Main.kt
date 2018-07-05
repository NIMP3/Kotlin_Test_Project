fun main(args:Array<String>) {
    var solution:TwoSum = TwoSum()
    var nums:IntArray = intArrayOf(2, 7, 3, 11, 15, 1, 8, 6)

    //val res:MutableList<Int> = solution.twoSum(nums, 9)
    //for (r in res) println(r)

    val res2:IntArray = solution.twoSum2(nums,9)
    for (r in res2) println(r)

    val res3:IntArray = solution.twoSum2Pass(nums,9)
    for (r in res3) println(r)

    val res4:IntArray = solution.twoSum1Pass(nums,9)
    for (r in res4) println(r)
}