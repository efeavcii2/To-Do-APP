package com.example.to_do_project.ui

import android.widget.Toast
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.to_do_project.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun topappbar(navController: NavHostController = rememberNavController()) {

    val context = LocalContext.current.applicationContext
    androidx.compose.material3.TopAppBar(title = {
        Text(
            text = "To - Do",
            fontStyle = FontStyle.Italic,
            fontSize = 30.sp,
            color = Color.Black,

            )

    },
        navigationIcon = {
            IconButton(onClick = { Toast.makeText(context, "To-Do", Toast.LENGTH_SHORT).show() }) {
                Icon(painter = painterResource(id = R.drawable.todo), contentDescription = "")


            }

        },

        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Green,


            ), actions = {

        }
    )


}

