import Pixel
import Window

fun main() {
    var w = Window(20, 20)
    w.printScreen()

    w.drawBoxOutline("double", XYPosition(0, 0), XYPosition(2, 2))
    w.printScreen()
}