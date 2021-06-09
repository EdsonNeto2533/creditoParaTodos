package com.example.creditoParaTodos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import business.pessoaBusiness
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        BTNlogin.setOnClickListener {
            realizarLogin()
        }
        BTNcadastrar.setOnClickListener{
            Toast.makeText(this,"Preencha todos os campos", Toast.LENGTH_SHORT).show()
        }
    }


    fun realizarLogin(){
        val email = ETemail.toString()
        val senha = ETsenha.toString()
        val aux: pessoaBusiness = pessoaBusiness()
        val aux2 = aux.getlista()

        //valida campos preenchidos
        if (email.equals("")  || senha.equals("")){
            Toast.makeText(this,"Preencha todos os campos", Toast.LENGTH_SHORT).show()
        } else {
            //percorre a lista de pessoas em busca do usuario informado e se encontrado realiza o login
            for (i in aux2.withIndex()){
                if(i.value.email == email && i.value.senha == senha ){
                    val inti = Intent(this, MainActivity::class.java)
                    startActivity(inti)
                    break
                } else {
                    Toast.makeText(this,"Usuario não encontrado", Toast.LENGTH_SHORT).show()
                }
            }
        }




    }
}