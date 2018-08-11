@file:JvmName("KxAction")

package org.kxtra.swing.action

import javax.swing.Action

operator fun Action.get(key: String): Any? = getValue(key)

operator fun Action.set(key: String, value: Any?) = putValue(key, value)