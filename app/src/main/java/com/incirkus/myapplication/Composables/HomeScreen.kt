package com.incirkus.myapplication.Composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(imageList: List<Int>) {

    val currentImageIndex: MutableState<Int> =
        remember { mutableIntStateOf((imageList.indices).random()) }

    val currentImagePosition: MutableState<Int> =
        remember { mutableIntStateOf(currentImageIndex.value) }

    val backgroundTransparency: MutableState<Boolean> =
        remember { mutableStateOf(true) }

    val imageListAvailable: MutableState<Boolean> =
        remember { mutableStateOf(true) }

    val imageListOrCarousel: MutableState<Boolean> =
        remember { mutableStateOf(false) }
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        LayoutScaffold(
            backgroundTransparency,
            imageList,
            currentImageIndex,
            imageListAvailable,
            imageListOrCarousel,
            currentImagePosition
        )
    }
}