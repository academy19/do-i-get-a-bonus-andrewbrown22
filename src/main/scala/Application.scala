object Application {

  def calculateBonus(i: Int, bool: Boolean) : Double = {
   if(bool) {
     i * 1.2
   }
   else i
  }

  def main(args : Array[String]) : Unit = {
    println(calculateBonus(100, true))  // should print £120
    println(calculateBonus(100, false)) // should print £100
    println(calculateBonus(99, true))   // should print £118
  }
}