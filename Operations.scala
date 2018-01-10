class Operations {


  def addList(myList1: scala.List[Int], myList2: scala.List[Int]): List[Int] = {

    if (myList1.length == myList2.length) {

      val sumList = for (i <- 0 until myList1.length) yield myList1(i) + myList2(i)
      val opList = sumList.toList
      opList
    }
    return List(-1)


  }

  def reverse(myList: scala.List[Int]): List[Int] = {
    val result = for (i <- myList.length - 1 until -1 by -1) yield myList(i)
    result.toList
  }


  def doubleList(myList: scala.List[Int]): List[Int] = {
    myList.map(x => x + x)

  }


  def numberOfElements(myList: scala.List[Int], length: Int): Int = {
    myList match {

      case head :: tail => numberOfElements(tail, length + 1)
      case head :: Nil => length + 1
      case _ => length
    }
  }


  def kthElement(myList: List[Int], k: Int): Int = {

    myList(k)
  }


  def fibonacci(first: Int, second: Int, n: Int): Int = {

    n match {
      case 0 => first
      case 1 => second
      case _ => fibonacci(second, first + second, n - 1)

    }

  }
}


object TestOperations extends App {
  val Obj = new Operations
  val first = 10
  val second = 20
  val third = 30
  val fourth = 40
  val five = 50
  val six = 60
  val seven = 70
  val myList = List(first, second, third, fourth)
  val myList1 = List(five, six, seven)
  println(myList.length)
  println(Obj.addList(myList, myList1))
  println(Obj.kthElement(myList, 2))
  println(Obj.doubleList(myList))
  println(Obj.numberOfElements(myList, 0))
  println(Obj.fibonacci(0, 1, 8))
  println(Obj.reverse(myList))
}
