@file:JvmName("KxToolkit")

package org.kxtra.swing.toolkit

import java.awt.RenderingHints
import java.awt.Toolkit

val Toolkit.fontDesktopHints: RenderingHints? get() {
    return getDesktopProperty("awt.font.desktophints") as? RenderingHints?
}