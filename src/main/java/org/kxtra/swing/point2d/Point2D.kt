@file:JvmName("KxPoint2D")

package org.kxtra.swing.point2d

import java.awt.Point
import java.awt.geom.Point2D

operator fun Point2D.component1(): Double = x

operator fun Point2D.component2(): Double = y

operator fun Point.component1(): Int = x

operator fun Point.component2(): Int = y

operator fun Point2D.Float.component1(): Float = x

operator fun Point2D.Float.component2(): Float = y