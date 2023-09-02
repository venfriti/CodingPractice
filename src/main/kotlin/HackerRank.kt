import kotlin.math.abs

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

    fun lonelyInteger(array: Array<Int>){
        var lonelyInteger = 0
        for (x in array){
            lonelyInteger = lonelyInteger xor x
        }
        print(lonelyInteger)
    }

    fun diagonalDifference(arr: Array<Array<Int>>): Int {
        val size = arr.size
        var leftDiagonal = 0
        var rightDiagonal = 0
        for (i in 0 until size) {
            leftDiagonal += arr[i][i]
            rightDiagonal += arr[i][size - i - 1]
        }
        return abs(rightDiagonal - leftDiagonal)
    }

    fun countingSort(arr: Array<Int>): Array<Int> {
        val max = arr.max()
        val countingArray = Array(max + 1) { 0 }

        for (num in arr){
            countingArray[num] += 1
        }
        return countingArray
    }
}