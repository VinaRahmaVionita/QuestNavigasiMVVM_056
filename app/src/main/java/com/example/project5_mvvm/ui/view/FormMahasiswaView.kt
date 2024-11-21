package com.example.project5_mvvm.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp


@Composable
fun FormMahasiswaView(
    modifier: Modifier = Modifier,
    listJK: List<String>,
    onSubmitClicked: (MutableList<String>) -> Unit

){  //Deklarasi Variabel untuk Input Pengguna
    var nama by rememberSaveable { mutableStateOf(" ") }
    var selectedGender by remember { mutableStateOf(" ") }
    var email by remember { mutableStateOf(" ") }
    var alamat by remember { mutableStateOf(" ") }
    var nim by remember { mutableStateOf(" ") }

    val dataMahasiswa: MutableList<String> = mutableListOf(nama, selectedGender, email, alamat, nim )

    Column (Modifier.fillMaxSize() //Mengisi seluruh ukuran layar
        .padding(16.dp)
        ,horizontalAlignment = Alignment.CenterHorizontally //Mengatur agar setiap elemen di dalam Column disusun rata tengah secara horizontal
    ) {


    }

}

