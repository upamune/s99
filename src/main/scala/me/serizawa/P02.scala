package me.serizawa

import java.util.NoSuchElementException

object P02 {
  def penultimate(list: List[Int]): Int = {
    list.reverse.apply(1)
  }

  // パターンマッチ
//  def penultimate[T](list: List[T]): T = list match {
//    case x :: _ :: Nil => x
//    case _ :: y :: xs => penultimate(y :: xs)
//    case _ =>
//      sys.error("not enough list length")
//  }

}
