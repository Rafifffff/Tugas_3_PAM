package com.example.tugashalamanregistrasi

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DetailScreen(nim: String, nama: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF121212))
            .padding(16.dp)
    ) {
        Text("Halaman Detail", style = MaterialTheme.typography.headlineSmall, color = Color(0xFF4CAF50))
        Spacer(Modifier.height(16.dp))

        Text("NIM: $nim", color = Color.Green)
        Spacer(Modifier.height(8.dp))
        Text("Nama: $nama", color = Color.Green)
    }
}
