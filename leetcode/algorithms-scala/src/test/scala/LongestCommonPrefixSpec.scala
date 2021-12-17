package com.fineconstant.algscala

import LongestCommonPrefix.Solution.longestCommonPrefix

class LongestCommonPrefixSpec extends UnitSpec {
  "LongestCommonPrefix" should "be fl" in {
    longestCommonPrefix(Array("flower", "flow", "flight")) should be("fl")
  }

  it should "be empty" in {
    longestCommonPrefix(Array("dog", "racecar", "car")) should be("")
  }
}
