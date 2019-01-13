@file:JvmName("KxComponent")

package org.kxtra.swing.component

import java.awt.Component
import java.awt.Window
import javax.swing.*

val Component.window: Window? get() = SwingUtilities.getWindowAncestor(this)

var <E> JComboBox<E>.selected: E?
    @Suppress("UNCHECKED_CAST")
    get() = selectedItem as E?
    set(value) { selectedItem = value }

var <E> ComboBoxModel<E>.selected: E?
    @Suppress("UNCHECKED_CAST")
    get() = selectedItem as E?
    set(value) { selectedItem = value }

operator fun <E> ListModel<E>.get(index: Int): E = getElementAt(index)

operator fun <E> MutableComboBoxModel<E>.plusAssign(element: E) = addElement(element)

operator fun <E> MutableComboBoxModel<E>.minusAssign(element: E) = removeElement(element)

fun Window.setLocationRelativeToOwner() = setLocationRelativeTo(owner)