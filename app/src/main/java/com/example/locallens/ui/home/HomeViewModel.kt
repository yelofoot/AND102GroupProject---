package com.example.locallens.ui.home

import androidx.lifecycle.ViewModel
import com.example.locallens.data.model.DailyChallenge
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel : ViewModel() {

    private val _dailyChallenge = MutableStateFlow(
        DailyChallenge(
            id = "1",
            title = "Urban Abstract",
            description = "Capture a photo that finds an abstract image in the urban environment.",
            radiusMeters = 500.0
        )
    )
    val dailyChallenge = _dailyChallenge.asStateFlow()
}
