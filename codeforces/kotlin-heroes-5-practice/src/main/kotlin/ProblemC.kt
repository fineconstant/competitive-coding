import kotlin.math.ceil

private fun readLn() = readLine()!!
private fun readInt() = readLn().toInt()
private fun readLong() = readLn().toLong()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }


fun main() {
    val q = readInt()

    for (i in 1..q) {
        readInt() // discard n
        val az = readInts()
        println(ProblemC.run(az))
    }
}

object ProblemC {
    fun run(az: List<Int>): Int {
        val avg = az.average()
        return ceil(avg).toInt()
    }
}
