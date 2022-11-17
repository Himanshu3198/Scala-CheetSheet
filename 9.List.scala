package ListInscala

object scala {
    def main(args: Array[String]): Unit = {
        var lis: List[String] = List("apple", "banana", "mango", "strawberry","mango","mango","mango")
        println(lis)
        println(lis.size)
        println(lis.reverse)
//        create a new list with same element
        var newLis=List.fill(10)(2)
        println(newLis)
//        filter element and return in form of list
        var filters=lis.filter(_=="mango");
        println(filters)
//        sorting a list
        println(lis.sorted)



    }

}
