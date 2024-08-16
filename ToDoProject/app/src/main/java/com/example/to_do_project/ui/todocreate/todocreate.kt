package com.example.to_do_project.ui.todocreate

import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.to_do_project.R
import com.example.to_do_project.ui.HomeViewModel

@Composable
fun create(viewModel: HomeViewModel = hiltViewModel(),navController: NavHostController = rememberNavController()){

    ExtendedFloatingActionButton(
        onClick = {
           viewModel.addTodo("") // Yeni boş bir To-Do ekle
        },
        containerColor = Color.Green, // Fab rengi
        content = {
            Icon(
                painter = painterResource(id = R.drawable.ekleimg), // İkon kaynağı
                contentDescription = "Add To-Do",
                tint = Color.Black
            )
        }
    )


}


@Preview(showBackground = true)
@Composable
fun PreviewTopAppBar() {
    create(navController = rememberNavController())
}