package com.projects.demopagingapp.presentation.ui.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.projects.demopagingapp.presentation.ui.theme.DemoPagingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoPagingAppTheme {

            }
        }
    }
}

