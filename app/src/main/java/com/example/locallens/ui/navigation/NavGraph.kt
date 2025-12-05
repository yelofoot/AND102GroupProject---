package com.example.locallens.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.locallens.ui.home.HomeScreen
import com.example.locallens.ui.camera.CameraScreen
import com.example.locallens.ui.map.MapScreen
import com.example.locallens.ui.profile.ProfileScreen
import com.example.locallens.ui.submission.SubmissionPreviewScreen

@Composable
fun NavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") { HomeScreen(navController) }
        composable("camera") { CameraScreen(navController) }
        composable("map") { MapScreen(navController) }
        composable("profile") { ProfileScreen(navController) }
        composable("submissionPreview/{submissionId}") { backStackEntry ->
            val submissionId = backStackEntry.arguments?.getString("submissionId")
            SubmissionPreviewScreen(navController, submissionId)
        }
    }
}
