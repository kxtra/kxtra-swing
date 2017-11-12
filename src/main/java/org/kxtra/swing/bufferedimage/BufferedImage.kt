@file:JvmName("KxBufferedImage")

package org.kxtra.swing.bufferedimage

import org.jdesktop.swingx.util.GraphicsUtilities
import java.awt.Image
import java.awt.image.BufferedImage

/**
 * Creates a new compatible copy of [image].
 *
 * @see[java.awt.GraphicsConfiguration.createCompatibleImage]
 */
fun BufferedImage(image: Image): BufferedImage {
    return GraphicsUtilities.convertToBufferedImage(image)
}

/**
 * Returns a new compatible copy of this image, or `this` if already compatible.
 *
 * @see[java.awt.GraphicsConfiguration.createCompatibleImage]
 */
fun BufferedImage.toCompatibleImage(): BufferedImage {
    return GraphicsUtilities.toCompatibleImage(this)
}