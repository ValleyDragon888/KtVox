data class Window(
    override var width: Int,
    override var height: Int,
    override var pixels: Array<Array<Pixel>> = Array(height+1) {
        Array(width+1){
            Pixel(" ",null,null)
        }
    }
) : PixelArray(width, height) {
    fun printScreen() { print(render()) }

    
}
