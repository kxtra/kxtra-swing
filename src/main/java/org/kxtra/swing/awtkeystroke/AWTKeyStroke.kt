@file:JvmName("KxAWTKeyStroke")

package org.kxtra.swing.awtkeystroke

import java.awt.AWTKeyStroke
import java.awt.event.InputEvent

val AWTKeyStroke.isAltDown: Boolean get() = (modifiers and InputEvent.ALT_DOWN_MASK) != 0

val AWTKeyStroke.isShiftDown: Boolean get() = (modifiers and InputEvent.SHIFT_DOWN_MASK) != 0

val AWTKeyStroke.isControlDown: Boolean get() = (modifiers and InputEvent.CTRL_DOWN_MASK) != 0

val AWTKeyStroke.isMetaDown: Boolean get() = (modifiers and InputEvent.META_DOWN_MASK) != 0

val AWTKeyStroke.isAltGraphDown: Boolean get() = (modifiers and InputEvent.ALT_GRAPH_DOWN_MASK) != 0