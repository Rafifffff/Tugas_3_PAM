package com.example.tugashalamanregistrasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    var currentScreen by remember { mutableStateOf("daftar") }

    // data user
    var nim by remember { mutableStateOf("") }
    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        when (currentScreen) {
            "daftar" -> DaftarScreen(
                onDaftar = { inputNim, inputNama, inputEmail, inputPassword ->
                    nim = inputNim
                    nama = inputNama
                    email = inputEmail
                    password = inputPassword
                    currentScreen = "login"
                }
            )
            "login" -> LoginScreen(
                onLogin = { emailInput, passInput ->
                    if (emailInput == email && passInput == password) {
                        currentScreen = "detail"
                    }
                }
            )
            "detail" -> DetailScreen(nim = nim, nama = nama)
        }
    }
}
