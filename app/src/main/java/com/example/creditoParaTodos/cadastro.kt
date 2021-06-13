package com.example.creditoParaTodos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import business.PessoaBusiness
import entity.PessoaEntity
import kotlinx.android.synthetic.main.activity_cadastro.*


class cadastro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        BTNcadastrar.setOnClickListener {
            realizarCadastro()
        }
    }


    fun realizarCadastro(){
        val nome = ETnome.text.toString()
        val telefone = ETtelefone.text.toString().toInt()
        val email = ETemail.text.toString()
        val senha = ETsenha.text.toString()

        //realiza conferencia do preenchimento dos campos, se tudo ok realiza o cadastro
        if (nome.equals("") || telefone <= 0 || email.equals("") || senha.equals("")){
            Toast.makeText(this,"Preencha todos os campos", Toast.LENGTH_SHORT).show()
        } else {
            val aux: PessoaBusiness = PessoaBusiness()
            aux.salvar(nome, telefone, email, senha)
            val pessoa = PessoaEntity (nome, telefone, email, senha)
            Toast.makeText(this,"Cadastro Realizado com sucesso", Toast.LENGTH_LONG).show()
            val inti = Intent(this, login::class.java)
            startActivity(inti)
        }

    }
}