@file:JvmName("KxSystem")

package org.kxtra.swing.system

import java.awt.GraphicsConfiguration
import java.awt.GraphicsEnvironment
import java.awt.RenderingHints
import java.awt.Toolkit

val Toolkit.desktopFontHints: RenderingHints? get() {
    return getDesktopProperty("awt.font.desktophints") as? RenderingHints?
}

fun GraphicsEnvironment.configurationAt(x: Int, y: Int): GraphicsConfiguration? {
    for (gd in screenDevices) {
        for (gc in gd.configurations) {
            if (gc.bounds.contains(x, y)) {
                return gc
            }
        }
    }
    return null
}