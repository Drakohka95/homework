import org.scalatest.{Matchers, WordSpec}

class hangmanTest extends WordSpec with Matchers{

  "We cheather" should {
    "lose " in {
      hangmanDo.start("vfvf vskf hfve") shouldBe "You lost!"
    }
    "win" in {
      hangmanDo.start("gfgf vj;tn gfgf vj;tn dct xnj eujlyj") shouldBe "You win!"
    }
  }

  "We not play, but we" should {
    "lose " in {
      hangmanDo.doGame(5,"****n*") shouldBe "****n*"
    }
    "win" in {
      hangmanDo.doGame(4, "father") shouldBe "father"
    }
  }
}
