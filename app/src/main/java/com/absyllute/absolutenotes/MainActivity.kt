package com.absyllute.absolutenotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.absyllute.absolutenotes.home.HomeScreen
import com.absyllute.absolutenotes.ui.theme.AbsoluteNotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AbsoluteNotesTheme {
                HomeScreen()
            }
        }
    }
}