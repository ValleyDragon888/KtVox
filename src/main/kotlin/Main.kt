import org.jline.*
import org.jline.terminal.TerminalBuilder

fun main() {
    val w = Window(20, 20)
    val s = Sprite()
    s.setImage("""
            hello
            yes!!
        """.trimIndent())
    for(i in 0..10) {
        w.clear()
//        w.drawBoxOutline("single", XYPosition(0, 0), XYPosition(19, 19))
//        w.putPixel(20, 20, Pixel(Characters.ShadedBoxes.fullLightGray, backgroundColour=Formatting.BackgroundColour.blue))
//        w.pixels.forEach {
//            it.forEach {
//                it.backgroundColour = Formatting.BackgroundColour.red
//            }
//        }
        w.blitSprite(s)
        w.printScreen()
        Thread.sleep(1000)
    }
}