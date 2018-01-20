@file:JvmName("KxGraphics2D")

package org.kxtra.swing.graphics2d

import java.awt.Graphics2D
import java.awt.font.TextLayout
import java.awt.geom.Point2D

/**
 * @see[java.awt.Graphics.create]
 */
fun Graphics2D.create2D(): Graphics2D {
    return create() as? Graphics2D? ?: throw UnsupportedOperationException()
}

/**
 * @see[java.awt.Graphics.create]
 */
fun Graphics2D.create2D(x: Int, y: Int, width: Int, height: Int): Graphics2D {
    return create(x, y, width, height) as? Graphics2D? ?: throw UnsupportedOperationException()
}

/**
 * @see[TextLayout.draw]
 */
fun Graphics2D.drawTextLayout(textLayout: TextLayout, point: Point2D) {
    textLayout.draw(this, point.x.toFloat(), point.y.toFloat())
}