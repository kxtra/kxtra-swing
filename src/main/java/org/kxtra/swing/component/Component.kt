package org.kxtra.swing.component

import java.awt.Component
import java.awt.Graphics2D
import java.awt.Window
import javax.swing.ListModel

fun Component.createGraphics(): Graphics2D? = graphics?.let { it as? Graphics2D ?: throw UnsupportedOperationException() }

operator fun <E> ListModel<E>.get(index: Int): E = getElementAt(index)

fun Window.setLocationRelativeToOwner() = setLocationRelativeTo(owner)