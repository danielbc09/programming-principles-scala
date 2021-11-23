def gcd(a: Int, b : Int) : Int = {
  if (b == 0) a
  else gcd(b, a % b)
}

@main def tesEuclid = {
  println("Test 1 ")
  println(gcd(5, 6))

  println("Test 2 ")
  println(gcd(7, 10))

  println("Test 3 ")
  println(gcd(14, 21))
}