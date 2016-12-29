package studaout.scala99

/**
  * Reverse a list.
  */
object P05 {

  def reverse[A](list: List[A]) : List[A] = {
    def f(l: List[A], res: List[A]): List[A] = {
      l match {
        case Nil => res
        case h::tail => f(tail, h::res)
      }
    }
    f(list, Nil)
  }

  def reverseFold[A](list: List[A]) : List[A] = list.foldLeft(List[A]()) ( (r,e) => e::r)

}
