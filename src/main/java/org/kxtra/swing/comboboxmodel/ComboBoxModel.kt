@file:JvmName("KxComboBoxModel")

package org.kxtra.swing.comboboxmodel

import javax.swing.ComboBoxModel

var <E> ComboBoxModel<E>.selected: E?
    @Suppress("UNCHECKED_CAST")
    get() = selectedItem as E?
    set(value) { selectedItem = value }