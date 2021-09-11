private fun readLn() = readLine()!!
private fun readShort() = readLn().toShort()
private fun readInt() = readLn().toInt()
private fun readLong() = readLn().toLong()
private fun readStrings() = readLn().split(" ")
private fun readInts() = readStrings().map { it.toInt() }


fun main() {
    // (1 <= t <= 10^4)
    val t = readShort()

    for (i in 1..t) {
        val n = readInt()
        println(ProblemB.run(n))
    }
}

object ProblemB {
    private val cache = HashMap<Int, Int>(10000, 1f)

    fun run(n: Int): Int = cache.computeIfAbsent(n) { run(n, 1) }

    private tailrec fun run(n: Int, i: Int): Int {
        if (n < 3) return 0

        if (n <= i + 3) // this is the last iteration
            return i

        return run(n - 1, i + 1)
    }

    tailrec fun tooSlowD(n: Int, i: Int = 1): Int {
        if (n < 3) return 0

        if (n <= i + 3) // this is the last iteration
            return i

        return tooSlowD(n - 1, i + 1)
    }

    fun tooSlowC(n: Int): Int {
        if (n <= 2) return 0

        return generateSequence(n - 1) { it - 1 }
            .zip(generateSequence(1) { it + 1 })
            .dropWhile { (a, b) -> a > b }
            .first().second - 1
    }

    fun tooSlowB(n: Int): Int {
        if (n <= 2) return 0

        return generateSequence(Pair(n - 1, 1)) { (n, idx) ->
            if (n <= idx + 2) null else Pair(n - 1, idx + 1)
        }.last().second
    }

    fun tooSlowA(n: Int): Int {
        if (n <= 2) return 0

        return generateSequence(Pair(n - 1, 1)) { (n, idx) ->
            if (n - 1 <= idx + 1) null else Pair(n - 1, idx + 1)
        }.count()
    }
}

