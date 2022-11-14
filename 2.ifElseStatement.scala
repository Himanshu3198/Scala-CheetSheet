object IfElse {
  def main(args: Array[String]): Unit = {
       var x=18
       if(x>=18){
         println("x is adult")
       }else{
         println("x is minor")
       }
      var res= if(x==50) "senior citizen" else "not a senior citizen"
      println(res)
  }
}
