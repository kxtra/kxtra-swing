@file:JvmName("KxInputEvent")

package org.kxtra.swing.inputevent

import java.awt.event.InputEvent
import java.time.Instant

val InputEvent.modifiersExText: String get() = InputEvent.getModifiersExText(modifiersEx)

val InputEvent.instant: Instant get() = Instant.ofEpochMilli(`when`)

val InputEvent.isLeftMouseButtonDown: Boolean get() = (modifiersEx and InputEvent.BUTTON1_DOWN_MASK) != 0

val InputEvent.isMiddleMouseButtonDown: Boolean get() = (modifiersEx and InputEvent.BUTTON2_DOWN_MASK) != 0

val InputEvent.isRightMouseButtonDown: Boolean get() = (modifiersEx and InputEvent.BUTTON3_DOWN_MASK) != 0

fun InputEvent.isMouseButtonDown(button: Int): Boolean = (modifiersEx and InputEvent.getMaskForButton(button)) != 0