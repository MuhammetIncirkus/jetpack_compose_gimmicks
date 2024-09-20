package com.incirkus.myapplication.Composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ImageCarousel(
    imageList: List<Int>,
    backgroundTransparency: MutableState<Boolean>,
    currentImageIndex: MutableState<Int>,
    imageListAvailable: MutableState<Boolean>,
    currentImagePosition: MutableState<Int>,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 16.dp),
        contentAlignment = Alignment.Center) {
        HorizontalMultiBrowseCarousel(
            state = rememberCarouselState(imageList, currentImagePosition),
            preferredItemWidth = 500.dp,
            itemSpacing = 10.dp
        ) { index ->
            Box(modifier = Modifier.fillMaxWidth()) {
                ImagePreview(
                    imageList[index],
                    onClick = { currentImageIndex.value = index },
                    onLongPress =
                    {
                        currentImageIndex.value = index
                        backgroundTransparency.value = false
                        imageListAvailable.value = false
                    }
                )
            }
        }
    }
}