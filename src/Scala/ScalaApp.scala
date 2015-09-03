package Scala

object ScalaApp extends Sample {
  override def main(args: Array[String]){
    println("Hello from ScalaApp")
    val car = new Car(2010)
    car drive 20
    /* Above is same as car.drive(20)*/
    println(car.year)
    println(car.miles)
    car.drive(10)
    println(car.miles)
    val sum = new Sum
    println("ForLoop: " + sum.total(List(1,2,3,4,5)))
    println("Function: " + sum.totalFunctional(List(1,2,3,4,5)))
    println("ForEach: " + sum.totalForEach(List(1,2,3,4,5,6)))
    println("Even: " + sum.totalEven(List(1,2,3,4,5,6)))
    val select = new SumSelector
    println(select.totalSelectValues(List(1,2,3,4,5,6),{e => true}))
    println(select.totalSelectValues(List(1,2,3,4,5,6),{e => e %2 == 0}))
    println(select.totalSelectValues(List(1,2,3,4,5,6),{_ > 4}))
    println(select.map(List(1,2,3,4,5,6)))
    }
}
