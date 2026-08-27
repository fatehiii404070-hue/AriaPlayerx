package com.aria.player.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.aria.player.data.model.Movie


@Composable
fun VideoFeedScreen() {


    val movies = listOf(

        Movie(
            id = 1,
            title = "Sample Movie 1",
            filePath = ""
        ),

        Movie(
            id = 2,
            title = "Sample Movie 2",
            filePath = ""
        ),

        Movie(
            id = 3,
            title = "Sample Movie 3",
            filePath = ""
        )
    )


    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = {
            movies.size
        }
    )


    VerticalPager(

        state = pagerState,

        modifier = Modifier
            .fillMaxSize()

    ) { page ->


        VideoItem(

            movie = movies[page]

        )

    }

}



@Composable
fun VideoItem(

    movie: Movie

) {


    Box(

        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),

        contentAlignment = Alignment.Center

    ){


        Text(

            text = movie.title,

            color = Color.White,

            fontSize = 30.sp

        )


    }


}
