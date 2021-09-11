import scala.collection.mutable

object ValidBrackets {
  def apply(x: String): Set[String] =
    if (isValid(x)) Set(x) else buildPropositions(x)

  private def buildPropositions(x: String): Set[String] =
    (for (
      (char, idx) <- x.zipWithIndex
      if Set('(', ')', '{', '}', '[', ']').contains(char);
      proposition = new StringBuilder(x).deleteCharAt(idx).toString()
      if isValid(proposition)
    ) yield proposition).toSet

  //private def buildPropositions(x: String): Set[String] = {
  //  x.zipWithIndex
  //    .filter { case (char, _) => Set('(', ')', '{', '}', '[', ']').contains(char) }
  //    .map { case (_, idx) =>
  //      val possibleNew = new StringBuilder(x)
  //        .deleteCharAt(idx)
  //        .toString()
  //
  //      (possibleNew, isValid(possibleNew))
  //    }
  //    .filter { case (_, isValid) => isValid }
  //    .map { case (word, _) => word }
  //    .toSet
  //}

  private def isValid(x: String): Boolean = {
    val buffer = mutable.Stack.empty[Char]

    x.foreach {
      case char @ ('(' | '{' | '[') => buffer.push(char)
      case char @ (')' | '}' | ']') =>
        if (buffer.isEmpty) return false
        if (buffer.top == openingBrackets(char)) buffer.pop()
        else return false
      case _ =>
    }
    if (buffer.isEmpty) true else false
  }

  val openingBrackets = Map(')' -> '(', '}' -> '{', ']' -> '[')

}
