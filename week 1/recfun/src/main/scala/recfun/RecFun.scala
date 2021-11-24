package recfun

object RecFun extends RecFunInterface :

  def main(args: Array[String]): Unit =
    println("Pascal's Triangle")
    for row <- 0 to 10 do
      for col <- 0 to row do
        print(s"${pascal(col, row)} ")
      println()

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (c == 0) return 1
    if (r == 0) return c
    else (r * pascal(c - 1, r - 1)) / c

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def balanced(chars: List[Char], open: Int): Boolean = {
      if (chars.isEmpty ) open == 0
      else if (open < 0) false
      else if (chars.head == '(') balanced(chars.tail, open + 1)
      else if (chars.head == ')') balanced(chars.tail, open - 1)
      else balanced(chars.tail, open)
    }

    balanced(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money == 0) 1
    else if (money < 0) 0
    else if (coins.isEmpty) 0
    else countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }
