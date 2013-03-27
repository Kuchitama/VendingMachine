import scala.util.control.Exception._

object VendingMachine {

  def main(args : Array[String]) {
    while(true) {
      val input = readLine("input >")
      val command = input.split(" ")

      command(0) match {
        case "insert" => {
          println("inserted ¥%s".format(command(1)))
          sum += allCatch opt command(1).toInt getOrElse(0)
        }
        case "sum" => println(sum)
        case "exit" => sys.exit()
        case "payback" => sum = 0
        case _ => println("Invalid command[%s]".format(input))
      }

    }
    sys.exit
  }

  var sum:Int = 0

}
