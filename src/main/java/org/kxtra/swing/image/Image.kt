@file:JvmName("KxImage")

package org.kxtra.swing.image

import org.kxtra.swing.bufferedimage.BufferedImage
import org.kxtra.swing.colormodel.createCompatibleWritableRaster
import org.kxtra.swing.databuffer.DataBufferInt
import org.kxtra.swing.graphics.use
import java.awt.AlphaComposite
import java.awt.Graphics2D
import java.awt.Image
import java.awt.Paint
import java.awt.image.*

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

/**
 * Copies onto [this] a region of [image] with the top-left corner at ([x], [y]) and the dimensions of [this]
 */
fun Image.copyRegion(
        image: Image,
        x: Int,
        y: Int
) {
    createGraphics().use { g ->
        g.composite = AlphaComposite.Src
        val w = width
        val h = height
        g.drawImage(image, 0, 0, w, h, x, y, x + w, y + h, null)
    }
}

fun Image.clear() {
    createGraphics().use { g ->
        g.composite = AlphaComposite.Clear
        g.fillRect(0, 0, width, height)
    }
}

fun Image.getArgb(
        x: Int,
        y: Int,
        w: Int,
        h: Int,
        outData: IntArray?
): IntArray {
    val output = outData ?: IntArray(w * h)
    if (this is BufferedImage && type == BufferedImage.TYPE_INT_ARGB) {
        raster.getDataElements(x, y, w, h, output)
    } else {
        val cm = ColorModel.getRGBdefault()
        val wr = cm.createCompatibleWritableRaster(w, h, DataBufferInt(output))
        BufferedImage(cm, wr).copyRegion(this, x, y)
    }
    return output
}

fun Image.getArgb(
        outData: IntArray? = null
): IntArray {
    return getArgb(0, 0, width, height, outData)
}