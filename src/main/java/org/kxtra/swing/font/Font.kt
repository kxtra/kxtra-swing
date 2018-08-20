@file:JvmName("KxFont")

package org.kxtra.swing.font

import java.awt.Font
import java.awt.FontMetrics
import java.awt.Graphics2D
import java.awt.font.TextLayout
import kotlin.math.roundToInt

fun Font(name: String?, style: Int, size: Float): Font {
    return Font(name, style, size.roundToInt()).deriveFont(size)
}

fun TextLayout(string: String, graphics2D: Graphics2D): TextLayout {
    return TextLayout(string, graphics2D.font, graphics2D.fontRenderContext)
}

fun TextLayout(string: String, fontMetrics: FontMetrics): TextLayout {
    return TextLayout(string, fontMetrics.font, fontMetrics.fontRenderContext)
}