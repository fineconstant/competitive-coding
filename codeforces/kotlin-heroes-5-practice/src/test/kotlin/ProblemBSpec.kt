import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class ProblemBSpec : WordSpec({
    "it" should {
        "1 -> 0"{
            ProblemB.run(1).shouldBe(0)
        }
        "2 -> 0"{
            ProblemB.run(2).shouldBe(0)
        }
        "3 -> 1"{
            ProblemB.run(3).shouldBe(1) //21
        }
        "4 -> 1"{
            ProblemB.run(4).shouldBe(1) //31
        }
        "5 -> 2"{
            ProblemB.run(5).shouldBe(2) //41 32
        }
        "7 -> 3"{
            ProblemB.run(7).shouldBe(3) //61 52 43
        }
        "8 -> 3"{
            ProblemB.run(8).shouldBe(3) //71 62 53
        }
        "9 -> 4"{
            ProblemB.run(9).shouldBe(4) //81 72 63 54
        }
        "10 -> 4"{
            ProblemB.run(10).shouldBe(4) //91 82 73 64
        }
        "763 243 547 -> 381 621 773"{
            ProblemB.run(763_243_547).shouldBe(381_621_773)
        }
        "2 000 000 000 -> 999 999 999"{
            ProblemB.run(2_000_000_000).shouldBe(999_999_999)
        }
        "2 000 000 000 -> 999 999 999 multiple"{
            ProblemB.run(2_000_000_000).shouldBe(999_999_999)
            ProblemB.run(2_000_000_000).shouldBe(999_999_999)
            ProblemB.run(2_000_000_000).shouldBe(999_999_999)
            ProblemB.run(2_000_000_000).shouldBe(999_999_999)
        }
    }
})
