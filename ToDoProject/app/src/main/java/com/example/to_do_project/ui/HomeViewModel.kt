package com.example.to_do_project.ui

import androidx.compose.material3.TopAppBarState
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor():ViewModel(){
   private val  _todoList= mutableStateListOf<String>()
    val todoList:List<String> = _todoList


    fun addTodo(todo:String){
        _todoList.add(todo)
    }
    fun uptadeTodo(index: Int,newTodo:String){
        if (index in _todoList.indices) {
            _todoList[index] = newTodo
        }


    }
    fun deleteTodo(index: Int){
        if (index in _todoList.indices) {
            _todoList.removeAt(index)
        }

    }



}