import java.awt.Color
import java.awt.image.BufferedImage

import scala.util.Random


class Renderer {

  val colorMap : Vector[Color] = Vector(Color.WHITE,Color.RED,Color.BLUE,Color.GREEN,Color.BLACK)

  /**
    * Renders the image of the automata
    * @param cellColors temporary; replace with whatever the grid is in the future
    * @return the image of the automata in progress
    */
  def render(cellColors : Vector[Vector[Int]]) : BufferedImage = {
    val image = new BufferedImage(Main.width,Main.height,BufferedImage.TYPE_INT_ARGB)
    val g = image.getGraphics
    cellColors.foreach(cells => cells.foreach(i => {
      g.setColor(colorMap(i))
      g.fillRect(cellColors.indexOf(cells)*16,cells.indexOf(i)*16,16,16)
    }))
    image
  }

  /**
    * Generates a test for the render function
    * @return 2D Array of
    */
  def testRender() : Vector[Vector[Int]] = {
    val v : Vector[Vector[Int]] = Vector.fill(Main.width/16,Main.height/16) {
      new Random().nextInt(5)
    }
    v
  }

}
