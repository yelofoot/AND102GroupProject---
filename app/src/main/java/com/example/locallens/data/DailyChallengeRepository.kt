package com.example.locallens.data

import com.example.locallens.data.model.DailyChallenge
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

object DailyChallengeRepository {
    // TODO: Replace with backend-driven daily challenge feed.
    private val currentChallenge = MutableStateFlow(
        DailyChallenge(
            id = "1",
            title = "Urban Abstract",
            description = "Capture an abstract pattern or shape you notice on your walk today.",
            radiusMeters = 500.0
        )
    )

    fun getDailyChallenge() = currentChallenge.asStateFlow()
}
