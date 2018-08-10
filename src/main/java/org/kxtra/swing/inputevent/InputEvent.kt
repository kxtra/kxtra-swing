@file:JvmName("KxInputEvent")

package org.kxtra.swing.inputevent

import java.awt.event.InputEvent

/**
 * @see[InputEvent.getModifiersExText]
 */
val InputEvent.modifiersExText: String get() = InputEvent.getModifiersExText(modifiersEx)