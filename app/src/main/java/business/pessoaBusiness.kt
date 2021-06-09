package business

import entity.PessoaEntity
import repository.pessoaRepository

class pessoaBusiness {


    /*
    fun validar_user(nome: String, telefone: Int,  email: String,  senha: String){
        if (nome == ""){
            throw Exception("Nome é obrigatorio")
        }
        if (email == ""){
            throw Exception("Email é obrigatorio")
        }
        if (senha == ""){
            throw Exception("Senha é obrigatorio")
        }

    }

     */
    fun salvar(nome: String, telefone: Int,  email: String,  senha: String){
        val pessoa = PessoaEntity (nome, telefone, email, senha)
        pessoaRepository.salvarPessoa(pessoa)
    }

    fun getlista(): List<PessoaEntity> {
        return pessoaRepository.getListPessoas()
    }

}