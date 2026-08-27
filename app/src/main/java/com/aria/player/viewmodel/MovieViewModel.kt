package com.aria.player.viewmodel

import androidx.lifecycle.ViewModel
import com.aria.player.data.repository.MovieRepository
import com.aria.player.model.Movie
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MovieViewModel : ViewModel() {

    private val repository = MovieRepository()

    private val _movies =
        MutableStateFlow<List<Movie>>(emptyList())

    val movies: StateFlow<List<Movie>> = _movies


    fun addMovie(movie: Movie) {
        repository.addMovie(movie)
        refresh()
    }


    fun removeMovie(id: Int) {
        repository.removeMovie(id)
        refresh()
    }


    fun likeMovie(id: Int) {
        repository.likeMovie(id)
        refresh()
    }


    fun saveMovie(id: Int) {
        repository.saveMovie(id)
        refresh()
    }


    private fun refresh() {
        _movies.value = repository.getMovies()
    }
}
