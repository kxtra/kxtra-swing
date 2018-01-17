@file:JvmName("KxPoint2D")

package org.kxtra.swing.point2d

import java.awt.Point
import java.awt.geom.Dimension2D
import java.awt.geom.Point2D

operator fun Point2D.plus(other: Point2D): Point2D {
    return Point2D.Double(x + other.x, y + other.y)
}

operator fun Point2D.minus(other: Point2D): Point2D {
    return Point2D.Double(x - other.x, y - other.y)
}

operator fun Point2D.plus(dimension: Dimension2D): Point2D {
    return Point2D.Double(x + dimension.width, y + dimension.height)
}

operator fun Point2D.minus(dimension: Dimension2D): Point2D {
    return Point2D.Double(x - dimension.width, y - dimension.height)
}

fun Point2D.copyOf(): Point2D {
    return Point2D.Double(x, y)
}




operator fun Point.plus(other: Point2D): Point {
    return Point(x + other.x.toInt(), y + other.y.toInt())
}

operator fun Point.minus(other: Point2D): Point {
    return Point(x - other.x.toInt(), y - other.y.toInt())
}

operator fun Point.plus(dimension: Dimension2D): Point2D {
    return Point(x + dimension.width.toInt(), y + dimension.height.toInt())
}

operator fun Point.minus(dimension: Dimension2D): Point2D {
    return Point(x - dimension.width.toInt(), y - dimension.height.toInt())
}

fun Point.copyOf(): Point {
    return Point(this)
}




operator fun Point2D.Float.plus(other: Point2D): Point2D.Float {
    return Point2D.Float(x + other.x.toFloat(), y + other.y.toFloat())
}

operator fun Point2D.Float.minus(other: Point2D): Point2D.Float {
    return Point2D.Float(x - other.x.toFloat(), y - other.y.toFloat())
}

operator fun Point2D.Float.plus(dimension: Dimension2D): Point2D {
    return Point2D.Float(x + dimension.width.toFloat(), y + dimension.height.toFloat())
}

operator fun Point2D.Float.minus(dimension: Dimension2D): Point2D {
    return Point2D.Float(x - dimension.width.toFloat(), y - dimension.height.toFloat())
}

fun Point2D.Float.copyOf(): Point2D.Float {
    return Point2D.Float(x, y)
}




operator fun Point2D.Double.plus(other: Point2D): Point2D.Double {
    return Point2D.Double(x + other.x, y + other.y)
}

operator fun Point2D.Double.minus(other: Point2D): Point2D.Double {
    return Point2D.Double(x - other.x, y - other.y)
}

operator fun Point2D.Double.plus(dimension: Dimension2D): Point2D {
    return Point2D.Double(x + dimension.width, y + dimension.height)
}

operator fun Point2D.Double.minus(dimension: Dimension2D): Point2D {
    return Point2D.Double(x - dimension.width, y - dimension.height)
}

fun Point2D.Double.copyOf(): Point2D.Double {
    return Point2D.Double(x, y)
}