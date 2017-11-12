@file:JvmName("KxToolkit")

package org.kxtra.swing.toolkit

import java.awt.RenderingHints
import java.awt.Toolkit

fun Toolkit.fontDesktopHints(): RenderingHints? {
    return getDesktopProperty("awt.font.desktophints") as? RenderingHints?
}