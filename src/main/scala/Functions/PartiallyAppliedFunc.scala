package Functions

object PartiallyAppliedFunc {

  def main(args: Array[String]) {
    // fully applied func
    val sum = (a:Int, b:Int, c:Int) => a + b + c;
    println(sum(20,30,40));

    // partially applied func
    val f = sum(30, 30, _:Int)
    println(f(30))
  }

}
