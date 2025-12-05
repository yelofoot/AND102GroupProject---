package com.example.locallens.data.repository

import com.example.locallens.data.model.Submission
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map

object SubmissionRepository {

    private val submissions = MutableStateFlow<List<Submission>>(emptyList())

    fun addSubmission(submission: Submission) {
        val currentSubmissions = submissions.value.toMutableList()
        currentSubmissions.add(submission)
        submissions.value = currentSubmissions
    }

    fun getSubmissionsForChallenge(challengeId: String): Flow<List<Submission>> {
        return submissions.asStateFlow().map { list ->
            list.filter { it.challengeId == challengeId }
        }
    }

    fun getAllSubmissions(): Flow<List<Submission>> {
        return submissions.asStateFlow()
    }

    fun getSubmission(submissionId: String): Submission? {
        return submissions.value.find { it.id == submissionId }
    }
}
