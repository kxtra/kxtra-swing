@file:JvmName("KxBufferedImage")

package org.kxtra.swing.bufferedimage

import java.awt.image.BufferedImage
import java.util.Hashtable

val BufferedImage.properties: Hashtable<String, Any>? get() {
    val keys = propertyNames ?: return null
    val table = Hashtable<String, Any>(keys.size * 2)
    for (key in keys) table[key] = getProperty(key)
    return table
}