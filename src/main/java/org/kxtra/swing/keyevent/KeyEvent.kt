@file:JvmName("KxKeyEvent")

package org.kxtra.swing.keyevent

import java.awt.event.KeyEvent

/**
 * @see[KeyEvent.getKeyText]
 */
fun KeyEvent.keyText(): String = KeyEvent.getKeyText(keyCode)
