package com.example.locallens.ui.camera

import android.net.Uri
import androidx.lifecycle.ViewModel
import com.example.locallens.data.DailyChallengeRepository
import com.example.locallens.data.model.Submission
import com.example.locallens.data.repository.SubmissionRepository
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking

class CameraViewModel : ViewModel() {

    fun addSubmission(imageUri: Uri, latitude: Double, longitude: Double) {
        val challenge = runBlocking { DailyChallengeRepository.getDailyChallenge().first() }
        val submission = Submission(
            challengeId = challenge.id,
            challengeTitle = challenge.title,
            imageUri = imageUri,
            timestamp = System.currentTimeMillis(),
            latitude = latitude,
            longitude = longitude
        )
        SubmissionRepository.addSubmission(submission)
    }
}
