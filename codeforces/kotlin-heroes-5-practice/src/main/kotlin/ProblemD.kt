private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readLong() = readLn().toLong()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }


fun main() {
    val t = readInt()

    for (i in 1..t) {
        val (n, a, b) = readInts()
        println(ProblemD.run(n, a, b))
    }
}

/**
 * n - length of string
 *
 * a - number of substrings
 *
 * b - unique letters per substring
 */
object ProblemD {
    fun run(n: Int, a: Int, b: Int): String {
//        val xs = List(n) { 0 }
        val xs = (0 .. n).toList()
        val windows = xs.windowed(b, 1, false).take(a)

        println(xs)
        println(windows)




        return xs.map { (it + 97).toChar() }
            .joinToString(separator = "")
    }
}
