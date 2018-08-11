@file:JvmName("KxImage")

package org.kxtra.swing.image

import java.awt.Image

/**
 * @see[Image.getWidth]
 */
val Image.width: Int get() = getWidth(null)

/**
 * @see[Image.getHeight]
 */
val Image.height: Int get() = getHeight(null)