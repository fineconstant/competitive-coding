package com.fineconstant.algscala

/** https://leetcode.com/problems/roman-to-integer/
  */
object RomanToInteger {

  import scala.collection.mutable

  object Solution {
    val RomanValues = Map(
      'I' -> 1,
      'V' -> 5,
      'X' -> 10,
      'L' -> 50,
      'C' -> 100,
      'D' -> 500,
      'M' -> 1000
    )

    def sumValues(stack: mutable.Stack[Char]): Int = {
      stack.popAll().foldLeft(0) { case (acc, c) => acc + RomanValues(c) }
    }

    def romanToInt(roman: String): Int = {
      val stack  = mutable.Stack.empty[Char]
      var result = 0
      roman.foreach {
        case c @ 'I' =>
          if (stack.nonEmpty && (RomanValues(stack.top) > RomanValues(c)))
            result += sumValues(stack)
          stack.push(c)
        case c @ _   =>
          if (stack.nonEmpty && (RomanValues(stack.top) > RomanValues(c))) {
            result += sumValues(stack)
            stack.push(c)
          } else if (stack.nonEmpty && (RomanValues(stack.top) < RomanValues(c)))
            result += RomanValues(c) - sumValues(stack)
          else
            stack.push(c)
      }

      result = stack.foldLeft(result) { case (acc, c) =>
        acc + RomanValues(c)
      }

      result
    }
  }
}
