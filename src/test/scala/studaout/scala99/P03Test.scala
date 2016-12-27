package studaout.scala99

import org.scalatest.FlatSpec
import studaout.scala99.P03._

class P03Test extends FlatSpec {

  "Nil " should "throw NoSuchElementException" in {
    assertThrows[NoSuchElementException] {
      findKth(0, Nil)
    }
  }

  it should "throw NoSuchElementException if Empty" in {
    assertThrows[NoSuchElementException] {
      findKth(1, Nil)
    }
  }

  it should "throw NoSuchElementException if k > length" in {
    assertThrows[NoSuchElementException] {
      findKth(2, List(1,3))
    }
  }

  it should "return 5" in {
    assert(findKth(4, List(1,2,3,4,5)) === 5)
  }

  it should "return 4" in {
    assert(findKth(3, List(1,2,3,4,5,6)) === 4)
  }

  it should "return 100000000" in {
    val l = (0 to 100000000).toList
    assert(findKth(100000000, l) === 100000000)
  }

}
