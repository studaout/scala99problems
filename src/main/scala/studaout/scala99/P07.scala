package studaout.scala99

/**
  * Flatten a nested list structure.
  */
object P07 {

  def flatten(list: List[Any]) : List[Any] = list.flatMap{
    case l:List[_] => flatten(l)
    case a => List(a)
  }

}
