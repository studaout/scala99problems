package studaout.scala99

import org.scalatest.FlatSpec
import studaout.scala99.P02._

class P02Test extends FlatSpec {

  "Nil " should "throw NoSuchElementException" in {
    assertThrows[NoSuchElementException] {
      penultimate(Nil)
    }
  }

  it should "throw NoSuchElementException if Empty" in {
    assertThrows[NoSuchElementException] {
      penultimate(List())
    }
  }

  it should "throw NoSuchElementException if single element" in {
    assertThrows[NoSuchElementException] {
      penultimate(List(1))
    }
  }

  it should "return 2" in {
    assert(penultimate(List(1,2)) === 1)
  }

  it should "return 10" in {
    assert(penultimate(List(1,2,3,4,5,6,7,8,9,10)) === 9)
  }

}
