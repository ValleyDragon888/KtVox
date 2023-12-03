data class Pixel(
    val char: String,
    val forwardFormatting: String? = null,
    val backwardFormatting: String? = null
) {
    fun extract():String {
        var out = ""
        if(forwardFormatting != null) {
            out += forwardFormatting
        }
        out += char
        if(backwardFormatting != null) {
            out += backwardFormatting
        }
        return out

    }
}