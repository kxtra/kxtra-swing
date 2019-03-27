@file:JvmName("KxComponent")

package org.kxtra.swing.component

import java.awt.Component
import java.awt.Window
import javax.swing.ListModel
import javax.swing.MutableComboBoxModel
import javax.swing.SwingUtilities

val Component.window: Window? get() = SwingUtilities.getWindowAncestor(this)

operator fun <E> ListModel<E>.get(index: Int): E = getElementAt(index)

operator fun <E> MutableComboBoxModel<E>.plusAssign(element: E) = addElement(element)

operator fun <E> MutableComboBoxModel<E>.minusAssign(element: E) = removeElement(element)

fun Window.setLocationRelativeToOwner() = setLocationRelativeTo(owner)