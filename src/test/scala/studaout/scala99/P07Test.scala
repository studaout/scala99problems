package studaout.scala99

import org.scalatest.FlatSpec
import studaout.scala99.P07._

class P07Test extends FlatSpec {

  "Nil" should "should return Nil" in {
    assert(flatten(Nil) === Nil)
  }

  it should "return List(1) if List(List(1))" in {
    assert(flatten(List(List(1))) === List(1))
  }

  it should "return List(1,2,3,4,5) if List(List(1), List(2,3), List(4,5))" in {
    assert( flatten(List(List(1),List(2,3),List(4,5))) === List(1,2,3,4,5))
  }

  it should "return List(1,2,3,4,5,6,7,8,9,10) if List(List(1), List(2,3),4,List(5,6), List(7,8,9,10)" in {
    assert( flatten(List(List(1),List(2,3),4,List(5,6), List(7,8,9,10))) === List(1,2,3,4,5,6,7,8,9,10))
  }


}
