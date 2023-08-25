class HackerRank {
    fun plusMinus(array: Array<Int>) {
        val posNums = array.filter { it > 0 }.size
        val negNums = array.filter { it < 0}.size
        val zeros = array.filter {it == 0}.size

        println(".6f".format(posNums.toDouble() / array.size))
        println(".6f".format(negNums.toDouble() / array.size))
        println(".6f".format(zeros.toDouble() / array.size))
    }

    fun miniMaxSum(array: Array<Int>) {
        val longArray: LongArray = array.map { it.toLong() }.toLongArray()
        val arraySum = longArray.sum()
        val minSum = arraySum - longArray.max()
        val maxSum = arraySum - longArray.min()
        print("$minSum $maxSum")
    }
}