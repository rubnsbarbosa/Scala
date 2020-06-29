package Variables

/* Data Types
Byte: 8 bit signed value. Range from -128 to 127
Short: 16 bit signed value. Range -32768 to 32767
Int: 32 bit signed value. Range -2147483648 to 2147483647
Long: 64 bit signed value. -9223372036854775808 to 9223372036854775807
Float: 32 bit IEEE 754 single-precision float
Double: 64 bit IEEE 754 double-precision float
Char: 16 bit signed Unicode character. Range from U+0000 to U+FFFF
String: A sequence of Chars
Boolean: Either the literal true or the literal false

Unit: Corresponds to no value : void
Null: null or empty reference
Nothing : The subtype of every other type; includes no values Any: The supertype of any type; any object is of type
Any : Java's Object class
AnyRef: The supertype of any reference type
*/

object Variable {
  // mutable variable (the variable value can be changed)
  var a:Int = 12
  println(a+30)

  var ct: Boolean = true
  var cf = true

  // immutable variable (the variable value cannot be changed)
  val b:Int = 30
  println(b)
  val pi = 3.14f
  val d = 12.3

  val x: Int = {val a:Int = 2; val b:Int = 3; a+b  }
  println(x)

  def main(args: Array[String]) {
    lazy val x = 500
    println(x)
  }
}
