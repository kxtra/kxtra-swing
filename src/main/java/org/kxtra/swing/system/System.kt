package org.kxtra.swing.system

import java.awt.datatransfer.Clipboard
import java.awt.datatransfer.StringSelection
import java.awt.datatransfer.Transferable

fun Clipboard.setContents(string: String) {
    val selection = StringSelection(string)
    setContents(selection, selection)
}

fun Clipboard.getContents(): Transferable = getContents(null)