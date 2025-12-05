package com.example.locallens.ui.camera

import android.net.Uri
import androidx.lifecycle.ViewModel
import com.example.locallens.data.model.Submission
import com.example.locallens.data.repository.SubmissionRepository
import java.util.UUID

class CameraViewModel : ViewModel() {

    fun addSubmission(imageUri: Uri, latitude: Double, longitude: Double) {
        val submission = Submission(
            id = UUID.randomUUID().toString(),
            challengeId = "1", // Hardcoded for now
            imageUri = imageUri,
            timestamp = System.currentTimeMillis(),
            latitude = latitude,
            longitude = longitude
        )
        SubmissionRepository.addSubmission(submission)
    }
}
