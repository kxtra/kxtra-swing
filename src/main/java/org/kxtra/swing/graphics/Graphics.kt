@file:JvmName("KxGraphics")

package org.kxtra.swing.graphics

import java.awt.Graphics
import java.awt.Image
import java.awt.Point

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
inline fun <T: Graphics, R> T.use(block: (T) -> R): R {
    try {
        return block(this)
    } finally {
        dispose()
    }
}