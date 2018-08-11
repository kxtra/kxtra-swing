@file:JvmName("KxBufferedImage")

package org.kxtra.swing.bufferedimage

import org.kxtra.swing.graphics.use
import org.kxtra.swing.image.height
import org.kxtra.swing.image.width
import org.kxtra.swing.renderedimage.properties
import java.awt.Image
import java.awt.image.BufferedImage
import java.awt.image.ColorModel
import java.awt.image.IndexColorModel
import java.util.Hashtable

/**
 * Creates a copy of [bufferedImage]
 */
fun BufferedImage(bufferedImage: BufferedImage): BufferedImage {
    return BufferedImage(
            bufferedImage.colorModel,
            bufferedImage.copyData(null),
            bufferedImage.isAlphaPremultiplied,
            bufferedImage.properties
    )
}

/**
 * Creates a copy of [image] with [imageType]
 */
fun BufferedImage(image: Image, imageType: Int): BufferedImage {
    return BufferedImage(image.width, image.height, imageType).draw(image)
}

/**
 * Creates a copy of [image] with [imageType] and [indexedColorModel]
 */
fun BufferedImage(
        image: Image,
        imageType: Int,
        indexedColorModel: IndexColorModel
): BufferedImage {
    return BufferedImage(image.width, image.height, imageType, indexedColorModel).draw(image)
}

/**
 * Creates a copy of [image] with [colorModel] and [properties]
 */
fun BufferedImage(
        image: Image,
        colorModel: ColorModel,
        properties: Hashtable<String, Any>? = null
): BufferedImage {
    return BufferedImage(colorModel, image.width, image.height, properties).draw(image)
}

/**
 * Creates a new image
 */
fun BufferedImage(
        colorModel: ColorModel,
        width: Int,
        height: Int,
        properties: Hashtable<String, Any>? = null
): BufferedImage {
    return BufferedImage(
            colorModel,
            colorModel.createCompatibleWritableRaster(width, height),
            colorModel.isAlphaPremultiplied,
            properties
    )
}

/**
 * Draws [image] onto [this] scaled using [renderingHints]. Returns [this].
 */
fun <T : BufferedImage> T.draw(
        image: Image,
        renderingHints: Map<Any, Any>? = null
): T {
    createGraphics().use {
        if (renderingHints != null) it.setRenderingHints(renderingHints)
        it.drawImage(image, 0, 0, width, height, null)
    }
    return this
}