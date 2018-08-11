@file:JvmName("KxPolygon")

package org.kxtra.swing.polygon

import java.awt.Point
import java.awt.Polygon

fun Polygon.addPoint(point: Point) = addPoint(point.x, point.y)

operator fun Polygon.plusAssign(point: Point) = addPoint(point)