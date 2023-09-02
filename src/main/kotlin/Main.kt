fun main(args: Array<String>) {
    val easy = Easy()
    val hackerRank = HackerRank()
    val array1: Array<Int> = arrayOf(1, 2, 3, 4, 5, 4, 5, 2, 1)

    val result = hackerRank.countingSort(array1)
    println(result.joinToString(" "))
}