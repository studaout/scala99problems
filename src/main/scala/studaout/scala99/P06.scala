package studaout.scala99

/**
  * Find out whether a list is a palindrome.
  */
object P06 {

  def isPalindrome[A](list: List[A]) : Boolean = {
    def f(l: List[A]) : Boolean = l match {
      case Nil => true
      case List(e) => true
      case _=> (l.head == l.last ) && f(l.tail.init)
    }
    f(list)
  }

  def isPalindrome1[A](list: List[A]) : Boolean = {
    def f(l: List[A]) : Boolean = l match {
      case Nil => true
      case List(e) => true
      case _=>
        val init :+ last = l
        val head +: tail = init
        ( last == head ) && f(tail)
    }
    f(list)
  }

  def isPalindrome2[A](list: List[A]) : Boolean = {
    list == list.reverse
  }

}
