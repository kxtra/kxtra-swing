@file:JvmName("KxImage")

package org.kxtra.swing.image

import org.kxtra.swing.graphics.use
import java.awt.AlphaComposite
import java.awt.Color
import java.awt.Graphics2D
import java.awt.Image

val Image.width: Int get() = getWidth(null)

val Image.height: Int get() = getHeight(null)

/**
 * Draws [image] onto [this], scaled using [renderingHints] if necessary
 */
fun Image.draw(
        image: Image,
        renderingHints: Map<Any, Any>? = null
) {
    createGraphics().use { g ->
        if (renderingHints != null) g.setRenderingHints(renderingHints)
        g.drawImage(image, 0, 0, width, height, null)
    }
}

fun Image.createGraphics(): Graphics2D = graphics as? Graphics2D? ?: throw UnsupportedOperationException()

fun Image.clear() {
    graphics.use { g ->
        if (g is Graphics2D) {
            g.composite = AlphaComposite.Clear
        } else {
            g.color = Color(0, true)
        }
        g.fillRect(0, 0, width, height)
    }
}