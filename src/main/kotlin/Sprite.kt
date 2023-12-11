class Sprite(
    var pixels: PixelArray =PixelArray(0,0), // this is a hack and I hate it
    var position: XYPosition = XYPosition(0,0)) {

    fun setImage(image: String) {
        val pixelarray = Array(image.trimIndent().lines().size) {
            Array(image.trimIndent().lines()[0].length) {
                Pixel(" ")
            }
        }
        val lines = image.trimIndent().lines()
        lines.forEachIndexed() {y, line ->
            line.forEachIndexed() {x, char ->
                pixelarray[y][x] = Pixel(char.toString())
            }
        }
        val pixels = PixelArray(
            height = image.trimIndent().lines().size,
            width =  image.trimIndent().lines()[0].length,
            pixels = pixelarray
        )
        this.pixels = pixels
    }
}
//    fun toDoubleLines() {
//        var newSprite = Sprite(width, height)
//        for(row in pixels) {y:Int ->
//            for(pixel in row) {x:Int ->
//                newSprite.putPixel(x, y, when(pixel){
//                    Pixel(Characters.SingleLine.vertical) -> Pixel(Characters.DoubleLine.vertical)
//                    Pixel(Characters.SingleLine.horizontal) -> Pixel(Characters.DoubleLine.horizontal)
//                    Pixel(Characters.SingleLine.topLeftCorner) -> Pixel(Characters.DoubleLine.topLeftCorner)
//                    Pixel(Characters.SingleLine.topRightCorner) -> Pixel(Characters.DoubleLine.topRightCorner)
//                    Pixel(Characters.SingleLine.bottomLeftCorner) -> Pixel(Characters.DoubleLine.bottomRightCorner)
//                    Pixel(Characters.SingleLine.verticalAndLeft) -> Pixel(Characters.DoubleLine.verticalAndLeft)
//                    Pixel(Characters.SingleLine.verticalAndRight) -> Pixel(Characters.DoubleLine.verticalAndRight)
//                    Pixel(Characters.SingleLine.vertical) -> Pixel(Characters.DoubleLine.vertical)
//                    Pixel(Characters.SingleLine.horizontalAndDown) -> Pixel(Characters.DoubleLine.horizontalAndDown)
//                    Pixel(Characters.SingleLine.horizontalAndUp) -> Pixel(Characters.DoubleLine.horizontalAndUp)
//                    Pixel(Characters.SingleLine.horizontalAndVerticalCrossover) -> Pixel(Characters.DoubleLine.horizontalAndVerticalCrossover)
//                    else -> pixel
//                })
//            }
//        }
//    }