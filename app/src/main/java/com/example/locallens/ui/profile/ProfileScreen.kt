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
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun ProfileScreen(navController: NavController, profileViewModel: ProfileViewModel = viewModel()) {
    val submissions by profileViewModel.submissions.collectAsState()
    val dateFormatter = remember { SimpleDateFormat("MMM dd, yyyy HH:mm", Locale.getDefault()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Completed challenges: ${submissions.size}",
            style = MaterialTheme.typography.headlineSmall
        )

        LazyColumn(modifier = Modifier.padding(top = 16.dp)) {
            items(submissions) { submission ->
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .clickable { navController.navigate("submissionPreview/${submission.id}") }
                        .padding(vertical = 8.dp)
                ) {
                    Text(
                        text = submission.challengeTitle,
                        style = MaterialTheme.typography.bodyLarge
                    )
                    Text(
                        text = "Taken: ${dateFormatter.format(Date(submission.timestamp))}",
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }
    }
}
