package functions

object scala {
   object Math{
     def sub(a: Int, b: Int) = a - b

     def divide(a: Int, b: Int): Double = {
       a / b
     }
   }
  def voidFunc():Unit={
     println("this is void function")
  }
  def add(a:Int,b:Int):Int={
    return a+b;
  }

  def main(args: Array[String]): Unit = {

      voidFunc() ; 1 until 10
      println(add(12,8))
      println(Math.sub(12,4))
      println(Math.divide(14,3))
  }
}
