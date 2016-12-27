package studaout.scala99

/**
  * Find the number of elements of a list.
  */
object P04 {

  def length[A](list: List[A]) : Int = {
    def l(c: Int, lst: List[A]) : Int = lst match {
      case Nil => c
      case h :: tail =>  l(c+1, tail)
    }
    l(0, list)
  }

  def length1[A](list: List[A]) : Int = list.foldLeft(0) ( (c, e) => c + 1 )

}
