package com.aria.player.data.repository

import com.aria.player.model.Movie

class MovieRepository {

    private val movies = mutableListOf<Movie>()

    fun getMovies(): List<Movie> {
        return movies
    }

    fun addMovie(movie: Movie) {
        movies.add(movie)
    }

    fun removeMovie(movieId: Int) {
        movies.removeIf {
            it.id == movieId
        }
    }

    fun likeMovie(movieId: Int) {
        val movie = movies.find {
            it.id == movieId
        }

        movie?.let {
            it.isLiked = !it.isLiked
        }
    }

    fun saveMovie(movieId: Int) {
        val movie = movies.find {
            it.id == movieId
        }

        movie?.let {
            it.isSaved = !it.isSaved
        }
    }
}
