package com.leetcode

/*
*1512. Number of Good Pair
* Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.

Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

* Example 2:
* Input: nums = [1,1,1,1]
* Output: 6
* Explanation: Each pair in the array are good.
*

* Example 3:
Input: nums = [1,2,3]
Output: 0

* Constraints:

* 1 <= nums.length <= 100
* 1 <= nums[i] <= 100
* */

object NumberOfGoodPairs extends App {

    def numIdenticalPairs(nums: Array[Int]): Int = {
      var pairCount  = 0
      for(i<- 1 to nums.length-1; j <- 0 to i-1){
        if (nums(i) == nums(j))
          pairCount = pairCount + 1
      }
      pairCount
   }

  val pairCount = numIdenticalPairs(Array(3,5,6,3,3,5))
  println(s"Number of pairs : $pairCount")

  /* Alternative:
  * for {
            i <- 0 until nums.length
            j <- i+1 until nums.length if nums(i) == nums(j)
        } result += 1
  * */
}
