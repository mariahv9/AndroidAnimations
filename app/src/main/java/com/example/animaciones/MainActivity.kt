package com.example.animaciones

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import com.example.animaciones.ui.components.MyConstraintLayout

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContent {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text("Animations Example") }
                        )
                    }
                ) {
                    MyConstraintLayout()
                }
            }
        }
    }
}
