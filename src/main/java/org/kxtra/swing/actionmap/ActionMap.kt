@file:JvmName("KxActionMap")

package org.kxtra.swing.actionmap

import javax.swing.Action
import javax.swing.ActionMap

operator fun ActionMap.set(key: Any, action: Action?) = put(key, action)