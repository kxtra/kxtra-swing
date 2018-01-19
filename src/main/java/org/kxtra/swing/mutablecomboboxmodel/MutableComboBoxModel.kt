@file:JvmName("KxMutableComboBoxModel")

package org.kxtra.swing.mutablecomboboxmodel

import javax.swing.MutableComboBoxModel

fun <T> MutableComboBoxModel<T>.addElements(elements: Iterable<T>) {
    for (e in elements) addElement(e)
}

fun <T> MutableComboBoxModel<T>.addElements(vararg elements: T) {
    for (e in elements) addElement(e)
}

fun <T> MutableComboBoxModel<T>.removeElements(elements: Iterable<T>) {
    for (e in elements) removeElement(e)
}

fun <T> MutableComboBoxModel<T>.removeElements(vararg elements: T) {
    for (e in elements) removeElement(e)
}