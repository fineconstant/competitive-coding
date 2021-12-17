package com.fineconstant.algscala

/** https://leetcode.com/problems/longest-common-prefix/
  */
object LongestCommonPrefix {
  object Solution {
    def longestCommonPrefix(xs: Array[String]): String = {
      xs.fold(xs.head) { case (acc, x) =>
        var newAcc = acc
        while (!x.startsWith(newAcc)) {
          newAcc = newAcc.dropRight(1)
        }
        newAcc
      }
    }
  }
}
