@file:JvmName("KxPath2D")

package org.kxtra.swing.path2d

import java.awt.Point
import java.awt.geom.Path2D
import java.awt.geom.Point2D

fun Path2D.moveTo(point: Point2D) {
    moveTo(point.x, point.y)
}

fun Path2D.lineTo(point: Point2D) {
    lineTo(point.x, point.y)
}

fun Path2D.Float.moveTo(point: Point) {
    moveTo(point.x.toFloat(), point.y.toFloat())
}

fun Path2D.Float.lineTo(point: Point) {
    lineTo(point.x.toFloat(), point.y.toFloat())
}

fun Path2D.Float.moveTo(point: Point2D.Float) {
    moveTo(point.x, point.y)
}

fun Path2D.Float.lineTo(point: Point2D.Float) {
    lineTo(point.x, point.y)
}