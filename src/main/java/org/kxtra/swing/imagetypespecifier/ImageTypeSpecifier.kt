@file:JvmName("KxImageTypeSpecifier")

package org.kxtra.swing.imagetypespecifier

import java.awt.image.ColorModel
import java.awt.image.SampleModel
import javax.imageio.ImageTypeSpecifier

fun ImageTypeSpecifier(colorModel: ColorModel): ImageTypeSpecifier {
    return ImageTypeSpecifier(colorModel, colorModel.createCompatibleSampleModel(1, 1))
}

operator fun ImageTypeSpecifier.component1(): ColorModel = colorModel

operator fun ImageTypeSpecifier.component2(): SampleModel = sampleModel