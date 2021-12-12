package com.fineconstant.algscala

// TODO: Exceeds memory limit
object ThreeSum {

  /** https://leetcode.com/problems/3sum/
    */
  object Solution {
    case class WithIndex(value: Int, index: Int)

    def threeSum(nums: Array[Int]): List[List[Int]] = {
      val withIndex = nums.zipWithIndex
        .map(x => WithIndex(x._1, x._2))

      val ys =
        for (
          i <- withIndex;
          j <- withIndex;
          k <- withIndex
          if areDistinctIndices(i, j, k) && sumsToZero(i, j, k)
        ) yield List(i.value, j.value, k.value).sorted

      ys.distinct.toList
    }

    private def areDistinctIndices(i: Solution.WithIndex, j: Solution.WithIndex, k: Solution.WithIndex) =
      i.index != j.index && i.index != k.index && j.index != k.index

    private def sumsToZero(i: Solution.WithIndex, j: Solution.WithIndex, k: Solution.WithIndex) =
      i.value + j.value + k.value == 0
  }

}
