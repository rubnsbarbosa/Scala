package Functions

object Function {

  def add(x:Int, y:Int): Int = {
    return x + y;
  }

  def sub(x:Int, y:Int): Int = {
    x - y;
  }

  def multiply(x:Int, y:Int): Int = x * y;

  object MathSum {
    def add(x:Int, y:Int): Int = {
      return x + y;
    }
  }

  def main(args: Array[String]) {
    println(add(95,5));
    println(sub(95,5));
    println(multiply(9,9));
    println(MathSum.add(80,20));
  }

}
