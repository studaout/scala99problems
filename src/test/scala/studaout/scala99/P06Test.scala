package studaout.scala99

import org.scalatest.FlatSpec
import studaout.scala99.P06._

class P06Test extends FlatSpec {

  "Nil" should "should return true" in {
    assert(isPalindrome(Nil) === true)
  }

  it should "return true if List(1)" in {
    assert(isPalindrome(List(1)) === true)
  }

  it should "return true if List(1,1)" in {
    assert(isPalindrome(List(1,1)) === true)
  }

  it should "return false if List(1,2)" in {
    assert(isPalindrome(List(1,2)) === false)
  }

  it should "return true if List(1,2,2,1)" in {
    assert(isPalindrome(List(1,2,2,1)) === true)
  }

  it should "return true if List(5,4,3,4,5)" in {
    assert(isPalindrome(List(5,4,3,4,5)) === true)
  }

  it should "return false if List(1,2,3,4,5)" in {
    assert(isPalindrome(List(1,2,3,4,5)) === false)
  }

}
