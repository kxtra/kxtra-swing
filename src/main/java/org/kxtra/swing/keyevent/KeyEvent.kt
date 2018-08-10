@file:JvmName("KxKeyEvent")

package org.kxtra.swing.keyevent

import java.awt.event.KeyEvent
import javax.swing.KeyStroke

/**
 * @see[KeyEvent.getKeyText]
 */
val KeyEvent.keyText: String get() = KeyEvent.getKeyText(keyCode)

/**
 * @see[KeyStroke.getKeyStrokeForEvent]
 */
val KeyEvent.keyStroke: KeyStroke get() = KeyStroke.getKeyStrokeForEvent(this)