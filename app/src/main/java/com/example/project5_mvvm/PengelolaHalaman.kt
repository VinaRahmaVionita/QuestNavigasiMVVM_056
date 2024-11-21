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
