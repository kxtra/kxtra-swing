@file:JvmName("KxInputEvent")

package org.kxtra.swing.inputevent

import java.awt.event.InputEvent

/**
 * @see[InputEvent.getModifiersExText]
 */
fun InputEvent.modifiersExText(): String {
    return InputEvent.getModifiersExText(modifiersEx)
}
