import java.io.{PrintWriter, File}

trait OminousOmino {
  def solution(X: Int, R: Int, C: Int) = {
    val min = X*(X-1)
    val mod = (R * C) % X == 0
    if (X<3) if (mod) "GABRIEL" else "RICHARD"
    else if (R*C>=min && mod) "GABRIEL" else "RICHARD"
  }
}

object RunOminousOmino extends OminousOmino {

  def printToFile(f: File)(op: PrintWriter => Unit) {
    val p = new PrintWriter(f)
    try { op(p) } finally { p.close() }
  }

  def main(args:Array[String]):Unit = {

    val problemLines = io.Source.fromInputStream(getClass.getResourceAsStream("D-large.in")).getLines.toList

    val solutionLines = (1 to problemLines(0).toInt).map { line =>
      val numbers = problemLines(line).split(" ").map(_.toInt)
      s"Case #${line}: ${solution(numbers(0), numbers(1), numbers(2))}"
    }

    printToFile(new File("solution.txt")) { p =>
      solutionLines.foreach(p.println)
    }
  }
}
