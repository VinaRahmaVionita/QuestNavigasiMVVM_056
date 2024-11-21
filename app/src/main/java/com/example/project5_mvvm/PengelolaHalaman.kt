package com.example.project5_mvvm

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.project5_mvvm.model.DataJenisKelamin
import com.example.project5_mvvm.model.DataMahasiswa
import com.example.project5_mvvm.ui.view.DetailMahasiswaView
import com.example.project5_mvvm.ui.view.FormMahasiswaView
import com.example.project5_mvvm.ui.viewmodel.MahasiswaViewModel

enum class Halaman{
    Formulir,
    Detail
}

@Composable
fun PengelolaHalaman(
    navController: NavHostController = rememberNavController(),
    viewModel: MahasiswaViewModel = viewModel()
){
    val uiState by viewModel.uiState.collectAsState()

    NavHost(navController = navController, startDestination = Halaman.Formulir.name) {
        composable(route = Halaman.Formulir.name){
            val konteks = LocalContext.current
            FormMahasiswaView(
                listJK = DataJenisKelamin.listJk.map { id ->
                    konteks.resources.getString(
                        id
                    )
                },
                onSubmitClicked = {
                        data ->
                    // Menyimpan data mahasiswa ke ViewModel
                    viewModel.saveDataMahasiswa(data)
                    // Navigasi ke halaman Detail
                    navController.navigate(Halaman.Detail.name)
                }
            )

        }
        composable(route = Halaman.Detail.name) {
            DetailMahasiswaView(
                uiStateMahasiswa = uiState,
                onBackButton = {
                    // Kembali ke halaman Formulir
                    navController.popBackStack()
                }
            )
        }

    }
}
