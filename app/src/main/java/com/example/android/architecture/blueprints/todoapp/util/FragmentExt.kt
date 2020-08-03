package com.example.android.architecture.blueprints.todoapp.util

import androidx.fragment.app.Fragment
import com.example.android.architecture.blueprints.todoapp.TodoApplication

fun Fragment.getViewModelFactory(): ViewModelFactory {
    return ViewModelFactory((requireActivity().applicationContext as TodoApplication).tasksRepository)
}