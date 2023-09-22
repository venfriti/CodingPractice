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

    fun timeConversion(s: String) : String {
        val inputTime = java.text.SimpleDateFormat("hh:mm:ssa")
        val outputTime = java.text.SimpleDateFormat("HH:mm:ss")
        val t = inputTime.parse(s)
        return(outputTime.format(t))

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


    fun maximizeUpperLeftQuadrantSum(matrix: Array<Array<Int>>): Int {
        val n = matrix.size
        val halfN = n / 2

        // Calculate the sum of all elements in the matrix
        var totalSum = 0
        for (i in 0 until n) {
            for (j in 0 until n) {
                totalSum += matrix[i][j]
            }
        }

        // Calculate the sum of the elements in the upper left quadrant
        var upperLeftSum = 0
        for (i in 0 until halfN) {
            for (j in 0 until halfN) {
                upperLeftSum += matrix[i][j]
            }
        }

        // Calculate the sum of the elements in the upper right quadrant
        var upperRightSum = 0
        for (i in 0 until halfN) {
            for (j in halfN until n) {
                upperRightSum += matrix[i][j]
            }
        }

        // Calculate the sum of the elements in the lower left quadrant
        var lowerLeftSum = 0
        for (i in halfN until n) {
            for (j in 0 until halfN) {
                lowerLeftSum += matrix[i][j]
            }
        }

        // Calculate the sum of the elements in the lower right quadrant
        var lowerRightSum = 0
        for (i in halfN until n) {
            for (j in halfN until n) {
                lowerRightSum += matrix[i][j]
            }
        }

        // Find the maximum sum among all possible combinations of row and column reversals
        val maxSum = maxOf(upperLeftSum, upperRightSum, lowerLeftSum, lowerRightSum)

        // The maximum sum of the upper left quadrant is the total sum minus the maximum sum of the other quadrants
        return totalSum - maxSum
    }
}

