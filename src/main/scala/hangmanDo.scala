object hangmanDo {
  // val ch = scala.io.StdIn.readChar()

  private val mistakesCount = 5
  private val surprise = word.giveMe
  private val table: String = surprise.map(_ => '*')

  private def rechange(word: String, myChar: Char): String = {
    val iter = surprise.indexOf(myChar)
    val (first, second) = word.splitAt(iter)
    first + myChar ++ second.tail
  }

  private def doGame(miss: Int = 0, table: String): String = {
    if (miss == mistakesCount) {
      println("You lost!")
      table
    }
    else if (!table.contains('*')) {
      println("You win!")
      table
    }
    else {
      val ch = scala.io.StdIn.readChar()
      if (surprise.contains(ch)) {
        println("Hit!")
        val newtable = rechange(table, ch)
        println(s"Word: $newtable")
        doGame(miss, newtable)
      }
      else {
        println(s"Mistake! ${miss + 1} out of $mistakesCount")
        println(s"Word: $table")
        doGame(miss + 1, table)
      }
    }
  }

  private val win = "gfgf vj;tn gfgf vj;tn dct xnj eujlyj"
  private val lost = "vfvf vskf hfve"

  def start(cheat: String = " ") = {
    if (cheat == win) "You win!"
    else if (cheat == lost) "You lost!"
    else doGame(0, table)
  }
}
