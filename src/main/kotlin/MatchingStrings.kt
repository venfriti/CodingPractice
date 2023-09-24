val strings = arrayOf("ab", "ab", "ab", "abc", "abcd")
val queries = arrayOf("ab", "abc", "cd")
fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
    val arrayed = Array(queries.size) { 0 }
    for (element in strings) {
        for (j in queries.indices){
            if (queries[j] in element) {
                arrayed[j] += 1
            }
        }

    }
    return arrayed
}


