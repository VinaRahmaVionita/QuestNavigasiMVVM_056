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
        OutlinedTextField(
            value = nama, //nilai text yang akan ditampilkan dan di simpan ke variable nama
            onValueChange = {nama = it}, //lamda function setiap kali ada perubahan maka langsung di perbarui dengan text yang baru (it merujuk ke text yg dimasukkan)
            placeholder = { Text("Masukkan Nama")}, //sebagai petunjuk ketika kolom masih kosong
            label = { Text("Nama")}, //judul
            modifier = Modifier
                .fillMaxWidth() //memenuhi lebar layar yang tersedia
                .padding(1.dp)
        )

        Row() {
            listJK.forEach { item -> //loop
                Row (verticalAlignment = Alignment.CenterVertically) //agar sejajar dengan radio button
                { RadioButton(selected = selectedGender == item,
                    onClick = {
                        selectedGender = item //variable item untuk menyimpan nilai gender
                    })
                    Text(item)
                }
            }

        }

        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            placeholder = { Text("Masukkan Email")},
            label = { Text("Email")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier
                .fillMaxWidth()
                .padding(1.dp)
        )

        OutlinedTextField(
            value = alamat,
            onValueChange = {alamat = it},
            placeholder = { Text("Masukkan Alamat")},
            label = { Text("Alamat")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(1.dp)
        )

        OutlinedTextField(
            value = nim,
            onValueChange = {nim = it},
            placeholder = { Text("Masukkan NIM")},
            label = { Text("NIM")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
                .padding(1.dp)
        )


    }

}

