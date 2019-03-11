object NormalDistribution extends App {
  def normalDistribution (mu: Double, sigma: Double, x: Double): Double = {
    val firstValue: Double = 1 / (sigma * Math.sqrt(2 * Math.PI))
    val secondValue: Double =  Math.exp(- Math.pow(x - mu, 2) / 2 * Math.pow(sigma, 2))
    val result: Double = firstValue * secondValue

    result
  }
}
