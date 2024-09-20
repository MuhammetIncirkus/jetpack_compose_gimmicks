package com.incirkus.myapplication.Composables

import androidx.compose.foundation.layout.width
import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ImageSlider(
    imageList: List<Int>,
    currentImageIndex: MutableState<Int>,
) {
    Slider(
        value = currentImageIndex.value.toFloat(),
        valueRange = 0f..(imageList.size - 1).toFloat(),
        onValueChange = { newIndex ->
            currentImageIndex.value = newIndex.toInt()
        },
        steps = imageList.size - 2, // Number of steps excluding min and max
        modifier = Modifier.width(250.dp)
    )
}