package app

import org.scalatest.{MustMatchers, WordSpec}

class RotateMatrixSpec extends WordSpec with MustMatchers {

  "RotateMatrix" must {

    "return [2, 2], [1, 1] when given [1, 2],[1, 2] and a rotation of 1" in {
      RotateMatrix(List(List(1, 2), List(1, 2)), 1) mustEqual List(List(2, 2), List(1, 1))
    }

    "return [2, 1], [2, 1] when given [1, 2],[1, 2] and a rotation of 2" in {
      RotateMatrix(List(List(1, 2), List(1, 2)), 2) mustEqual List(List(2, 1), List(2, 1))
    }

    "return [3, 3, 3], [2, 2, 2], [1, 1, 1] when given [1, 2, 3],[1, 2, 3], [1, 2, 3] and a rotation of 1" in {
      RotateMatrix(List(List(1, 2, 3), List(1, 2, 3), List(1, 2, 3)), 1) mustEqual List(List(3, 3, 3), List(2, 2, 2), List(1, 1, 1))
    }

    "return [1, 1, 1], [2, 2, 2], [3, 3, 3] when given [1, 2, 3],[1, 2, 3], [1, 2, 3] and a rotation of 3" in {
      RotateMatrix(List(List(1, 2, 3), List(1, 2, 3), List(1, 2, 3)), 3) mustEqual List(List(1, 1, 1), List(2, 2, 2), List(3, 3, 3))
    }
  }
}
