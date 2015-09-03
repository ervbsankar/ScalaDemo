package Scala

class SumSelector {

  def totalSelectValues(list : List[Int], selector : Int => Boolean) ={
    var sum = 0
    list.foreach{e =>
      if(selector(e))sum += e
    }
    sum
  }

  def map(list : List[Int]) ={
    list.map{
      e => e * 2
    }
  }
}
