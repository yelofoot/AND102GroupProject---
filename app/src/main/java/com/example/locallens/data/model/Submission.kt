package com.example.locallens.data.model

import android.net.Uri

data class Submission(
    val id: String = "",
    val challengeId: String = "",
    val imageUri: Uri,
    val timestamp: Long,
    val latitude: Double,
    val longitude: Double
)
