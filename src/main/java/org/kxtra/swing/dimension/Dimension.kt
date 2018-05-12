@file:JvmName("KxDimension")

package org.kxtra.swing.dimension

import java.awt.Dimension

operator fun Dimension.times(n: Int): Dimension {
    return Dimension(width * n, height * n)
}