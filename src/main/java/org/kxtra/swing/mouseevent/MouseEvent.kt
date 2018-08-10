@file:JvmName("KxMouseEvent")

package org.kxtra.swing.mouseevent

import java.awt.event.MouseEvent
import javax.swing.SwingUtilities

/**
 * @see[SwingUtilities.isLeftMouseButton]
 */
val MouseEvent.isLeftButton: Boolean get() = SwingUtilities.isLeftMouseButton(this)

/**
 * @see[SwingUtilities.isRightMouseButton]
 */
val MouseEvent.isRightButton: Boolean get() = SwingUtilities.isRightMouseButton(this)

/**
 * @see[SwingUtilities.isMiddleMouseButton]
 */
val MouseEvent.isMiddleButton: Boolean get() = SwingUtilities.isMiddleMouseButton(this)