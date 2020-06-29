package Loop

object WhileLoop {
  def main(args: Array[String]) {
    
    var x = 0;
    while(x < 5) {
      println("x = "+ x);
      x = x + 1;
    }

    println();

    var i = 0;
    do {
      println("i = "+ i);
      i += 1;
    } while (i < 5);

  }
}
