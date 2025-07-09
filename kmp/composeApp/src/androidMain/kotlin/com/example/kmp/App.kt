package com.example.kmp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import kmp.composeapp.generated.resources.Res
import kmp.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App(mainViewModel: MainViewModel = viewModel()) {
    MaterialTheme {
        val greeting by mainViewModel.greetingList.collectAsStateWithLifecycle()

        Column(
            modifier = Modifier
                .padding(10.dp)
                .safeContentPadding()
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            greeting.forEach { greeting ->
                Text(greeting)
                HorizontalDivider()
            }
        }
    }
}