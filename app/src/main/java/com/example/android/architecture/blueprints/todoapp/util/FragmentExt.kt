package com.example.android.architecture.blueprints.todoapp.util

import androidx.fragment.app.Fragment
import com.example.android.architecture.blueprints.todoapp.data.source.DefaultTasksRepository

fun Fragment.getViewModelFactory(): ViewModelFactory {
    return ViewModelFactory(DefaultTasksRepository.getRepository(requireActivity().application))
}