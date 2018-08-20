@file:JvmName("KxGraphics")

package org.kxtra.swing.graphics

import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.Image
import java.awt.Point
import java.awt.font.TextLayout

fun Graphics.drawImage(image: Image): Boolean {
    return drawImage(image, 0, 0, null)
}

fun Graphics.drawImage(image: Image, point: Point): Boolean {
    return drawImage(image, point.x, point.y, null)
}

fun Graphics.drawImage(image: Image, x: Int, y: Int): Boolean {
    return drawImage(image, x, y, null)
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

/**
 * Executes the given [block] function on [this] and then calls [Graphics.dispose] whether an exception
 * is thrown or not.
 */
inline fun <T: Graphics> T.use(block: (T) -> Unit) {
    try {
        block(this)
    } finally {
        dispose()
    }
}

fun Graphics2D.create2D(): Graphics2D {
    return create() as? Graphics2D? ?: throw UnsupportedOperationException()
}

fun Graphics2D.drawTextLayout(textLayout: TextLayout, x: Float, y: Float) {
    textLayout.draw(this, x, y)
}