package com.aria.player.data.repository

import com.aria.player.model.Movie

class MovieRepository {

    private val movies = mutableListOf(
        Movie(
            id = 1,
            title = "Sample Video 1",
            path = ""
        ),
        Movie(
            id = 2,
            title = "Sample Video 2",
            path = ""
        )
    )

    fun getMovies(): List<Movie> {
        return movies
    }

    fun toggleLike(movieId: Int) {
        val movie = movies.find { it.id == movieId }
        movie?.let {
            it.isLiked = !it.isLiked
        }
    }

    fun toggleSave(movieId: Int) {
        val movie = movies.find { it.id == movieId }
        movie?.let {
            it.isSaved = !it.isSaved
        }
    }
}
