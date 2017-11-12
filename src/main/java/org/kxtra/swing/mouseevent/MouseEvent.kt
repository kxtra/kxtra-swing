@file:JvmName("KxMouseEvent")

package org.kxtra.swing.mouseevent

import java.awt.event.MouseEvent
import javax.swing.SwingUtilities

/**
 * @see[SwingUtilities.isLeftMouseButton]
 */
val MouseEvent.isLeftButton get() = SwingUtilities.isLeftMouseButton(this)

/**
 * @see[SwingUtilities.isRightMouseButton]
 */
val MouseEvent.isRightButton get() = SwingUtilities.isRightMouseButton(this)

/**
 * @see[SwingUtilities.isMiddleMouseButton]
 */
val MouseEvent.isMiddleButton get() = SwingUtilities.isMiddleMouseButton(this)