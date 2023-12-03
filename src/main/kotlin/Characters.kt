

class _Characters {
    // TODO: https://www.w3.org/TR/xml-entity-names/025.html
    class _SingleLine {
        val vertical = "│"
        val horizontal = "─"
        val topLeftCorner = "┌"
        val topRightCorner = "┐"
        val bottomLeftCorner = "└"
        val bottomRightCorner = "┘"
        val verticalAndLeft = "┤"
        val verticalAndRight = "├"
        val horizontalAndUp = "┴"
        val horizontalAndDown = "┬"
        val horizontalAndVerticalCrossover = "┼"
    }

    class _DoubleLine {
        val vertical = "║"
        val horizontal = "═"
        val topLeftCorner = "╔"
        val topRightCorner = "╗"
        val bottomLeftCorner = "╚"
        val bottomRightCorner = "╝"
        val verticalAndLeft = "╣"
        val verticalAndRight = "╠"
        val horizontalAndUp = "╩"
        val horizontalAndDown = "╦"
        val horizontalAndVerticalCrossover = "╬"
    }

    class _ShadedBoxes {
        val fullWhite = " "
        val fullLightGray = "░"
        val fullGray = "▒"
        val fullDarkGray = "▓"
        val fullBlack = "█"
        val bottomHalfBlack = "▄"
        val topHalfBlack = "▀"
        val centerAlignedBlack = "■"
    }

    val SingleLine = _SingleLine()
    val DoubleLine = _DoubleLine()
    val ShadedBoxes = _ShadedBoxes()

}

val Characters = _Characters()