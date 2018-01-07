import java.awt.image.BufferedImage
import javax.swing.{ImageIcon, JFrame, JLabel}

object Main {

  val width : Int = 720
  val height : Int = 405

  def main(args : Array[String]) : Unit = {
    println("Hello, grid!")

    val r : Renderer = new Renderer
    val v = r.testRender()
    println(v(1)(2))

    val frame : JFrame = new JFrame("Test")
    frame setDefaultCloseOperation JFrame.EXIT_ON_CLOSE
    frame setResizable false

    val label : JLabel = new JLabel()
    val im : BufferedImage = r render v
    label setIcon new ImageIcon(im)
    frame add label
    frame pack()
    frame setVisible true

  }

}
