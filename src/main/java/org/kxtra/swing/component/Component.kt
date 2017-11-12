@file:JvmName("KxComponent")

package org.kxtra.swing.component

import java.awt.Component
import java.awt.Window
import javax.swing.SwingUtilities

/**
 * @see[SwingUtilities.getWindowAncestor]
 */
fun Component.windowAncestor(): Window? {
    return SwingUtilities.getWindowAncestor(this)
}