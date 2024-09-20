package com.incirkus.myapplication.Composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Switch(imageListOrCarousel: MutableState<Boolean>) {
    Box(
        modifier = Modifier
            .padding(top = 16.dp),
        contentAlignment = Alignment.Center
    ) {
        androidx.compose.material3.Switch(
            checked = imageListOrCarousel.value,
            onCheckedChange = {
                imageListOrCarousel.value = it
            },
            thumbContent = if (imageListOrCarousel.value) {
                {
                    Icon(
                        imageVector = Icons.Filled.Check,
                        contentDescription = null,
                        modifier = Modifier.size(SwitchDefaults.IconSize),
                    )
                }
            } else {
                null
            }
        )
    }
}