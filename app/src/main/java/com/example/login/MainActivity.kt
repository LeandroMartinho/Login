package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextEmail = findViewById<EditText>(R.id.editemail)
        val editTextSenha = findViewById<EditText>(R.id.editsenha)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val password = intent.getStringExtra("password")

        buttonLogin.setOnClickListener(View.OnClickListener {
            val inputemail = editTextEmail.text.toString()
            val inputsenha = editTextSenha.text.toString()

            if (inputemail == email && inputsenha == password){
                Toast.makeText(this, "Login Bem sucedido!!", Toast.LENGTH_SHORT ).show()
        } else {
            Toast.makeText(this, "Email ou senha incorretos", Toast.LENGTH_SHORT).show()
        }
    })


        val cadastro = findViewById<Button>(R.id.buttonircadastrar)

        cadastro.setOnLongClickListener{
            irParaCadastro()
            true
        }


    }

    private fun irParaCadastro() {

        val i = Intent(this, MainActivity2::class.java)
        startActivity(intent)

    }
}
