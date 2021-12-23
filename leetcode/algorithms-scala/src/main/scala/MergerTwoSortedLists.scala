package com.fineconstant.algscala

/** https://leetcode.com/problems/merge-two-sorted-lists/
  */
object MergerTwoSortedLists {
  case class ListNode(var x: Int = 0, var next: ListNode = null)

  object Solution {
    def mergeTwoLists(xs: ListNode, ys: ListNode): ListNode = {
      import scala.collection.mutable
      if (xs == null && ys == null) return null

      var currentX = xs
      var currentY = ys

      val buffer = mutable.ListBuffer.empty[Int]

      while (currentX != null || currentY != null) {
        if (currentX != null) {
          buffer += currentX.x
          currentX = currentX.next
        }
        if (currentY != null) {
          buffer += currentY.x
          currentY = currentY.next
        }
      }

      buffer.sorted
        .map(new ListNode(_))
        .reduceRight((head: ListNode, tail: ListNode) => {
          head.next = tail
          head
        })
    }

    def mergeTwoListsImperative(xs: ListNode, ys: ListNode): ListNode = {
      if (xs == null && ys == null) return null

      var currentX = xs
      var currentY = ys

      val result        = new ListNode()
      var currentResult = result

      while (currentX != null || currentY != null) {
        val x = if (currentX != null) Some(currentX.x) else None
        val y = if (currentY != null) Some(currentY.x) else None

        x match {
          case Some(xValue) =>
            y match {
              case Some(yValue) =>
                if (xValue < yValue) {
                  currentResult.x = xValue
                  currentX = if (currentX == null) null else currentX.next
                } else {
                  currentResult.x = yValue
                  currentY = if (currentY == null) null else currentY.next
                }
              case None         =>
                currentResult.x = xValue
                currentX = if (currentX == null) null else currentX.next
            }
          case None         =>
            y match {
              case Some(yValue) =>
                currentResult.x = yValue
                currentY = if (currentY == null) null else currentY.next
              case None         =>
            }
        }

        if (currentX != null || currentY != null) {
          currentResult.next = new ListNode()
          currentResult = currentResult.next
        }
      }

      result
    }

  }
}
