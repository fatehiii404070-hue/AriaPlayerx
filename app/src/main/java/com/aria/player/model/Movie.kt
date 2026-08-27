package com.aria.player.model

data class Movie(
    val id: Long,
    var name: String,
    val path: String,
    var isSaved: Boolean = false,
    var isLiked: Boolean = false
)
