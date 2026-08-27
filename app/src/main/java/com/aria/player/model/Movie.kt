package com.aria.player.model

data class Movie(
    val id: Int,
    val title: String,
    val uri: String,
    var isLiked: Boolean = false,
    var isSaved: Boolean = false
)
