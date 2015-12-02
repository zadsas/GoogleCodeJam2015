import org.scalatest.{Matchers, WordSpecLike}

class OminousOminoSpec extends WordSpecLike with Matchers {

  "A 1-Omino game" should {
    "throw the following results" in new OminousOmino {
      solution(1, 1, 1) shouldBe "GABRIEL"
      solution(1, 2, 2) shouldBe "GABRIEL"
      solution(1, 2, 1) shouldBe "GABRIEL"
      solution(1, 4, 4) shouldBe "GABRIEL"
    }
  }

  "A 2-Omino game" should {
    "throw the following results" in new OminousOmino {
      solution(2, 1, 1) shouldBe "RICHARD"
      solution(2, 1, 2) shouldBe "GABRIEL"
      solution(2, 1, 3) shouldBe "RICHARD"
      solution(2, 1, 4) shouldBe "GABRIEL"
      solution(2, 2, 2) shouldBe "GABRIEL"
      solution(2, 2, 3) shouldBe "GABRIEL"
      solution(2, 2, 4) shouldBe "GABRIEL"
      solution(2, 3, 3) shouldBe "RICHARD"
      solution(2, 3, 4) shouldBe "GABRIEL"
      solution(2, 4, 4) shouldBe "GABRIEL"
    }
  }

  "A 3-Omino game" should {
    "throw the following results" in new OminousOmino {
      solution(3, 1, 1) shouldBe "RICHARD"
      solution(3, 1, 2) shouldBe "RICHARD"
      solution(3, 1, 3) shouldBe "RICHARD"
      solution(3, 1, 4) shouldBe "RICHARD"
      solution(3, 2, 2) shouldBe "RICHARD"
      solution(3, 2, 3) shouldBe "GABRIEL"
      solution(3, 2, 4) shouldBe "RICHARD"
      solution(3, 3, 3) shouldBe "GABRIEL"
      solution(3, 3, 4) shouldBe "GABRIEL"
      solution(3, 4, 4) shouldBe "RICHARD"
    }
  }

  "A 4-Omino game" should {
    "throw the following results" in new OminousOmino {
      solution(4, 1, 1) shouldBe "RICHARD"
      solution(4, 1, 2) shouldBe "RICHARD"
      solution(4, 2, 2) shouldBe "RICHARD"
      solution(4, 2, 3) shouldBe "RICHARD"
      solution(4, 2, 4) shouldBe "RICHARD"
      solution(4, 3, 3) shouldBe "RICHARD"
      solution(4, 3, 4) shouldBe "GABRIEL"
      solution(4, 4, 4) shouldBe "GABRIEL"
    }
  }

  "OminousOminoSpec" should {
    "hold for given examples" in new OminousOmino {
      solution(2, 2, 2) shouldBe "GABRIEL"
      solution(2, 1, 3) shouldBe "RICHARD"
      solution(4, 4, 1) shouldBe "RICHARD"
      solution(3, 2, 3) shouldBe "GABRIEL"
    }
  }

}
