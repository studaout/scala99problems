package studaout.scala99

/**
  * Find the last element of a list.
  */
object P01 {

  def lastBuiltIn[A](l:List[A]) : A =  l.last

  def last[A](list: List[A]) : A = list match {
    case Nil => throw new NoSuchElementException
    case e::Nil => e
    case _ :: tail => last(tail)
  }
}
