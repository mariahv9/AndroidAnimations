package com.example.animaciones.ui.components

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun TweenAnimation(modifier: Modifier) {
    var color by remember { mutableStateOf(Color.Red) }

    val infiniteTransition = rememberInfiniteTransition()
    val colorAnimation by infiniteTransition.animateColor(
        initialValue = Color.Red,
        targetValue = Color.Blue,
        animationSpec = infiniteRepeatable(
            animation = tween(2000),
            repeatMode = RepeatMode.Reverse
        )
    )

    Box(
        modifier = modifier
            .background(color = colorAnimation)
            .clickable { color = if (color == Color.Red) Color.Blue else Color.Red }
    ) {
        Text(
            text = "Tween Animation!",
            fontSize = 30.sp,
            color = Color.White,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}
