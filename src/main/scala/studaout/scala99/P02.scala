package studaout.scala99

/**
  * Find the last but one element of a list.
  */
object P02 {

  def penultimate[A](list:List[A]) : A = {
    list match {
      case Nil => throw new NoSuchElementException
      case e::Nil => throw new NoSuchElementException
      case e1::e2::Nil => e1
      case e :: tail => penultimate(tail)
    }
  }

}
