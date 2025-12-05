package com.example.locallens.ui.profile

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun ProfileScreen(navController: NavController, profileViewModel: ProfileViewModel = viewModel()) {
    val submissions by profileViewModel.submissions.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Total Challenges Completed: ${submissions.size}",
            style = MaterialTheme.typography.headlineSmall
        )

        LazyColumn(modifier = Modifier.padding(top = 16.dp)) {
            items(submissions) { submission ->
                Text(
                    text = "Submission from ${submission.timestamp}",
                    modifier = Modifier.clickable { navController.navigate("submissionPreview/${submission.id}") }
                )
            }
        }
    }
}
