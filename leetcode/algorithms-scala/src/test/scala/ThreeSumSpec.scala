package com.fineconstant.algscala

class ThreeSumSpec extends UnitSpec {

  "threeSum" should "pass basic example" in {
    val input = Array(-1, 0, 1, 2, -1, -4)

    val actual = ThreeSum.Solution.threeSum(input)

    val expected = List(List(-1, -1, 2), List(-1, 0, 1))
    actual should contain allOf (List(-1, -1, 2), List(-1, 0, 1))
  }

  it should "return empty" in {
    val input = Array.empty[Int]

    val actual = ThreeSum.Solution.threeSum(input)

    val expected = List()
    actual shouldBe expected
  }

  it should "return empty for zero" in {
    val input = Array(0)

    val actual = ThreeSum.Solution.threeSum(input)

    val expected = List()
    actual shouldBe expected
  }
}
