package com.aria.player.data.model

data class Movie(
    val id: Long,
    val title: String,
    val filePath: String,
    val duration: Long = 0L,
    val size: Long = 0L,
    val isLiked: Boolean = false,
    val isSaved: Boolean = false,
    val lastPosition: Long = 0L
)
