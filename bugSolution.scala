```scala
class MyClass(var x: Int) {
  def myMethod(y: Int): Int = {
    x += y
    x
  }
}

object Main extends App {
  val obj = new MyClass(5)
  println(obj.myMethod(10)) // Output: 15
  println(obj.x) // Output: 15
}
```