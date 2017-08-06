package me.serizawa

object P03 {
  def nth[T](idx: Int, list: List[T]): T = {
    list.apply(idx)
  }
}
