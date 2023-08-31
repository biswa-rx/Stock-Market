package com.example.istock.util

import androidx.compose.ui.graphics.Color

fun colorToHex(color: Color): String {
    val alpha = (color.alpha * 255).toInt()
    val red = (color.red * 255).toInt()
    val green = (color.green * 255).toInt()
    val blue = (color.blue * 255).toInt()

    val argb = (alpha shl 24) or (red shl 16) or (green shl 8) or blue

    return String.format("#%08X", argb)
}