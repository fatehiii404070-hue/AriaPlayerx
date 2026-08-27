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

    fun removeMovie(movie: Movie) {
        movies.remove(movie)
    }

    fun likeMovie(movie: Movie) {
        movie.isLiked = !movie.isLiked
    }

    fun saveMovie(movie: Movie) {
        movie.isSaved = !movie.isSaved
    }
}
