@file:JvmName("KxDimension")

package org.kxtra.swing.dimension

import java.awt.Dimension
import java.awt.geom.Dimension2D

operator fun Dimension.plus(other: Dimension2D): Dimension {
    return Dimension(width + other.width.toInt(), height + other.height.toInt())
}

operator fun Dimension.minus(other: Dimension2D): Dimension {
    return Dimension(width - other.width.toInt(), height - other.height.toInt())
}

operator fun Dimension.times(n: Double): Dimension {
    return Dimension((width * n).toInt(), (height * n).toInt())
}

operator fun Dimension.times(n: Int): Dimension {
    return Dimension(width * n, height * n)
}

operator fun Dimension.div(n: Double): Dimension {
    return Dimension((width / n).toInt(), (height / n).toInt())
}

operator fun Dimension.div(n: Int): Dimension {
    return Dimension(width / n, height / n)
}