package com.incirkus.myapplication.Composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BTNRandomButton(imageList: List<Int>, currentImageIndex: MutableState<Int>) {
    OutlinedButton(
        onClick = { currentImageIndex.value = (imageList.indices).random() },
        modifier = Modifier
            .padding(4.dp)
    ) {
        Text(text = "random background")
    }
}