@file:JvmName("KxMouseEvent")

package org.kxtra.swing.mouseevent

import java.awt.event.MouseEvent

val MouseEvent.isLeftButton: Boolean get() = button == MouseEvent.BUTTON1

val MouseEvent.isMiddleButton: Boolean get() = button == MouseEvent.BUTTON2

val MouseEvent.isRightButton: Boolean get() = button == MouseEvent.BUTTON3