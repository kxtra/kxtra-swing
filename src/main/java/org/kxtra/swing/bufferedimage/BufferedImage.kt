@file:JvmName("KxBufferedImage")

package org.kxtra.swing.bufferedimage

import org.kxtra.swing.image.draw
import org.kxtra.swing.image.height
import org.kxtra.swing.image.width
import org.kxtra.swing.renderedimage.properties
import java.awt.Image
import java.awt.image.BufferedImage
import java.awt.image.RenderedImage
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
    return BufferedImage(image.width, image.height, imageTypeSpecifier).apply { draw(image) }
}

fun BufferedImage(
        width: Int,
        height: Int,
        imageTypeSpecifier: ImageTypeSpecifier
): BufferedImage {
    return imageTypeSpecifier.createBufferedImage(width, height)
}