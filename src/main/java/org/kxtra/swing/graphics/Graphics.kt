@file:JvmName("KxGraphics")

package org.kxtra.swing.graphics

import java.awt.Graphics
import java.awt.Image
import java.awt.geom.Point2D

fun Graphics.drawImage(image: Image) {
    drawImage(image, 0, 0, null)
}

fun Graphics.drawImage(image: Image, point: Point2D) {
    drawImage(image, point.x.toInt(), point.y.toInt(), null)
}

fun Graphics.drawImage(image: Image, x: Int, y: Int) {
    drawImage(image, x, y, null)
}

fun Graphics.drawPoint(point: Point2D) {
    drawPoint(point.x.toInt(), point.y.toInt())
}

fun Graphics.drawPoint(x: Int, y: Int) {
    drawLine(x, y, x, y)
}