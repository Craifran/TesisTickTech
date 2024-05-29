package com.example.proyectofinaltesis

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tvGoRegister = findViewById<TextView>(R.id.tv_go_to_register)
        tvGoRegister.setOnClickListener{
            goToRegister()
        }
        val tvGoLogin= findViewById<TextView>(R.id.tv_go_to_login)
        tvGoLogin.setOnClickListener{
            goToLogin()
        }
        val btnGoMenu = findViewById<Button>(R.id.btn_go_to_menu)
        btnGoMenu.setOnClickListener{
            goToMenu()

        }

    }

    private fun goToLogin() {
        val i = Intent(this,MainActivity::class.java)
        startActivity(i)
    }

    private fun goToRegister() {
        val i = Intent(this,RegisterActivity::class.java)
        startActivity(i)
    }

    private fun goToMenu() {
            val  i = Intent(this, MenuActivity::class.java)
        startActivity(i)
        }

}
