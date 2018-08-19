@file:JvmName("KxDataBuffer")

package org.kxtra.swing.databuffer

import java.awt.image.*

fun DataBufferByte(dataArray: ByteArray): DataBufferByte = DataBufferByte(dataArray, dataArray.size)

fun DataBufferShort(dataArray: ShortArray): DataBufferShort = DataBufferShort(dataArray, dataArray.size)

fun DataBufferUShort(dataArray: ShortArray): DataBufferUShort = DataBufferUShort(dataArray, dataArray.size)

fun DataBufferInt(dataArray: IntArray): DataBufferInt = DataBufferInt(dataArray, dataArray.size)

fun DataBufferFloat(dataArray: FloatArray): DataBufferFloat = DataBufferFloat(dataArray, dataArray.size)

fun DataBufferDouble(dataArray: DoubleArray): DataBufferDouble = DataBufferDouble(dataArray, dataArray.size)