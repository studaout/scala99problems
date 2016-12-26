package studaout.scala99

import org.scalatest.FlatSpec

import P01._

class P01Test extends FlatSpec {

  "Nil " should "throw NoSuchElementException" in {
    assertThrows[NoSuchElementException] {
      last(Nil)
    }
  }

  it should "throw NoSuchElementException if Empty" in {
    assertThrows[NoSuchElementException] {
      last(List())
    }
  }

  it should "return 1" in {
    assert(last(List(1)) === 1)
  }

  it should "return 10" in {
    assert(last(List(1,2,3,4,5,6,7,8,9,10)) === 10)
  }

  it should "return 100000000" in {
    val l = (1 to 100000000).toList
    assert(last(l) === 100000000)
  }

}
