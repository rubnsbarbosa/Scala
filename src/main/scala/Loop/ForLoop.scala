package Loop

object ForLoop {
  def main(args: Array[String]) {
    // for (var <- range)

    for (i <- 1 to 5) {
      println("i = "+ i);
    }

    for (i <- 1.until(6)) {
      println("i = "+ i);
    }

    for (i <- 1 to 3 ; j <- 1 to 3) {
      println("i = "+ i + " j = " + j);
    }

    val lst = List(1,2,3,4,5,5,4,3,2,1);
    for (i <- lst; if i <= 3) {
      println("list = "+ i);
    }

    val res = for {i <- 1.to(5)} yield {
      i * i
    }
    println(res);

  }
}
