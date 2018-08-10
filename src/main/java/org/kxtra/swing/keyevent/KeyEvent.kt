@file:JvmName("KxKeyEvent")

package org.kxtra.swing.keyevent

import java.awt.event.KeyEvent

/**
 * @see[KeyEvent.getKeyText]
 */
val KeyEvent.keyText: String get() = KeyEvent.getKeyText(keyCode)
