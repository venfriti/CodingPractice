class Easy {
    fun mergeAlternatively(word1: String, word2: String): String {
        var mergedString = ""
        val wordLength1 = word1.length
        val wordLength2 = word2.length
        val maxLength = maxOf(wordLength1, wordLength2)
        var i = 0; var j = 0; var k = 0
        while (i < maxLength){
            if (j < wordLength1){
                mergedString += word1[j]
                j++
            }
            if (k < wordLength2){
                mergedString += word2[k]
                k++
            }
            i++
        }
        return mergedString
    }
}