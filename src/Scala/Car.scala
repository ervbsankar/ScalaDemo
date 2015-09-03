package Scala

class Car(val year:Int, var miles: Int){
  println("creating car")

  def this(year: Int) = {
    this(year, 0)
  }

  def drive(dist: Int) = {
    miles+= dist
  }
}
object Car {
  def count()  {
  }
}


