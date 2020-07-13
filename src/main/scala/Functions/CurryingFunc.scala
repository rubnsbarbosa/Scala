package Functions
/* Currying is the technique of transforming a function  that takes multiple arguments into a function
   that takes a single argument. */

object CurryingFunc {

  def add(x:Int, y:Int) = x + y;

  def add2(x:Int) = (y:Int) => x + y

  def main(args: Array[String]): Unit = {
    println(add(5,5))

    println(add2(5)(5))

    val sum20 = add2(20)
    println(sum20(20))
  }

}
