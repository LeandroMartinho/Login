package com.example.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private var name: String = ""
    private var email: String = ""
    private var password: String = ""

    private lateinit var editTextName: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        editTextName = findViewById(R.id.insertname)
        editTextEmail = findViewById(R.id.insertemail)
        editTextPassword = findViewById(R.id.insertsenha)
        buttonRegister = findViewById(R.id.buttoncadastro)

        buttonRegister.setOnClickListener(View.OnClickListener {
            name = editTextName.text.toString()
            email = editTextEmail.text.toString()
            password = editTextPassword.text.toString()



            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("email", email)
            intent.putExtra("password", password)
            startActivity(intent)


            if (name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()) {
                // Aqui você pode realizar ações com as variáveis 'name', 'email' e 'password'.
                Toast.makeText(this, "Dados do usuário registrados com sucesso!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Preencha todos os campos.", Toast.LENGTH_SHORT).show()
            }
        })

        val cadastro = findViewById<Button>(R.id.buttonvoltartela)

        cadastro.setOnLongClickListener{
            irParaLogin()
            true
        }




    }

    private fun irParaLogin() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}

