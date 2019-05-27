package org.kxtra.swing.input

import java.awt.AWTKeyStroke
import java.awt.event.ActionEvent
import java.awt.event.InputEvent
import java.awt.event.InvocationEvent
import java.awt.event.KeyEvent
import java.awt.event.MouseEvent
import java.time.Instant
import javax.swing.Action
import javax.swing.ActionMap
import javax.swing.InputMap
import javax.swing.KeyStroke

val InputEvent.modifiersExText: String get() = InputEvent.getModifiersExText(modifiersEx)

val InputEvent.instant: Instant get() = Instant.ofEpochMilli(`when`)

val ActionEvent.instant: Instant get() = Instant.ofEpochMilli(`when`)

val InvocationEvent.instant: Instant get() = Instant.ofEpochMilli(`when`)

val InputEvent.isLeftMouseButtonDown: Boolean get() = (modifiersEx and InputEvent.BUTTON1_DOWN_MASK) != 0

val InputEvent.isMiddleMouseButtonDown: Boolean get() = (modifiersEx and InputEvent.BUTTON2_DOWN_MASK) != 0

val InputEvent.isRightMouseButtonDown: Boolean get() = (modifiersEx and InputEvent.BUTTON3_DOWN_MASK) != 0

fun InputEvent.isMouseButtonDown(button: Int): Boolean = (modifiersEx and InputEvent.getMaskForButton(button)) != 0

val MouseEvent.isLeftButton: Boolean get() = button == MouseEvent.BUTTON1

val MouseEvent.isMiddleButton: Boolean get() = button == MouseEvent.BUTTON2

val MouseEvent.isRightButton: Boolean get() = button == MouseEvent.BUTTON3

val KeyEvent.keyText: String get() = KeyEvent.getKeyText(keyCode)

val KeyEvent.keyStroke: KeyStroke get() = KeyStroke.getKeyStrokeForEvent(this)

val AWTKeyStroke.isAltDown: Boolean get() = (modifiers and InputEvent.ALT_DOWN_MASK) != 0

val AWTKeyStroke.isShiftDown: Boolean get() = (modifiers and InputEvent.SHIFT_DOWN_MASK) != 0

val AWTKeyStroke.isControlDown: Boolean get() = (modifiers and InputEvent.CTRL_DOWN_MASK) != 0

val AWTKeyStroke.isMetaDown: Boolean get() = (modifiers and InputEvent.META_DOWN_MASK) != 0

val AWTKeyStroke.isAltGraphDown: Boolean get() = (modifiers and InputEvent.ALT_GRAPH_DOWN_MASK) != 0

operator fun InputMap.set(keyStroke: KeyStroke, actionMapKey: Any?) = put(keyStroke, actionMapKey)

operator fun Action.get(key: String): Any? = getValue(key)

operator fun Action.set(key: String, value: Any?) = putValue(key, value)

operator fun ActionMap.set(key: Any, action: Action?) = put(key, action)