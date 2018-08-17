@file:JvmName("KxImage")

package org.kxtra.swing.image

import org.kxtra.swing.graphics.use
import java.awt.AlphaComposite
import java.awt.Graphics2D
import java.awt.Image
import java.awt.Paint
import java.awt.image.BufferedImage
import java.awt.image.PixelGrabber
import java.awt.image.VolatileImage

val Image.width: Int get() = getWidth(null)

val Image.height: Int get() = getHeight(null)

fun Image.createGraphics(): Graphics2D = graphics as? Graphics2D? ?: throw UnsupportedOperationException()

/**
 * Fills [this] with [image], scaled using [renderingHints] if necessary
 */
fun Image.fill(
        image: Image,
        renderingHints: Map<*, *>? = null
) {
    createGraphics().use { g ->
        g.composite = AlphaComposite.Src
        if (renderingHints != null) g.setRenderingHints(renderingHints)
        g.drawImage(image, 0, 0, width, height, null)
    }
}

fun Image.fill(
        paint: Paint,
        renderingHints: Map<*, *>? = null
) {
    createGraphics().use { g ->
        g.paint = paint
        g.composite = AlphaComposite.Src
        if (renderingHints != null) g.setRenderingHints(renderingHints)
        g.fillRect(0, 0, width, height)
    }
}

fun Image.clear() {
    createGraphics().use { g ->
        g.composite = AlphaComposite.Clear
        g.fillRect(0, 0, width, height)
    }
}

fun Image.getRGB(
        startX: Int,
        startY: Int,
        w: Int,
        h: Int,
        rgbArray: IntArray?,
        offset: Int,
        scansize: Int
): IntArray {
    return when (this) {
        is BufferedImage -> getRGB(startX, startY, w, h, rgbArray, offset, scansize)
        is VolatileImage -> snapshot.getRGB(startX, startY, w, h, rgbArray, offset, scansize)
        else -> {
            val pg = PixelGrabber(this, startX, startY, w, h, rgbArray, offset, scansize)
            check(pg.grabPixels())
            pg.pixels as IntArray
        }
    }
}

fun Image.getRGB(
        rgbArray: IntArray? = null,
        offset: Int = 0
): IntArray {
    return getRGB(0, 0, width, height, rgbArray, offset, width)
}