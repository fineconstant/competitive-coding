package com.fineconstant.algscala

import AddTwoNumbers.ListNode

class AddTwoNumbersSpec extends UnitSpec {
  "addTwoNumbers" should "pass basic test" in {
    val a        = ListNode(2, ListNode(5))
    val b        = ListNode(2, ListNode(5))
    val expected = ListNode(4, ListNode(0, ListNode(1)))
    assert(AddTwoNumbers.Solution.addTwoNumbers(a, b) == expected)
  }

  it should "pass 1+2=3" in {
    val a        = ListNode(1)
    val b        = ListNode(2)
    val expected = ListNode(3)
    assert(AddTwoNumbers.Solution.addTwoNumbers(a, b) == expected)
  }

  it should "pass complex test" in {
    val a        = ListNode(2, ListNode(4, ListNode(3)))
    val b        = ListNode(5, ListNode(6, ListNode(4)))
    val expected = ListNode(7, ListNode(0, ListNode(8)))
    assert(AddTwoNumbers.Solution.addTwoNumbers(a, b) == expected)
  }

  it should "return zero for zero input" in {
    val a        = ListNode()
    val b        = ListNode()
    val expected = ListNode()
    assert(AddTwoNumbers.Solution.addTwoNumbers(a, b) == expected)
  }

  it should "add different numbers" in {
    val a        = ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9)))))))
    val b        = ListNode(9, ListNode(9, ListNode(9, ListNode(9))))
    val expected =
      ListNode(8, ListNode(9, ListNode(9, ListNode(9, ListNode(0, ListNode(0, ListNode(0, ListNode(1))))))))
    assert(AddTwoNumbers.Solution.addTwoNumbers(a, b) == expected)
  }
}
