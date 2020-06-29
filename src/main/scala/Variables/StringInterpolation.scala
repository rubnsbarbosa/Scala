package Variables

object StringInterpolation {

  def main(args: Array[String]) {
    val name = "Scala"
    val year = 2020

    println(name + " in " + year + ".")
    println(s"$name in $year.")
    println(f"$name%s in $year%d.")

    println(s"Hello \nScala")
    println(raw"Hello \nScala")

  }

}
