package com.aria.player.viewmodel

import androidx.lifecycle.ViewModel
import com.aria.player.data.repository.MovieRepository
import com.aria.player.model.Movie
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MovieViewModel : ViewModel() {

    private val repository = MovieRepository()

    private val _movies = MutableStateFlow<List<Movie>>(emptyList())

    val movies: StateFlow<List<Movie>> = _movies


    fun addMovie(movie: Movie) {

        repository.addMovie(movie)

        _movies.value = repository.getMovies()
    }


    fun removeMovie(movie: Movie) {

        repository.removeMovie(movie)

        _movies.value = repository.getMovies()
    }


    fun likeMovie(movie: Movie) {

        repository.likeMovie(movie)

        _movies.value = repository.getMovies()
    }


    fun saveMovie(movie: Movie) {

        repository.saveMovie(movie)

        _movies.value = repository.getMovies()
    }
}
