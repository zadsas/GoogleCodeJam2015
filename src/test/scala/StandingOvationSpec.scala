import org.scalatest.{Matchers, WordSpecLike}

class StandingOvationSpec extends WordSpecLike with Matchers {

  "The audience" should {

    "stand up on its own" in new StandingOvation {
      solution(Seq(1)) shouldBe 0
      solution(Seq(1,1)) shouldBe 0
      solution(Seq(2,0,1)) shouldBe 0
    }

    "require extra friends" in new StandingOvation {
      solution(Seq(0,1)) shouldBe 1
      solution(Seq(0,0,1)) shouldBe 2
      solution(Seq(0,1,1)) shouldBe 1
      solution(Seq(0,0,0,0,1000)) shouldBe 4
      solution(Seq(999,1000)) shouldBe 0
      solution(Seq(1,0,1)) shouldBe 1
      solution(Seq(1,0,1000)) shouldBe 1
    }

    "hold for given examples" in new StandingOvation {
      solution(Seq(1,1,1,1,1)) shouldBe 0
      solution(Seq(0,9)) shouldBe 1
      solution(Seq(1,1,0,0,1,1)) shouldBe 2
      solution(Seq(0,0,0,0,0,0,7,8,5,0,0,4,4)) shouldBe 6
      solution(Seq(0,1,2,3,4,5,6)) shouldBe 1
    }

  }

}
