@file:JvmName("KxImage")

package org.kxtra.swing.image

import org.jdesktop.swingx.util.GraphicsUtilities
import java.awt.Image

/**
 * Clears the data from the image.
 */
fun Image.clear() {
    GraphicsUtilities.clear(this)
}