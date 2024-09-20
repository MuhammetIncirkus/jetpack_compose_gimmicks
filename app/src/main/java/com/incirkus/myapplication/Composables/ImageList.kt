package com.incirkus.myapplication.Composables

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ImageList(
    imageList: List<Int>,
    backgroundTransparency: MutableState<Boolean>,
    currentImageIndex: MutableState<Int>,
    imageListAvailable: MutableState<Boolean>
) {
    val listState = rememberLazyListState()
    LaunchedEffect(imageListAvailable.value) {
        if (imageListAvailable.value) {
            listState.scrollToItem(currentImageIndex.value)
        }
    }

    LazyColumn(
        state = listState,
        modifier = Modifier.fillMaxSize()
    ) {
        items(imageList) { imageResource ->
            val index = imageList.indexOf(imageResource)
            val isVisible by remember {
                derivedStateOf {
                    val visibleItems = listState.layoutInfo.visibleItemsInfo
                    visibleItems.any { it.index == index }
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(650.dp)
                    .animateContentSize(),
                contentAlignment = Alignment.Center
            ) {
                AnimatedVisibility(
                    visible = isVisible,
                    enter = expandHorizontally() + fadeIn(),
                ) {
                    ImagePreview(
                        imageResource,
                        onClick = { currentImageIndex.value = index },
                        onLongPress = {
                            currentImageIndex.value = index
                            backgroundTransparency.value = false
                            imageListAvailable.value = false
                        }
                    )
                }
            }
        }
    }
}