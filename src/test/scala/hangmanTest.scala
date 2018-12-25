import org.scalatest.{Matchers, WordSpec}

class hangmanTest extends WordSpec with Matchers{
  "We" should {
    "lose " in {
      hangmanDo.start("vfvf vskf hfve") shouldBe "You lost!"
    }
    "win" in {
      hangmanDo.start("gfgf vj;tn gfgf vj;tn dct xnj eujlyj") shouldBe "You win!"
    }
  }
}
