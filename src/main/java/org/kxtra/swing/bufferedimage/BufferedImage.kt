@file:JvmName("KxBufferedImage")

package org.kxtra.swing.bufferedimage

import org.kxtra.swing.image.fill
import org.kxtra.swing.image.height
import org.kxtra.swing.image.width
import org.kxtra.swing.renderedimage.properties
import java.awt.Image
import java.awt.image.BufferedImage
import java.awt.image.ColorModel
import java.awt.image.RenderedImage
import java.awt.image.WritableRaster
import javax.imageio.ImageTypeSpecifier

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