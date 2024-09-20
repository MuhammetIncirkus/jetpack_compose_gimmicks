package com.incirkus.myapplication.Composables

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun BackgroundImage(imageResource: Int, backgroundTransparency: MutableState<Boolean>) {
    Box(modifier = Modifier.fillMaxSize())
    val backGroundImage: Painter = painterResource(imageResource)
    Crossfade(
        targetState = backgroundTransparency.value, label = ""
    ) {
        when (it) {
            true -> {
                Image(
                    painter = backGroundImage,
                    contentDescription = "Background image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .alpha(0.3f)
                )
            }

            false -> {
                Image(
                    painter = backGroundImage,
                    contentDescription = "Background image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .alpha(1f)
                )
            }
        }
    }
}