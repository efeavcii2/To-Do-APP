package com.example.to_do_project.ui.todouptade

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.to_do_project.ui.HomeViewModel
import com.example.to_do_project.ui.tododelete.delete

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun uptade(
    viewModel: HomeViewModel = hiltViewModel(),
    navController: NavHostController = rememberNavController(),
) {
    val textFields by remember { mutableStateOf(viewModel.todoList) }

    Column(modifier = Modifier.padding(50.dp)) {
        textFields.forEachIndexed { index, text ->
            OutlinedTextField(
                value = text,
                onValueChange = { newText ->
                    viewModel.uptadeTodo(index, newText) // ViewModel'de to-do güncelle
                },
                trailingIcon = {
                    delete()
                },
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = Color.Black,
                    containerColor = Color.Green.copy(.4f)
                ),
                shape = CutCornerShape(topStart = 15.dp, topEnd = 15.dp),
                label = { Text(text = "To-Do ${index + 1}") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 2.dp)
                    .padding(top = 20.dp)
            )
        }
    }

}