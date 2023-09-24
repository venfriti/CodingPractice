val test = intArrayOf(1, 3, 2, 3, 2, 5)
fun lonelyInteger(array: IntArray) : Int {
    var a = 0
    for (element in array){
        a = a xor element
    }
    return a
}