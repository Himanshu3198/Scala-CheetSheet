package AnonymousFunction

object scala {

  object math{
    def +(x: Int, y: Int): Int = {
      x + y;
    }

    def /(x: Int = 10, y: Int = 5): Int = {
      x / y;
    }
  }


  def main(args: Array[String]): Unit = {

    // we can use operation as function name
     println(math.+(10,10))
    println(math./())
    val multiply=(x:Int,y:Int)=>{
      x*y
    }
    println(multiply(5,5))
  }

}
