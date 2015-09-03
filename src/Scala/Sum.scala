package Scala

class Sum {
  /* Imperative way */
  def total(list: List[Int]) = {
    var sum = 0
    for (i <- list) {
      sum += i
    }
    sum
  }

  /* Functional way*/
  def totalFunctional(list: List[Int]) = {
    /* list.foldLeft(0) { (carryOver, e) =>
       carryOver + e
     }*/
    list.sum
  }

  /*forecah */

  def totalForEach(list: List[Int]) = {
    var sum = 0
    list.foreach {
      e => sum += e
    }
    sum
  }

  def totalEven(list: List[Int]) = {
    var sum = 0
    list.foreach {
      e =>
        if(e % 2 == 0) {sum += e}
    }
    sum
  }


}
