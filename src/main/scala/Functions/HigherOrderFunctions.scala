package Functions
/* Higher-order functions in Scala are those functions that take other functions as parameters,
  or whose result is a function (i.e are able to return functions) or do both. e.g. map & ﬁlter in Scala.
*/
object HigherOrderFunctions {

  def math(x:Double, y:Double, f:(Double, Double)=>Double): Double = f(x, y);

  def main(args: Array[String]): Unit = {
    val res = math(50,50, (x,y) => x+y );
    println(res);
    val _min = math(50,40, (x,y) => x min y );
    println(_min);
    val _max = math(50,40, (x,y) => x max y );
    println(_max);
  }

}
