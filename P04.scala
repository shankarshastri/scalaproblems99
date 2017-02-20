// Start writing your ScalaFiddle code here
import scala.collection.immutable.List
import scala.annotation.tailrec

object Main {

  @tailrec def length(k:List[Int], a:Int):Int = {
  	k match {
  		case Nil => a
  		case head::tail => length(tail,a+1)
  		case _ => 0
  	}
  }
  def main(args: Array[String]): Unit = {
    val k = List(1,2,3)
    println(length(k,0))
  }
}
