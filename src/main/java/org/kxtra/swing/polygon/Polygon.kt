@file:JvmName("KxPolygon")

package org.kxtra.swing.polygon

import java.awt.Polygon
import java.awt.geom.Point2D

/**
 * @return a new [Polygon] containing the elements of [points] in iteration order
 */
fun Polygon(points: Collection<Point2D>): Polygon {
    val xs = IntArray(points.size)
    val ys = IntArray(points.size)
    points.forEachIndexed { i, pt ->
        xs[i] = pt.x.toInt()
        ys[i] = pt.y.toInt()
    }
    return Polygon().apply {
        npoints = points.size
        xpoints = xs
        ypoints = ys
    }
}