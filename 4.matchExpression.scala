package MatchExpression

object scala {
  def main(args: Array[String]): Unit = {
       var age=21
       age match {
         case 12=>println("Incorrect")
         case 15=>println("Incorrect")
         case 25=>println("Incorrect")
         case 21=>println("Correct")
         case _=>println("default")
       }
      var i=8
      i match {
        case 1 | 3 | 5 | 7 | 9=>println("odd")
        case 2 | 4 | 6 |8 => println("even")
      }

  }

}
