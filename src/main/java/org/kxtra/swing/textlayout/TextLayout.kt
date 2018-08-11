@file:JvmName("KxTextLayout")

package org.kxtra.swing.textlayout

import java.awt.FontMetrics
import java.awt.Graphics2D
import java.awt.font.TextLayout

fun TextLayout(string: String, graphics2D: Graphics2D): TextLayout {
    return TextLayout(string, graphics2D.font, graphics2D.fontRenderContext)
}

fun TextLayout(string: String, fontMetrics: FontMetrics): TextLayout {
    return TextLayout(string, fontMetrics.font, fontMetrics.fontRenderContext)
}