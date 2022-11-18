package setInScala
//import scala.collection.mutable._
import collection.mutable.Set

object scala {
  def main(args: Array[String]): Unit = {
           val st:Set[Int]=Set(1,2,3,4,5,4,6,7,8,9,4);
//           println(st)
           println(st.head)

           println(st.tail)

          println(st.max)

          st.foreach(println)

          println(st(4))

         var lis=st.filter(_==4)
         println(lis)
         st.remove(4);
    
          st-=4
         st.add(55)
         println(st)





  }
}
