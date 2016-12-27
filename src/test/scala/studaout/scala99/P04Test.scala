package studaout.scala99

import org.scalatest.FlatSpec
import studaout.scala99.P04._

class P04Test extends FlatSpec {

  "Nil" should "should return 0" in {
    assert(length(Nil) === 0)
  }

  it should "return 1" in {
    assert(length(List(1)) === 1)
  }

  it should "return 5" in {
    assert(length(List(1,2,3,4,5)) === 5)
  }

  it should "return 100000000" in {
    val l = (0 until 100000000).toList
    assert(length(l) === 100000000)
  }

}
