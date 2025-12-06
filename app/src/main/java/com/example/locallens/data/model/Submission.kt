package com.example.locallens.data.model

import android.net.Uri
import java.util.UUID

data class Submission(
    val id: String = UUID.randomUUID().toString(),
    val challengeId: String,
    val challengeTitle: String,
    val imageUri: Uri,
    val timestamp: Long,
    val latitude: Double,
    val longitude: Double
)
