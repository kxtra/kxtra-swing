@file:JvmName("KxInputEvent")

package org.kxtra.swing.inputevent

import java.awt.event.InputEvent
import java.time.Instant

val InputEvent.modifiersExText: String get() = InputEvent.getModifiersExText(modifiersEx)

val InputEvent.instant: Instant get() = Instant.ofEpochMilli(`when`)