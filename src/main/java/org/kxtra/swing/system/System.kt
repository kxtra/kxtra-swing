@file:JvmName("KxSystem")

package org.kxtra.swing.system

import java.awt.RenderingHints
import java.awt.Toolkit
import java.awt.datatransfer.Clipboard
import java.awt.datatransfer.StringSelection

val Toolkit.desktopFontHints: RenderingHints? get() {
    return getDesktopProperty("awt.font.desktophints") as? RenderingHints?
}

fun Clipboard.setContents(string: String) {
    val selection = StringSelection(string)
    setContents(selection, selection)
}