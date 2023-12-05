data class Pixel(
    var char: String,
    var backgroundColour: String? = null,
    var textColour: String? = null
) {
    fun extract():String {
        return (backgroundColour?:"") +
                (textColour?:"") +
                char + Formatting.reset
    }
}