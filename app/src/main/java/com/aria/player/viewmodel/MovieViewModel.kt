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

    init {
        loadMovies()
    }

    private fun loadMovies() {
        _movies.value = repository.getMovies()
    }

    fun likeMovie(id: Int) {
        repository.toggleLike(id)
        loadMovies()
    }

    fun saveMovie(id: Int) {
        repository.toggleSave(id)
        loadMovies()
    }
}
