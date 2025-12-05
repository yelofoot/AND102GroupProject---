package com.example.locallens.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController, homeViewModel: HomeViewModel = viewModel()) {
    val dailyChallenge by homeViewModel.dailyChallenge.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = dailyChallenge.title, style = MaterialTheme.typography.headlineMedium)
        Text(text = dailyChallenge.description, modifier = Modifier.padding(vertical = 16.dp))
        Text(text = "Radius: ${dailyChallenge.radiusMeters} meters")
        Button(
            onClick = { navController.navigate("camera") },
            modifier = Modifier.padding(top = 24.dp)
        ) {
            Text("Complete Challenge")
        }
    }
}
