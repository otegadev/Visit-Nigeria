package com.example.visitnigeria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.visitnigeria.ui.screens.VisitNigeriaApp
import com.example.visitnigeria.ui.theme.VisitNigeriaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VisitNigeriaTheme {
               VisitNigeriaApp()
            }
        }
    }
}
