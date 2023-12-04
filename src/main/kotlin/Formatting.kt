// TODO: https://stackoverflow.com/questions/51680709/colored-text-output-in-powershell-console-using-ansi-vt100-codes

class _Formatting {
    val TextColour = _TextColour()
    val BackgroundColour = _BackgroundColour()

    class _TextColour {
        val reset = "\u001B[0m"
        val black = "\u001B[30m"
        val red = "\u001B[31m"
        val green = "\u001B[32m"
        val yellow = "\u001B[33m"
        val blue = "\u001B[34m"
        val purple = "\u001B[35m"
        val cyan = "\u001B[36m"
        val white = "\u001B[37m"
    }

    class _BackgroundColour {
        val black = "\u001B[40m";
        val red = "\u001B[41m";
        val green = "\u001B[42m";
        val yellow = "\u001B[43m";
        val blue = "\u001B[44m";
        val purple = "\u001B[45m";
        val cyan = "\u001B[46m";
        val white = "\u001B[47m";
    }

}

val Formatting = _Formatting()