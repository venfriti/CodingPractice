import java.util.*

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

    fun gcdOfStrings(str1: String, str2: String): String{
        if (str1 + str2 != str2 + str1){
            return ""
        }

        var l1 = str1.length
        var l2 = str2.length
        while (l1 != l2) {
            if (l1 > l2){
                l1 -= l2
            } else {
                l2 -= l1
            }
        }
        return (str1.substring(0, l1))
    }

    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean>{
        val max = candies.max()
        val maxList = mutableListOf<Boolean>()
        for (candy in candies){
            if (extraCandies + candy >= max) maxList.add(true) else maxList.add(false)
        }
        return maxList
    }

//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        val x = nums.size; var i = 0; var j = 0;
//        var z = mutableListOf<Int>()
//        for (num in nums){
//            for (number in nums){
//                if (num + number == target) return intArrayOf(num, number)
//            }
//        }
//        while (i < x) {
//            while (j < x){
//                if (nums[i] + nums[j] == target) {
//                    z.add(i)
//                    z.add(j)
//                }
//                j++
//            }
//            i++
//        }
//        return z.toIntArray()
//    }
}