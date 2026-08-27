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


@Composable
fun VideoFeedScreen() {

    val movies = listOf(
        "Sample Movie 1",
        "Sample Movie 2",
        "Sample Movie 3"
    )


    val pagerState = rememberPagerState(
        pageCount = {
            movies.size
        }
    )


    VerticalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize()
    ) { page ->


        VideoItem(
            title = movies[page]
        )

    }
}



@Composable
fun VideoItem(
    title: String
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {


        Text(
            text = title,
            color = Color.White,
            fontSize = 30.sp
        )

    }
}
