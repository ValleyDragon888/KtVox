data class Window(
    override val width: Int,
    override val height: Int,
    override var pixels: Array<Array<Pixel>> = Array(height+1) {
        Array(width+1){
            Pixel(" ",null,null)
        }
    }
) : PixelArray(width, height) {
    fun printScreen() {
        var toPrint = ""
        pixels.forEach {row ->
            var rowAsString = ""
            row.forEach {
                rowAsString += it.extract()
            }
            toPrint += rowAsString + "\n"
        }
        println(toPrint)
    }

    
}
