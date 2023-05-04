package com.example.animaciones.ui.components

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.animaciones.R

@Composable
fun SpringAnimation(modifier: Modifier) {
    var boxSize by remember { mutableStateOf(50.dp) }
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.White)
            .clickable {
                boxSize += 50.dp
            }
    ) {
        Box(
            modifier = Modifier
                .size(boxSize)
                .background(colorResource(id = R.color.box_two))
                .align(Alignment.Center)
                .animateContentSize(
                    spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
        )
    }
}
