import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.ints.shouldBeExactly
import io.kotest.matchers.shouldBe

class ProblemDSpec : WordSpec({
    "it" should {
        "5 2 2 -> abcde"{
            ProblemD.run(5, 2, 2).shouldBe("abcde")
        }
//        "5 4 2 -> abcde"{
//            ProblemD.run(5, 4, 2).shouldBe("abcde")
//        }
    }
})
