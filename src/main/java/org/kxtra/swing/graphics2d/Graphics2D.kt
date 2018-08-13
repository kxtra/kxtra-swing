@file:JvmName("KxGraphics2D")

package org.kxtra.swing.graphics2d

import java.awt.Graphics2D
import java.awt.font.TextLayout

fun Graphics2D.create2D(): Graphics2D {
    return create() as? Graphics2D? ?: throw UnsupportedOperationException()
}

fun Graphics2D.drawTextLayout(textLayout: TextLayout, x: Float, y: Float) {
    textLayout.draw(this, x, y)
}