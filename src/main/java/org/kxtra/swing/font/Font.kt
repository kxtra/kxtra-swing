@file:JvmName("KxFont")

package org.kxtra.swing.font

import java.awt.Font
import kotlin.math.roundToInt

fun Font(name: String?, style: Int, size: Float): Font {
    return Font(name, style, size.roundToInt()).deriveFont(size)
}