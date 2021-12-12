package com.fineconstant.algscala

object AddTwoNumbers {

  case class ListNode(var x: Int = 0, var next: ListNode = null)

  /** https://leetcode.com/problems/add-two-numbers/
    */
  object Solution {
    def addTwoNumbers(a: ListNode, b: ListNode): ListNode = {
      val head     = new ListNode(0)
      var pointer  = head
      var currentA = a
      var currentB = b
      var carry    = 0

      while (currentA != null || currentB != null) {
        val x     = if (currentA == null) 0 else currentA.x
        val y     = if (currentB == null) 0 else currentB.x
        val sum   = x + y + carry
        val digit = sum % 10
        carry = sum / 10

        pointer.x = digit

        currentA = if (currentA == null) null else currentA.next
        currentB = if (currentB == null) null else currentB.next

        if (currentA != null || currentB != null) {
          pointer.next = new ListNode(0)
          pointer = pointer.next
        }
      }

      if (carry != 0) pointer.next = new ListNode(carry)

      head
    }
  }

  object SolutionMemoryLimitExceeded{
    def addTwoNumbers(a: ListNode, b: ListNode): ListNode = {
      val head     = new ListNode(0)
      var pointer  = head
      var currentA = a
      var currentB = b
      var carry    = 0

      while (currentA != null && currentB != null) {
        val sum   = currentA.x + currentB.x + carry
        val digit = sum % 10
        carry = sum / 10

        pointer.x = digit

        currentA = currentA.next
        currentB = currentB.next

        if (!(currentA == null && currentB == null && carry == 0)) {
          pointer.next = new ListNode(0)
        }
        pointer = pointer.next
      }

      while (currentA != null && currentB == null) {
        val sum   = currentA.x + carry
        val digit = sum % 10
        carry = sum / 10

        pointer.x = digit

        currentA = currentA.next

        if (!(currentA == null && carry == 0)) {
          pointer.next = new ListNode(0)
        }

        pointer = pointer.next
      }

      while (currentA == null && currentB != null) {
        val sum   = currentB.x + carry
        val digit = sum % 10
        carry = sum / 10

        pointer.x = digit

        currentA = currentB.next

        if (!(currentB == null && carry == 0)) {
          pointer.next = new ListNode(0)
        }
        pointer = pointer.next
      }

      if (currentA == null && currentB == null && carry != 0) {
        pointer.x = carry
      }
      head
    }
  }
}
