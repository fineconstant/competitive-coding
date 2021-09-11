import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ProblemCSpec : WordSpec({
    "it" should {
        "1 (5) -> 5"{
            ProblemC.run(listOf(5)).shouldBe(5)
        }
        "2 (3, 3) -> 2"{
            ProblemC.run(listOf(3, 3)).shouldBe(3)
        }
        "2 (1, 3) -> 2"{
            ProblemC.run(listOf(1, 3)).shouldBe(2)
        }
        "2 (1, 4) -> 3"{
            ProblemC.run(listOf(1, 4)).shouldBe(3)
        }
        "2 (1, 5) -> 3"{
            ProblemC.run(listOf(1, 5)).shouldBe(3)
        }
        "2 (1, 6) -> 4"{
            ProblemC.run(listOf(1, 6)).shouldBe(4)
        }
        "3 (1, 5, 15) -> 7"{
            ProblemC.run(listOf(1, 5, 15)).shouldBe(7)
        }
    }
})
