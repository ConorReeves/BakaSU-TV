package org.bakasu.bakasu.ui.util

import android.content.res.Configuration
import androidx.compose.runtime.staticCompositionLocalOf

val LocalIsTv = staticCompositionLocalOf { false }

fun isTvConfiguration(configuration: Configuration): Boolean =
    (configuration.uiMode and Configuration.UI_MODE_TYPE_MASK) ==
        Configuration.UI_MODE_TYPE_TELEVISION