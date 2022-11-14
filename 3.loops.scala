package loops

object scala {
  def main(args: Array[String]): Unit = {
     var i=0;
//      while(i<10){
//        println(i);
//        i+=2;
//      }
//      for( i<- 1 to 10){
//         println(i)
//      }
      for(i<-1 to 10 by 2)
          println(i);
//     // iterater over list
      var list=List(1,2,3,4,5,6,7,8,9)
      for(i<-list) {
        println("print list",i)
      }
      // print even num in list
      for(i<-list; if i%2==0)
         println(i)
      var sumEven=0
       for{i<-list; if (i%2==0)} yield{
        sumEven=sumEven+i;
      }
      println("even sum is",sumEven)
  }
}
