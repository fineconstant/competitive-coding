package com.fineconstant.algscala

import PalindromeNumber.Solution.isPalindrome

class PalindromeNumberSpec extends UnitSpec {
  "PalindromeNumber" should "return true for a 121 in" in {
    isPalindrome(121) should be(true)
  }

  it should "return false for a 123" in {
    isPalindrome(123) should be(false)
  }

  it should "return false for a -121" in {
    isPalindrome(-121) should be(false)
  }
}
