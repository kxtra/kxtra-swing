@file:JvmName("KxComponent")

package org.kxtra.swing.component

import java.awt.Component
import java.awt.Window
import javax.swing.SwingUtilities

val Component.window: Window? get() = SwingUtilities.getWindowAncestor(this)