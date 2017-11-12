@file:JvmName("KxDimension")

package org.kxtra.swing.dimension

import java.awt.Dimension
import java.awt.geom.Dimension2D

operator fun Dimension.plus(other: Dimension2D) = Dimension(width + other.width.toInt(), height + other.height.toInt())

operator fun Dimension.minus(other: Dimension2D) = Dimension(width - other.width.toInt(), height - other.height.toInt())
