@file:JvmName("KxImage")

package org.kxtra.swing.image

import org.kxtra.swing.graphics.use
import java.awt.*
import java.awt.image.*
import java.util.*
import javax.imageio.ImageTypeSpecifier

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

val RenderedImage.imageTypeSpecifier: ImageTypeSpecifier get() = ImageTypeSpecifier(this)

val RenderedImage.properties: Hashtable<String, Any>? get() {
    val keys = propertyNames ?: return null
    return Hashtable<String, Any>(keys.size, 1f).apply {
        for (key in keys) put(key, getProperty(key))
    }
}

/**
 * Creates a copy of [renderedImage]
 */
fun BufferedImage(renderedImage: RenderedImage): BufferedImage {
    val cm = checkNotNull(renderedImage.colorModel)
    return BufferedImage(
            cm,
            renderedImage.copyData(null),
            cm.isAlphaPremultiplied,
            renderedImage.properties
    )
}

/**
 * Creates a copy of [image] with [imageTypeSpecifier]
 */
fun BufferedImage(
        image: Image,
        imageTypeSpecifier: ImageTypeSpecifier
): BufferedImage {
    return BufferedImage(image.width, image.height, imageTypeSpecifier).apply { fill(image) }
}

/**
 * Creates a copy of [image] with [imageType]
 */
fun BufferedImage(
        image: Image,
        imageType: Int
): BufferedImage {
    return BufferedImage(image.width, image.height, imageType).apply { fill(image) }
}

fun BufferedImage(
        width: Int,
        height: Int,
        imageTypeSpecifier: ImageTypeSpecifier
): BufferedImage {
    return imageTypeSpecifier.createBufferedImage(width, height)
}

fun BufferedImage(
        colorModel: ColorModel,
        raster: WritableRaster,
        isRasterPremultiplied: Boolean = colorModel.isAlphaPremultiplied
): BufferedImage {
    return BufferedImage(colorModel, raster, isRasterPremultiplied, null)
}

fun ImageTypeSpecifier(colorModel: ColorModel): ImageTypeSpecifier {
    return ImageTypeSpecifier(colorModel, colorModel.createCompatibleSampleModel(1, 1))
}

operator fun ImageTypeSpecifier.component1(): ColorModel = colorModel

operator fun ImageTypeSpecifier.component2(): SampleModel = sampleModel

fun ColorModel.createCompatibleWritableRaster(
        w: Int,
        h: Int,
        db: DataBuffer,
        location: Point? = null
): WritableRaster {
    return Raster.createWritableRaster(
            createCompatibleSampleModel(w, h),
            db,
            location
    )
}

fun DataBufferByte(dataArray: ByteArray): DataBufferByte = DataBufferByte(dataArray, dataArray.size)

fun DataBufferShort(dataArray: ShortArray): DataBufferShort = DataBufferShort(dataArray, dataArray.size)

fun DataBufferUShort(dataArray: ShortArray): DataBufferUShort = DataBufferUShort(dataArray, dataArray.size)

fun DataBufferInt(dataArray: IntArray): DataBufferInt = DataBufferInt(dataArray, dataArray.size)

fun DataBufferFloat(dataArray: FloatArray): DataBufferFloat = DataBufferFloat(dataArray, dataArray.size)

fun DataBufferDouble(dataArray: DoubleArray): DataBufferDouble = DataBufferDouble(dataArray, dataArray.size)