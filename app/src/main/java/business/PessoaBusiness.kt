package business

import entity.PessoaEntity
import repository.PessoaRepository

class PessoaBusiness {

    fun salvar(nome: String, telefone: Int,  email: String,  senha: String){
        val pessoa = PessoaEntity (nome, telefone, email, senha)
        PessoaRepository.salvarPessoa(pessoa)
    }

    fun getlista(): List<PessoaEntity> {
        return PessoaRepository.getListPessoas()
    }



}