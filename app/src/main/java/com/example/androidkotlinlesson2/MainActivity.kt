package com.example.androidkotlinlesson2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.androidkotlinlesson2.ui.theme.AndroidKotlinLesson2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidKotlinLesson2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LayoutLessonScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
