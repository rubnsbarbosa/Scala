package Functions
/* A closures is a function which uses one or more variables
   declared outside this function. */
object Closures {
  val square:Int = 2
  val add = (x:Int) => x * square;

  def main(args: Array[String]): Unit = {
    println(add(2));
  }

}
