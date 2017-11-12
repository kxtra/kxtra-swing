@file:JvmName("KxPoint")

package org.kxtra.swing.point

import java.awt.Point
import java.awt.geom.Point2D

operator fun Point.plus(other: Point2D) = Point(x + other.x.toInt(), y + other.y.toInt())

operator fun Point.minus(other: Point2D) = Point(x - other.x.toInt(), y - other.y.toInt())

fun Point.copyOf(): Point {
    return location
}