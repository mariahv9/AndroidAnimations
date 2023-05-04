package com.example.animaciones.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.animaciones.R

@Composable
fun MyConstraintLayout() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
    ) {
        val (tweenAnim, springAnim, keyFrameAnim) = createRefs()

        TweenAnimation(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .constrainAs(tweenAnim) {})

        SpringAnimation(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .constrainAs(springAnim) {
                top.linkTo(tweenAnim.bottom, 25.dp)
                start.linkTo(tweenAnim.start)
            })

        KeyframeAnimation(modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(colorResource(id = R.color.box_three))
            .constrainAs(keyFrameAnim) {
                top.linkTo(springAnim.bottom, 25.dp)
                start.linkTo(tweenAnim.start)
            })
//        KeyframeAnimationExample()
    }
}
