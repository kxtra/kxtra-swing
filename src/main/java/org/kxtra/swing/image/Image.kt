@file:JvmName("KxImage")

package org.kxtra.swing.image

import org.kxtra.swing.bufferedimage.BufferedImage
import org.kxtra.swing.graphics.use
import java.awt.AlphaComposite
import java.awt.Graphics2D
import java.awt.Image
import java.awt.Paint
import java.awt.image.BufferedImage
import java.awt.image.ColorModel
import java.awt.image.DataBufferInt
import java.awt.image.Raster

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
        val buf = DataBufferInt(output, output.size)
        val cm = ColorModel.getRGBdefault()
        val sm = cm.createCompatibleSampleModel(w, h)
        val wr = Raster.createWritableRaster(sm, buf, null)
        BufferedImage(cm, wr).createGraphics().use { g ->
            g.composite = AlphaComposite.Src
            g.drawImage(this, 0, 0, w, h, x, y, x + w, y + h, null)
        }
    }
    return output
}

fun Image.getArgb(
        rgbArray: IntArray? = null
): IntArray {
    return getArgb(0, 0, width, height, rgbArray)
}