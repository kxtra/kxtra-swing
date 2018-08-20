@file:JvmName("KxComponent")

package org.kxtra.swing.component

import java.awt.Component
import java.awt.Window
import javax.swing.JComboBox
import javax.swing.SwingUtilities

val Component.window: Window? get() = SwingUtilities.getWindowAncestor(this)

var <E> JComboBox<E>.selected: E?
    @Suppress("UNCHECKED_CAST")
    get() = selectedItem as E?
    set(value) { selectedItem = value }