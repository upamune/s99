package me.serizawa

object P04 {
//  def length[T](list: List[T]): Int = {
//    list.length
//  }

  def length[T](list: List[T], cnt: Int = 1): Int = list match {
    case (_ :: Nil) => cnt
    case (_ :: tail) =>{
      length(tail, cnt + 1)
    }
    case _ => 0
  }
}
