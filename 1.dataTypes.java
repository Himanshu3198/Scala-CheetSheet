package HelloWorld

object scala {
  def main(args: Array[String]): Unit = {
     println("hello scla..");
     val a=5:Int ;
     val b=10:Int;
     val str="himanshu";
     val str2="sharma":String;
     println(a+b);
     println(str+str2);
     var x=6
     var y=12
     println(x+y)
     val c='a':Char
     val d='b':Char
     var s=c+d;
     println(s);
    println(c)
    var x3={ var x1=5; var x2=1;x1+x2}
    println("this is x",x3)
    // lazy variable assign memory when it use
//    lazy  val x4=5;
    var f1=3.41;
    println(f1);

  }
}
