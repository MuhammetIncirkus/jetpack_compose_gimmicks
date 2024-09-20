package com.incirkus.myapplication.Composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BTNAlphaButton(backgroundTransparency: MutableState<Boolean>) {
    OutlinedButton(
        onClick = {
            backgroundTransparency.value = !backgroundTransparency.value
        },
        modifier = Modifier
            .padding(4.dp)
    ) {
        Text(text = "transparency on/of")
    }
}