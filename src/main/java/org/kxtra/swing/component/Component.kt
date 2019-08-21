package org.kxtra.swing.component

import org.kxtra.swing.graphics.as2D
import java.awt.Component
import java.awt.Graphics2D
import java.awt.Window
import javax.swing.ListModel

fun Component.createGraphics(): Graphics2D? = graphics?.as2D()

operator fun <E> ListModel<E>.get(index: Int): E = getElementAt(index)

fun Window.setLocationRelativeToOwner() = setLocationRelativeTo(owner)