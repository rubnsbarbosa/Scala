package MatchExpressions

object MatchExpre {
  def main(args: Array[String]){

    val age:Int = 20;

    age match {
      case 20 => println(age);
      case 30 => println(age);
      case 40 => println(age);
      case 50 => println(age);

      case _ => println("default");
    }

    val x = 7;
    x match {
      case 1 | 3 | 5 | 7 | 9  => println("odd");
      case 2 | 4 | 6 | 8 | 10 => println("even");
    }

  }
}
