package me.serizawa

object P06 {
  def isPalindrome[T](list: List[T]): Boolean = {
    list == list.reverse
  }
}
