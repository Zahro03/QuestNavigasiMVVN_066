package com.example.project5_mvvm.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.navigation.NavBackStackEntry
import com.example.project5_mvvm.model.DataMahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(DataMahasiswa())
    val uiState: StateFlow<DataMahasiswa> = _uiState.asStateFlow()

    fun saveDataMahasiswa(listDM: List<String>){
        _uiState.update { dataMhs ->
            dataMhs.copy(
                nama = listDM[0],
                gender = listDM[1],
                email = listDM[2],
                alamat = listDM[3],
                nim = listDM[4]
            )
        }
    }
}