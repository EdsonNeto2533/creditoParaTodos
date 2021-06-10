package business

import entity.PessoaEntity
import repository.pessoaRepository

class pessoaBusiness {

    fun salvar(nome: String, telefone: Int,  email: String,  senha: String){
        val pessoa = PessoaEntity (nome, telefone, email, senha)
        pessoaRepository.salvarPessoa(pessoa)
    }

    fun getlista(): List<PessoaEntity> {
        return pessoaRepository.getListPessoas()
    }

}