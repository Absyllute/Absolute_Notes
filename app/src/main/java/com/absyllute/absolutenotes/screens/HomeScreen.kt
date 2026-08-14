package com.absyllute.absolutenotes.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.absyllute.absolutenotes.R
import com.absyllute.absolutenotes.ui.theme.AbsoluteNotesTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("aNotes")
                }
            )
        },

        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = {},
                text = { Text("New Note") },
                icon = {
                    Icon(
                        painter = painterResource(id = R.drawable.pen_icon ),
                        contentDescription = "Add a new note"
                    )
                }
            )
        }

    ) { paddingValues ->
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Notes Go Here")
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL
)
fun HSPreview() {
    AbsoluteNotesTheme {
        HomeScreen()
    }
}