import java.io._

trait StandingOvation {
  def solution(shynessLevels: Seq[Int]) = {
    var willStand = shynessLevels.head
    var extra = 0
    shynessLevels.zipWithIndex.drop(1).foreach { case (people, othersNeeded) =>
      if (people>0 && othersNeeded>willStand) {extra+=othersNeeded-willStand;willStand=othersNeeded}
      willStand +=people
    }
    extra
  }
}

object RunStandingOvation extends StandingOvation {

  def printToFile(f: File)(op: PrintWriter => Unit) {
    val p = new PrintWriter(f)
    try { op(p) } finally { p.close() }
  }

  def main(args:Array[String]):Unit = {

    val problemLines = io.Source.fromInputStream(getClass.getResourceAsStream("A-large-practice.in")).getLines.toList

    val solutionLines = (1 to problemLines(0).toInt).map { line =>
      val shynessLevels = problemLines(line).split(" ")(1).sliding(1).toList.map(_.toInt)
      s"Case #${line}: ${solution(shynessLevels)}"
    }

    printToFile(new File("solution.txt")) { p =>
      solutionLines.foreach(p.println)
    }
  }
}
