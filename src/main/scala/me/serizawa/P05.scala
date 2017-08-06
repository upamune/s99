package me.serizawa

object P05 {

  def reverse[T](list: List[T]): List[T] = list match {
    case h :: t => reverse(t) ::: List(h)
    case Nil => Nil
  }

}
