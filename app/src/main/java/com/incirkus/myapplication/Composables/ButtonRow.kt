package com.incirkus.myapplication.Composables

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ButtonRow(
    backgroundTransparency: MutableState<Boolean>,
    imageList: List<Int>,
    currentImageIndex: MutableState<Int>,
    imageListAvailable: MutableState<Boolean>,
    currentImagePosition: MutableState<Int>,
) {
    LazyRow(
        modifier = Modifier.padding(16.dp),
    )
    {
        item {
            BTNAlphaButton(backgroundTransparency)
        }
        item {
            BTNListButton(
                imageListAvailable,
                currentImageIndex,
                currentImagePosition,
                backgroundTransparency
            )
        }
        item {
            BTNRandomButton(imageList, currentImageIndex)
        }
    }
}