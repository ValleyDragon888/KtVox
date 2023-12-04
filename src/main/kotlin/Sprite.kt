class Sprite(width: Int, height: Int) : PixelArray(width, height) {

    init {
        var position:XYPosition = XYPosition(0, 0)
    }

    fun toDoubleLines() {
        var newSprite = Sprite(width, height)
        for(row in pixels) {y:Int ->
            for(pixel in row) {x:Int ->
                newSprite.putPixel(x, y, when(pixel){
                    Pixel(Characters.SingleLine.vertical) -> Pixel(Characters.DoubleLine.vertical)
                    Pixel(Characters.SingleLine.horizontal) -> Pixel(Characters.DoubleLine.horizontal)
                    Pixel(Characters.SingleLine.topLeftCorner) -> Pixel(Characters.DoubleLine.topLeftCorner)
                    Pixel(Characters.SingleLine.topRightCorner) -> Pixel(Characters.DoubleLine.topRightCorner)
                    Pixel(Characters.SingleLine.bottomLeftCorner) -> Pixel(Characters.DoubleLine.bottomRightCorner)
                    Pixel(Characters.SingleLine.verticalAndLeft) -> Pixel(Characters.DoubleLine.verticalAndLeft)
                    Pixel(Characters.SingleLine.verticalAndRight) -> Pixel(Characters.DoubleLine.verticalAndRight)
                    Pixel(Characters.SingleLine.vertical) -> Pixel(Characters.DoubleLine.vertical)
                    Pixel(Characters.SingleLine.horizontalAndDown) -> Pixel(Characters.DoubleLine.horizontalAndDown)
                    Pixel(Characters.SingleLine.horizontalAndUp) -> Pixel(Characters.DoubleLine.horizontalAndUp)
                    Pixel(Characters.SingleLine.horizontalAndVerticalCrossover) -> Pixel(Characters.DoubleLine.horizontalAndVerticalCrossover)

                        else -> pixel
                })
            }
        }
    }
}