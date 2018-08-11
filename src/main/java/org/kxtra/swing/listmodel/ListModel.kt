@file:JvmName("KxListModel")

package org.kxtra.swing.listmodel

import javax.swing.ListModel

operator fun <E> ListModel<E>.get(index: Int): E = getElementAt(index)