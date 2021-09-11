private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readLong() = readLn().toLong()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }


fun main() {
    val n = readInt()

    for (i in 1..n) {
        val (a, b) = readInts()
        println(a + b)
    }
}
