package com.example.animaciones.ui.components

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.animateValue
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.keyframes
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun KeyframeAnimation(modifier: Modifier) {
    val size by remember { mutableStateOf(50.dp) }

    val infiniteTransition = rememberInfiniteTransition()
    val sizeAnimation by infiniteTransition.animateValue(
        initialValue = 50.dp,
        targetValue = 80.dp,
        typeConverter = Dp.VectorConverter,
        animationSpec = infiniteRepeatable(
            animation = keyframes {
                durationMillis = 3000
                size at 0 with LinearOutSlowInEasing
                size * 1.5f at 1000 with FastOutSlowInEasing
                size * 2f at 2000 with LinearOutSlowInEasing
                size * 1.5f at 3000 with FastOutSlowInEasing
                size at 4000 with LinearOutSlowInEasing
            },
            repeatMode = RepeatMode.Restart
        )
    )

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Canvas(
            modifier = Modifier
                .size(sizeAnimation)
                .background(Color.Transparent)
        ) {
            drawCircle(
                color = Color.Black,
                radius = sizeAnimation.toPx() / 2f,
                center = Offset(sizeAnimation.toPx() / 2f, sizeAnimation.toPx() / 2f)
            )
        }
    }
}
