package com.example.tugashalamanregistrasi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNim = findViewById<EditText>(R.id.etNim)
        val etNama = findViewById<EditText>(R.id.etNama)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etTglLahir = findViewById<EditText>(R.id.etTglLahir)
        val btnDaftar = findViewById<Button>(R.id.btnDaftar)
        val tvHeader = findViewById<TextView>(R.id.tvHeader)

        btnDaftar.setOnClickListener {
            val nim = etNim.text.toString().trim()
            val nama = etNama.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val tglLahir = etTglLahir.text.toString().trim()

            if (nim.isNotEmpty() && nama.isNotEmpty() && email.isNotEmpty() && tglLahir.isNotEmpty()) {
                tvHeader.text = "$nama\n $nim"
                tvHeader.textAlignment = TextView.TEXT_ALIGNMENT_CENTER

                etNim.setText("")
                etNama.setText("")
                etEmail.setText("")
                etTglLahir.setText("")

                Toast.makeText(this, "Registrasi Berhasil!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Harap isi semua field", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
