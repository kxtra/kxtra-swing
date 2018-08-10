@file:JvmName("KxImage")

package org.kxtra.swing.image

import org.kxtra.swing.bufferedimage.properties
import java.awt.AlphaComposite
import java.awt.Color
import java.awt.Graphics2D
import java.awt.Image
import java.awt.image.BufferedImage
import java.awt.image.VolatileImage

/**
 * @see[Image.getWidth]
 */
val Image.width: Int get() = getWidth(null)

/**
 * @see[Image.getHeight]
 */
val Image.height: Int get() = getHeight(null)

/**
 * Clears the data from the image.
 */
fun Image.clear() {
    val g = graphics
    try {
        if (g is Graphics2D) {
            g.composite = AlphaComposite.Clear
        } else {
            g.color = Color(0, true)
        }
        g.fillRect(0, 0, width, height)
    } finally {
        g.dispose()
    }
}

fun Image.copy(): Image {
    return when (this) {
        is BufferedImage -> copy()
        is VolatileImage -> snapshot
        else -> getScaledInstance(-1, -1, Image.SCALE_DEFAULT)
    }
}

fun BufferedImage.copy(): BufferedImage {
    val cm = colorModel
    val wr = copyData(raster.createCompatibleWritableRaster())
    return BufferedImage(cm, wr, cm.isAlphaPremultiplied, properties)
}