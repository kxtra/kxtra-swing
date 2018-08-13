@file:JvmName("KxMouseEvent")

package org.kxtra.swing.mouseevent

import java.awt.event.MouseEvent
import javax.swing.SwingUtilities

val MouseEvent.isLeftButton: Boolean get() = SwingUtilities.isLeftMouseButton(this)

val MouseEvent.isRightButton: Boolean get() = SwingUtilities.isRightMouseButton(this)

val MouseEvent.isMiddleButton: Boolean get() = SwingUtilities.isMiddleMouseButton(this)