package recfun

object weekOneRecurssion {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c < 0 || r < 0 || c > r + 1) return 0

    if (c == 0 && r == 0) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {

    def parenthesis(opened: Int, chars: List[Char]): Boolean = {
      if (chars.isEmpty) {
        if (opened == 0) return true
        else return false
      }

      if (chars.head == ')' && opened > 0) parenthesis(opened - 1, chars.tail)
      else
      if (chars.head == ')' && opened == 0) false
      else
      if (chars.head == '(') parenthesis(opened + 1, chars.tail)
      else
        parenthesis(opened, chars.tail)

      }

    parenthesis(0, chars)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    def loop(money: Int, coins: List[Int], count: Int = 0): Int = {
      money match {
        case 0 => count + 1
        case x if x < 0 => count
        case _ => loop(money - coins.head, coins, count + countChange(money, coins.tail))
      }
    }

    if (money == 0) 1
    else if (money < 0 || coins.isEmpty) 0
    else loop(money, coins)
  }
}
