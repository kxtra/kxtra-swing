@file:JvmName("KxInputMap")

package org.kxtra.swing.inputmap

import javax.swing.InputMap
import javax.swing.KeyStroke

operator fun InputMap.set(keyStroke: KeyStroke, actionMapKey: Any?) = put(keyStroke, actionMapKey)