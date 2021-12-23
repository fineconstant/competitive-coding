package com.fineconstant.algscala

import MergerTwoSortedLists.ListNode
import MergerTwoSortedLists.Solution.mergeTwoLists

class MergerTwoSortedListsSpec extends UnitSpec {
  "MergerTwoSortedLists" should "sort empty lists" in {
    mergeTwoLists(null, null) should be(null)
  }

  it should "merge second list" in {
    mergeTwoLists(null, ListNode(1)) should be(ListNode(1))
  }

  it should "merge first list" in {
    mergeTwoLists(ListNode(1), null) should be(ListNode(1))
  }

  it should "merge two lists" in {
    mergeTwoLists(ListNode(1, ListNode(2, ListNode(3))),
                  ListNode(1, ListNode(3, ListNode(4)))) should be(
      ListNode(1, ListNode(1, ListNode(2, ListNode(3, ListNode(3, ListNode(4))))))
    )
  }
}
