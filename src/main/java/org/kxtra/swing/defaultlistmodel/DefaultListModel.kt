@file:JvmName("KxDefaultListModel")

package org.kxtra.swing.defaultlistmodel

import javax.swing.DefaultListModel

fun <T> DefaultListModel<T>.addElements(elements: Iterable<T>) {
    for (e in elements) addElement(e)
}

fun <T> DefaultListModel<T>.addElements(vararg elements: T) {
    for (e in elements) addElement(e)
}

fun <T> DefaultListModel<T>.removeElements(elements: Iterable<T>) {
    for (e in elements) removeElement(e)
}

fun <T> DefaultListModel<T>.removeElements(vararg elements: T) {
    for (e in elements) removeElement(e)
}