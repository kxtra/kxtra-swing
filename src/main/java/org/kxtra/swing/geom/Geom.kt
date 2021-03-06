package org.kxtra.swing.geom

import java.awt.Dimension
import java.awt.Insets
import java.awt.Point
import java.awt.Polygon
import java.awt.geom.Dimension2D
import java.awt.geom.Path2D
import java.awt.geom.Point2D

operator fun Dimension2D.component1(): Double = width
operator fun Dimension2D.component2(): Double = height

operator fun Dimension.component1(): Int = width
operator fun Dimension.component2(): Int = height

operator fun Point2D.component1(): Double = x
operator fun Point2D.component2(): Double = y

operator fun Point.component1(): Int = x
operator fun Point.component2(): Int = y

operator fun Point2D.Float.component1(): Float = x
operator fun Point2D.Float.component2(): Float = y

fun Polygon.addPoint(point: Point) = addPoint(point.x, point.y)

fun Polygon(initialCapacity: Int): Polygon {
    require(initialCapacity >= 0)
    val empty = IntArray(0)
    val poly = Polygon(empty, empty, 0)
    if (initialCapacity > 0) {
        poly.xpoints = IntArray(initialCapacity)
        poly.ypoints = IntArray(initialCapacity)
    }
    return poly
}

fun Path2D.moveTo(point: Point2D) = moveTo(point.x, point.y)

fun Path2D.lineTo(point: Point2D) = lineTo(point.x, point.y)

fun Path2D.Float.moveTo(point: Point) = moveTo(point.x.toFloat(), point.y.toFloat())

fun Path2D.Float.lineTo(point: Point) = lineTo(point.x.toFloat(), point.y.toFloat())

fun Path2D.Float.moveTo(point: Point2D.Float) = moveTo(point.x, point.y)

fun Path2D.Float.lineTo(point: Point2D.Float) = lineTo(point.x, point.y)

operator fun Insets.component1(): Int = top
operator fun Insets.component2(): Int = left
operator fun Insets.component3(): Int = bottom
operator fun Insets.component4(): Int = right