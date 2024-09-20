package com.incirkus.myapplication.Composables

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.carousel.CarouselState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.saveable.rememberSaveable

@ExperimentalMaterial3Api
@Composable
fun rememberCarouselState(
    imageList: List<Int>,
    currentImageIndex: MutableState<Int>,
): CarouselState {
    return rememberSaveable(saver = CarouselState.Saver) {
        CarouselState(
            currentItem = currentImageIndex.value,
            currentItemOffsetFraction = 0F,
            itemCount = { imageList.count() }
        )
    }
        .apply { itemCountState.value = { imageList.count() } }
}