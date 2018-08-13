@file:JvmName("KxDimension2D")

package org.kxtra.swing.dimension2d

import java.awt.Dimension
import java.awt.geom.Dimension2D

operator fun Dimension2D.component1(): Double = width

operator fun Dimension2D.component2(): Double = height

operator fun Dimension.component1(): Int = width

operator fun Dimension.component2(): Int = height