import scala.annotation.tailrec

def square(x: Double) = x * x
def abs(x: Double) = if (x < 0) -x else x

@tailrec
def sqrtIteration(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess
  else sqrtIteration(improve(guess, x), x)

def isGoodEnough(guess: Double, x: Double) = abs(square(guess) - x) < 0.001

def improve(guess: Double, x: Double) = (guess + x / guess) / 2

def sqrt(x: Double) = sqrtIteration(1.0, x)

@main def testSquareRoot = println(sqrt(2))