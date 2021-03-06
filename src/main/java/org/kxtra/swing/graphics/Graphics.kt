package org.kxtra.swing.graphics

import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.Image
import java.awt.Point
import java.awt.font.TextLayout

fun Graphics.drawImage(image: Image, x: Int, y: Int): Boolean {
    return drawImage(image, x, y, null)
}

fun Graphics.drawImage(image: Image, x: Int, y: Int, w: Int, h: Int): Boolean {
    return drawImage(image, x, y, w, h, null)
}

fun Graphics.drawPoint(point: Point) {
    drawPoint(point.x, point.y)
}

fun Graphics.drawPoint(x: Int, y: Int) {
    drawLine(x, y, x, y)
}

fun Graphics.drawString(string: String, point: Point) {
    drawString(string, point.x, point.y)
}

fun Graphics.drawChars(chars: CharArray, x: Int, y: Int) {
    drawChars(chars, 0, chars.size, x, y)
}

fun Graphics.drawChar(char: Char, x: Int, y: Int) {
    drawChars(charArrayOf(char), x, y)
}

/**
 * Executes the given [block] function on [this] and then calls [Graphics.dispose] whether an exception
 * is thrown or not.
 */
inline fun <T : Graphics> T.use(block: (T) -> Unit) {
    try {
        block(this)
    } finally {
        dispose()
    }
}

fun Graphics2D.create2D(): Graphics2D {
    return create().as2D()
}

fun Graphics2D.create2D(x: Int, y: Int, width: Int, height: Int): Graphics2D {
    return create(x, y, width, height).as2D()
}

fun Graphics2D.drawTextLayout(textLayout: TextLayout, x: Float, y: Float) {
    textLayout.draw(this, x, y)
}

internal fun Graphics.as2D(): Graphics2D {
    return this as? Graphics2D ?: throw UnsupportedOperationException()
}