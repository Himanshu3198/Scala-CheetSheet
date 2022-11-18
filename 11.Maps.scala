package mapInScala

import collection.mutable.Map

object scala {
  def main(args: Array[String]): Unit = {
    val mp: Map[Int, String] = Map((1, "hs"), (2, "rs"), (3, "js"))
    println(mp)

    println(mp.keys)

    println(mp.values)

    println(mp.contains(2))
    mp.keys.foreach(key => {
      println("keys", key)
      println("values", mp(key))
    })
    mp.remove(2)
    println(mp)
    println(mp.tail);
    mp.addOne((2, "rs"))
    println(mp)
    val arr = mp.toArray
    //    println("this arr",arr)
    for (itr < - arr) {
      println(itr)
    }
  }
}
