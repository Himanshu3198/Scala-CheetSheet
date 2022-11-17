package Array.scala

object scala {
  def main(args: Array[String]): Unit = {
    var arr = new Array[Int](5);
    arr(0) = 5
    arr(1) = 10
    arr(2) = 15
    arr(3) = 20
    arr(4) = 25
    var len = arr.length
    for (i <- 0 to len - 1) {
      println(arr(i))
    }
//    multi dimensional array

//    var nums = Array.ofDim[Int](3, 3)
//    for (i <- 0 to 2) {
//      for (j <- 0 to 2) {
//        nums(i)(j) = j
//      }
//    }
//    for (i <- 0 to 2) {
//      for (j <- 0 to 2) {
//        print(nums(i)(j) + " ")
//      }
//      println("")
//    }

  }





}
