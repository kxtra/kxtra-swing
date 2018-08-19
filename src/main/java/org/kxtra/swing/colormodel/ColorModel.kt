@file:JvmName("KxColorModel")

package org.kxtra.swing.colormodel

import java.awt.Point
import java.awt.image.ColorModel
import java.awt.image.DataBuffer
import java.awt.image.Raster
import java.awt.image.WritableRaster

fun ColorModel.createCompatibleWritableRaster(
        w: Int,
        h: Int,
        db: DataBuffer,
        location: Point? = null
): WritableRaster {
    return Raster.createWritableRaster(
            createCompatibleSampleModel(w, h),
            db,
            location
    )
}