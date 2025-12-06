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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController, homeViewModel: HomeViewModel = viewModel()) {
    val dailyChallenge by homeViewModel.dailyChallenge.collectAsState()

    dailyChallenge?.let { challenge ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = challenge.title,
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = challenge.description,
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(vertical = 16.dp)
            )
            Text(
                text = "Radius: ${challenge.radiusMeters.toInt()} meters",
                style = MaterialTheme.typography.bodyMedium
            )
            Button(
                onClick = { navController.navigate("camera") },
                modifier = Modifier.padding(top = 24.dp)
            ) {
                Text("Open Camera")
            }
            Button(
                onClick = { navController.navigate("map") },
                modifier = Modifier.padding(top = 12.dp)
            ) {
                Text("View Submissions Map")
            }
        }
    }
}
