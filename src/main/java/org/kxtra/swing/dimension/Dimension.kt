@file:JvmName("KxDimension")

package org.kxtra.swing.dimension

import java.awt.Dimension
import java.awt.Insets

operator fun Dimension.times(n: Int): Dimension {
    return Dimension(width * n, height * n)
}

operator fun Dimension.timesAssign(n: Int) {
    width *= n
    height *= n
}

operator fun Dimension.plus(insets: Insets): Dimension {
    return Dimension(width + insets.left + insets.right, height + insets.top + insets.bottom)
}

operator fun Dimension.plusAssign(insets: Insets) {
    width += insets.left + insets.right
    height += insets.top + insets.bottom
}