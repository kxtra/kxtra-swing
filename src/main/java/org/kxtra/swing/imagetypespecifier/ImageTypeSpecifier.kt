@file:JvmName("KxImageTypeSpecifier")

package org.kxtra.swing.imagetypespecifier

import java.awt.image.ColorModel
import javax.imageio.ImageTypeSpecifier

fun ImageTypeSpecifier(colorModel: ColorModel): ImageTypeSpecifier {
    return ImageTypeSpecifier(colorModel, colorModel.createCompatibleSampleModel(1, 1))
}