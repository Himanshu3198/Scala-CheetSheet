package StringInterpolation

object scala {
  def main(args: Array[String]): Unit = {
       var str="himanshu"
       var age=24
       println(s"$str is $age years old..")
       println(raw"this is \n himanshu")
        println(f"$str%s is $age%d years old..")
//        println(str.length())
        var len=str.length()
//    iteration over string
//        for(i<- 0 to len-1){
//          println(str.charAt(i))
//        }
//    substring method
      println(str.substring(0,5))  // himan
      println(str.substring(3,5))  // an
      println(str.substring(4))  //nshu

  }
}
