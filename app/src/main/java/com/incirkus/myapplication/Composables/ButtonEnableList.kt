package com.incirkus.myapplication.Composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BTNListButton(
    imageListAvailable: MutableState<Boolean>,
    currentImageIndex: MutableState<Int>,
    currentImagePosition: MutableState<Int>,
    backgroundTransparency: MutableState<Boolean>
) {
    OutlinedButton(
        onClick = {
            imageListAvailable.value = !imageListAvailable.value
            currentImagePosition.value = currentImageIndex.value
            backgroundTransparency.value = imageListAvailable.value
        },
        modifier = Modifier
            .padding(4.dp)
    ) {
        Text(text = "show/hide List")
    }
}