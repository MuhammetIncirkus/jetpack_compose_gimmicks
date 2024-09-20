package com.incirkus.myapplication.Composables

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LayoutScaffold(
    backgroundTransparency: MutableState<Boolean>,
    imageList: List<Int>,
    currentImageIndex: MutableState<Int>,
    imageListAvailable: MutableState<Boolean>,
    imageListOrCarousel: MutableState<Boolean>,
    currentImagePosition: MutableState<Int>,
) {
    Scaffold(
        bottomBar = {
            ButtonRow(
                backgroundTransparency,
                imageList,
                currentImageIndex,
                imageListAvailable,
                currentImagePosition
            )
        },
        floatingActionButton = {
            AnimatedContent(
                targetState = imageListAvailable.value,
                content = { isVisible ->
                    if (isVisible) {
                        Switch(imageListOrCarousel)
                    } else {
                        ImageSlider(
                            imageList, currentImageIndex,
                        )
                    }
                },
                transitionSpec = {
                    fadeIn() togetherWith fadeOut()
                }, label = ""
            )
        },
        floatingActionButtonPosition = FabPosition.Center
    ) {
        BackgroundImage(imageList[currentImageIndex.value], backgroundTransparency)

        AnimatedVisibility(
            visible = imageListAvailable.value,
            enter = slideInHorizontally() + fadeIn(),
            exit = slideOutHorizontally() + fadeOut()
        ) {

            AnimatedContent(
                targetState = imageListOrCarousel.value,
                content = { isVisible ->
                    if (isVisible) {
                        ImageCarousel(
                            imageList,
                            backgroundTransparency,
                            currentImageIndex,
                            imageListAvailable,
                            currentImagePosition
                        )
                    } else {
                        ImageList(
                            imageList,
                            backgroundTransparency,
                            currentImageIndex,
                            imageListAvailable
                        )
                    }
                },
                transitionSpec = {
                    slideInHorizontally(
                        initialOffsetX = {
                            if (imageListOrCarousel.value) it else -it
                        }
                    ) togetherWith slideOutHorizontally(
                        targetOffsetX = {
                            if (imageListOrCarousel.value) -it else it
                        }
                    )
                }, label = ""
            )

        }

    }
}