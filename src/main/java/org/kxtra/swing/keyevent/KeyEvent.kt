@file:JvmName("KxKeyEvent")

package org.kxtra.swing.keyevent

import java.awt.event.KeyEvent
import javax.swing.KeyStroke

val KeyEvent.keyText: String get() = KeyEvent.getKeyText(keyCode)

val KeyEvent.keyStroke: KeyStroke get() = KeyStroke.getKeyStrokeForEvent(this)