package com.fineconstant.algscala

object TwoSum {
  /** https://leetcode.com/problems/two-sum/
    */
  object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
      val withIndex = nums.zipWithIndex

      for (
        a <- withIndex;
        b <- withIndex if a._1 + b._1 == target && a._2 != b._2
      ) yield Array(a._2, b._2).head
    }
  }
}
