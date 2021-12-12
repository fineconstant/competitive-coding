package com.fineconstant.algscala

object PalindromeNumber {
  object Solution {
    def isPalindrome(x: Int): Boolean = {
      if (x < 0) false
      else {
        val stringNumber = x.toString
        stringNumber == stringNumber.reverse
      }
    }
  }
}
