@file:JvmName("KxModel")

package org.kxtra.swing.model

import javax.swing.ComboBoxModel
import javax.swing.ListModel
import javax.swing.MutableComboBoxModel

operator fun <E> ListModel<E>.get(index: Int): E = getElementAt(index)

var <E> ComboBoxModel<E>.selected: E?
    @Suppress("UNCHECKED_CAST")
    get() = selectedItem as E?
    set(value) { selectedItem = value }

operator fun <E> MutableComboBoxModel<E>.plusAssign(element: E) = addElement(element)

operator fun <E> MutableComboBoxModel<E>.minusAssign(element: E) = removeElement(element)