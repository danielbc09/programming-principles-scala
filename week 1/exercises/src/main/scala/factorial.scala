def factorial(n: Int) : Int =
  if (n == 0) 1
  else n * factorial(n -1)


@main def testFactorial = {
  println("factorial 5 ")
  println(factorial(5))

  println("factorial 7 ")
  println(factorial(7))

  println("factorial 10 ")
  println(factorial(10))
}