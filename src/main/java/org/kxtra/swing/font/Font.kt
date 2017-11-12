@file:JvmName("KxFont")

package org.kxtra.swing.font

import java.awt.Font

/**
 * @param[style] one of case-insensitive `"plain"`, `"bold"`, `"italic"`, or `"bolditalic"`
 *
 * @see[Font.decode]
 * @see[Font.deriveFont]
 */
fun Font(name: String, style: String, size: Float): Font {
    return Font.decode("$name-$style-${size.toInt()}").deriveFont(size)
}

/**
 * @see[Font.deriveFont]
 */
fun Font(name: String, style: Int, size: Float): Font {
    return Font(name, style, size.toInt()).deriveFont(size)
}