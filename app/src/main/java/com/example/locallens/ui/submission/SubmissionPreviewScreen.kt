package com.example.locallens.ui.submission

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.locallens.data.repository.SubmissionRepository
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun SubmissionPreviewScreen(navController: NavController, submissionId: String?) {
    val submission = submissionId?.let { SubmissionRepository.getSubmission(it) }
    val formatter = remember { SimpleDateFormat("MMM dd, yyyy HH:mm", Locale.getDefault()) }

    if (submission != null) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Image(
                painter = rememberAsyncImagePainter(submission.imageUri),
                contentDescription = "Submission Image",
                modifier = Modifier
                    .fillMaxSize(0.8f)
                    .padding(bottom = 16.dp)
            )
            Text(
                text = submission.challengeTitle,
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Captured: ${formatter.format(Date(submission.timestamp))}",
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = "Coordinates: ${submission.latitude}, ${submission.longitude}",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = "TODO: Add distance from user, likes, comments",
                style = MaterialTheme.typography.bodySmall
            )
        }
    } else {
        Text(text = "Submission not found")
    }
}
