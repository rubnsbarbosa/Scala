package Functions

object AnonymousFunctions {

  object MathSum {
    def +(x:Int = 80, y:Int = 20): Int = {
      return x + y;
    }
    def **(x:Int): Int = x * x;
  }

  def main(args: Array[String]): Unit = {
    // anonymous func
    var add = (x:Int, y:Int) => x + y;
    println(add(50,50));

    println(MathSum.+(85));
    println(MathSum.**(20));
  }

}
