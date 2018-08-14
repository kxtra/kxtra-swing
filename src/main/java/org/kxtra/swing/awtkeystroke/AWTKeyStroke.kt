@file:JvmName("KxAWTKeyStroke")

package org.kxtra.swing.awtkeystroke

import java.awt.AWTKeyStroke
import java.awt.event.InputEvent

val AWTKeyStroke.isAltDown: Boolean get() = (modifiers and InputEvent.ALT_DOWN_MASK) != 0

val AWTKeyStroke.isShiftDown: Boolean get() = (modifiers and InputEvent.SHIFT_DOWN_MASK) != 0

val AWTKeyStroke.isControlDown: Boolean get() = (modifiers and InputEvent.CTRL_DOWN_MASK) != 0

val AWTKeyStroke.isMetaDown: Boolean get() = (modifiers and InputEvent.META_DOWN_MASK) != 0

val AWTKeyStroke.isAltGraphDown: Boolean get() = (modifiers and InputEvent.ALT_GRAPH_DOWN_MASK) != 0

val AWTKeyStroke.isLeftMouseButtonDown: Boolean get() = (modifiers and InputEvent.BUTTON1_DOWN_MASK) != 0

val AWTKeyStroke.isMiddleMouseButtonDown: Boolean get() = (modifiers and InputEvent.BUTTON2_DOWN_MASK) != 0

val AWTKeyStroke.isRightMouseButtonDown: Boolean get() = (modifiers and InputEvent.BUTTON3_DOWN_MASK) != 0

fun AWTKeyStroke.isMouseButtonDown(button: Int): Boolean = (modifiers and InputEvent.getMaskForButton(button)) != 0