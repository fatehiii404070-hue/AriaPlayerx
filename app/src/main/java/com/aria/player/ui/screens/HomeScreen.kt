package com.aria.player.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Movie
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HomeScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF555555),
                        Color(0xFF202020)
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


            Icon(
                imageVector = Icons.Default.Movie,
                contentDescription = "Aria Player",
                modifier = Modifier.size(120.dp),
                tint = Color(0xFF00E676)
            )


            Spacer(
                modifier = Modifier.height(30.dp)
            )


            Text(
                text = "Aria Player",
                fontSize = 38.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )


            Spacer(
                modifier = Modifier.height(50.dp)
            )


            Button(
                onClick = {

                },
                modifier = Modifier.size(
                    width = 300.dp,
                    height = 90.dp
                ),
                shape = RoundedCornerShape(30.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFC107)
                )
            ) {

                Text(
                    text = "پخش فیلم",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }


            Spacer(
                modifier = Modifier.height(30.dp)
            )


            Button(
                onClick = {

                },
                modifier = Modifier.size(
                    width = 230.dp,
                    height = 70.dp
                ),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFFD54F)
                )
            ) {

                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "Settings"
                )

                Spacer(
                    modifier = Modifier.size(10.dp)
                )

                Text(
                    text = "تنظیمات",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
