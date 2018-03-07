package app

object RotateMatrix extends App{

  def apply(matrix: List[List[Int]], rotation: Int): List[List[Int]] = {
    (matrix, rotation) match {
      case (null, _) => null
      case (_, 0) => matrix
      case (m, _) if m.head.isEmpty => m
      case (m, t) => apply(m.transpose.reverse, t - 1)
    }
  }
  println(RotateMatrix(List(List(1,2),List(3,4)), 1))
}
