
fun main() {
    val w = Window(20, 20)
    for(i in 0..10) {
        w.clear()
        w.drawBoxOutline("single", XYPosition(0, 0), XYPosition(19, 19))
        w.putPixel(20, 20, Pixel(Characters.ShadedBoxes.fullLightGray))
        w.printScreen()
        Thread.sleep(1000)
    }
}