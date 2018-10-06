object NewtonsMethod extends App {
  def sqrt(x: Double) = sqrtIter(1, x)

  def square(x: Double) = x * x

  def isGoodEnough(y: Double, x: Double): Boolean = Math.abs(square(y) - x) < 0.001

  def improve(y: Double, x: Double) = (y + x / y) / 2

  def sqrtIter(y: Double, x: Double): Double = if (isGoodEnough(y, x)) y else sqrtIter(improve(y, x), x)

  println(sqrt(9))
  println(sqrt(25))
}
