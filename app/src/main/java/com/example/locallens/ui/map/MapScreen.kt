package com.example.locallens.ui.map

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun MapScreen(navController: NavController, mapViewModel: MapViewModel = viewModel()) {
    val submissions by mapViewModel.submissions.collectAsState()
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(LatLng(40.7128, -74.0060), 10f) // Default to NYC
    }

    GoogleMap(
        modifier = Modifier.fillMaxSize(),
        cameraPositionState = cameraPositionState
    ) {
        submissions.forEach { submission ->
            Marker(
                state = MarkerState(position = LatLng(submission.latitude, submission.longitude)),
                title = "Submission",
                snippet = "Click to view",
                onInfoWindowClick = {
                    navController.navigate("submissionPreview/${submission.id}")
                }
            )
        }
    }
}
