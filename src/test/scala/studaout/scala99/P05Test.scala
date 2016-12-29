package studaout.scala99

import org.scalatest.FlatSpec
import studaout.scala99.P05._

class P05Test extends FlatSpec {

  "Nil" should "should return Nil" in {
    assert(reverse(Nil) === Nil)
  }

  it should "return List(1)" in {
    assert(reverse(List(1)) === List(1))
  }

  it should "return List(5,4,3,2,1)" in {
    assert(reverse(List(1,2,3,4,5)) === List(5,4,3,2,1))
  }

  it should "return List(100000000 to 0)" in {
    val l = (0 to 100000000).toList
    assert(reverse(l) === (100000000 to 0 by -1).toList)
  }

}
