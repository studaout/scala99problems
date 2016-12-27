package studaout.scala99

/**
  * Find the Kth element of a list. By convention, the first element in the list is element 0.
  */
object P03 {

  def findKth[A](k:Int, list: List[A] ) : A = (k, list) match {
    case (0, h::_) => h
    case (i, h :: tail) if i > 0 => findKth(i-1, tail)
    case _ => throw new NoSuchElementException
  }

}
