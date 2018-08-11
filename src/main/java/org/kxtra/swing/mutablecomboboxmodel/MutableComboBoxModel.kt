@file:JvmName("KxMutableComboBoxModel")

package org.kxtra.swing.mutablecomboboxmodel

import javax.swing.MutableComboBoxModel

operator fun <T> MutableComboBoxModel<T>.plusAssign(element: T) = addElement(element)

operator fun <T> MutableComboBoxModel<T>.minusAssign(element: T) = removeElement(element)