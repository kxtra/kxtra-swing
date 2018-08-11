@file:JvmName("KxRenderedImage")

package org.kxtra.swing.renderedimage

import java.awt.image.RenderedImage
import java.util.Hashtable

val RenderedImage.properties: Hashtable<String, Any>? get() {
    val keys = propertyNames ?: return null
    return Hashtable<String, Any>(keys.size * 2).apply {
        for (key in keys) put(key, getProperty(key))
    }
}