package com.example.mvvmexemplo.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainViewModelFactory(): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel() as T
        }
        throw IllegalAccessException("ViewModel não encontrado")
    }
}