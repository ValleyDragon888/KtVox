open class PixelArray(
    open val width: Int,
    open val height: Int,
    open var pixels: Array<Array<Pixel>> = Array(height+1) {
        Array(width+1){
            Pixel(" ",null,null)
        }
    }
) {
    

    fun putPixel(
        x:Int,
        y:Int,
        pixel:Pixel
    ) {
        pixels[y][x] = pixel
    }

    fun drawHorizonatalLine(
        start:XYPosition,
        finish:XYPosition,
        lineType:String = "single",
    ) {
        for(i in start.x..finish.x) {
            putPixel(i, start.y, when(lineType){
                "single" -> Pixel(Characters.SingleLine.horizontal)
                "double" -> Pixel(Characters.DoubleLine.horizontal)
                else -> throw Exception("must be 'single' or 'double'")
            })
        }
    }

    fun drawVerticalLine(
        start:XYPosition,
        finish:XYPosition,
        lineType:String = "single",
    ) {
        for(i in start.y..finish.y) {
            putPixel(start.x, i, when(lineType){
                "single" -> Pixel(Characters.SingleLine.vertical)
                "double" -> Pixel(Characters.DoubleLine.vertical)
                else -> throw Exception("must be 'single' or 'double'")
            })
        }
    }

    fun drawBoxOutline(
        lineType:String = "single",
        topLeft:XYPosition,
        bottomRight:XYPosition
    ) {
        val throwNotValidInput = {throw Exception("Window. drawBoxOutline(lineType=EITHER 'single' OR 'double')")}
        // Draw corners
        putPixel(topLeft.x, topLeft.y, when(lineType) {
            "single" -> Pixel(Characters.SingleLine.topLeftCorner)
            "double" -> Pixel(Characters.DoubleLine.topLeftCorner)
            else -> throwNotValidInput()
        })
        putPixel(bottomRight.x, bottomRight.y, when(lineType) {
            "single" -> Pixel(Characters.SingleLine.bottomRightCorner)
            "double" -> Pixel(Characters.DoubleLine.bottomRightCorner)
            else -> throwNotValidInput()
        })
        putPixel(bottomRight.x, topLeft.y, when(lineType) {  // Top right hand corner
            "single" -> Pixel(Characters.SingleLine.topRightCorner)
            "double" -> Pixel(Characters.DoubleLine.topRightCorner)
            else -> throwNotValidInput()
        })
        putPixel(topLeft.x, bottomRight.y, when(lineType) {  // Bottom left hand corner
            "single" -> Pixel(Characters.SingleLine.bottomLeftCorner)
            "double" -> Pixel(Characters.DoubleLine.bottomLeftCorner)
            else -> throwNotValidInput()
        })

        // Draw lines
        drawHorizonatalLine( // TOP
            XYPosition(topLeft.x+1, topLeft.y),
            XYPosition(bottomRight.x-1, topLeft.y),
            lineType=lineType)

        drawHorizonatalLine( // BOTTOM
            XYPosition(topLeft.x+1, bottomRight.y),
            XYPosition(bottomRight.x-1, bottomRight.y),
            lineType=lineType)

        drawVerticalLine( // LEFT
            XYPosition(topLeft.x, topLeft.y+1),
            XYPosition(topLeft.x, bottomRight.y-1),
            lineType=lineType)

        drawVerticalLine( // RIGHT
            XYPosition(bottomRight.x, topLeft.y+1),
            XYPosition(bottomRight.x, bottomRight.y-1),
            lineType=lineType)
    }

    fun fillWith(toFillWith:Pixel) {
        this.pixels = Array(height+1) {
            Array(width+1){
                toFillWith
            }
        }
    }

    fun clear() {fillWith(Pixel(" "))}

}
