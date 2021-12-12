package com.fineconstant.algscala

import RomanToInteger.Solution.romanToInt

class RomanToIntegerSpec extends UnitSpec {

  "RomainToInteger" should "return 1 for I" in {
    romanToInt("I") should be(1)
  }
  it should "return 2 for II" in {
    romanToInt("II") should be(2)
  }
  it should "return 3 for III" in {
    romanToInt("III") should be(3)
  }
  it should "return 4 for IV" in {
    romanToInt("IV") should be(4)
  }
  it should "return 5 for V" in {
    romanToInt("V") should be(5)
  }
  it should "return 6 for VI" in {
    romanToInt("VI") should be(6)
  }
  it should "return 7 for VII" in {
    romanToInt("VII") should be(7)
  }
  it should "return 8 for VIII" in {
    romanToInt("VIII") should be(8)
  }
  it should "return 9 for IX" in {
    romanToInt("IX") should be(9)
  }
  it should "return 10 for X" in {
    romanToInt("X") should be(10)
  }
  it should "return 11 for XI" in {
    romanToInt("XI") should be(11)
  }
  it should "return 12 for XII" in {
    romanToInt("XII") should be(12)
  }
  it should "return 13 for XIII" in {
    romanToInt("XIII") should be(13)
  }
  it should "return 14 for XIV" in {
    romanToInt("XIV") should be(14)
  }
  it should "return 15 for XV" in {
    romanToInt("XV") should be(15)
  }
  it should "return 16 for XVI" in {
    romanToInt("XVI") should be(16)
  }
  it should "return 17 for XVII" in {
    romanToInt("XVII") should be(17)
  }
  it should "return 18 for XVIII" in {
    romanToInt("XVIII") should be(18)
  }
  it should "return 19 for XIX" in {
    romanToInt("XIX") should be(19)
  }
  it should "return 20 for XX" in {
    romanToInt("XX") should be(20)
  }
  it should "return 25 for XXV" in {
    romanToInt("XXV") should be(25)
  }
  it should "return 29 for XXIX" in {
    romanToInt("XXIX") should be(29)
  }
  it should "return 40 for XL" in {
    romanToInt("XL") should be(40)
  }
  it should "return 49 for XLIX" in {
    romanToInt("XLIX") should be(49)
  }
  it should "return 50 for L" in {
    romanToInt("L") should be(50)
  }
  it should "return 60 for LX" in {
    romanToInt("LX") should be(60)
  }
  it should "return 90 for XC" in {
    romanToInt("XC") should be(90)
  }
  it should "return 100 for C" in {
    romanToInt("C") should be(100)
  }
  it should "return 120 for CXX" in {
    romanToInt("CXX") should be(120)
  }
  it should "return 1994 for MCMXCIV" in {
    romanToInt("MCMXCIV") should be(1994)
  }

}
