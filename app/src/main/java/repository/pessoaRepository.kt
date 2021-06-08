package repository

import entity.PessoaEntity

class pessoaRepository {
    companion object {
        private val listaPessoas = mutableListOf<PessoaEntity>()

        fun salvarPessoa(pessoa: PessoaEntity){
            listaPessoas.add(pessoa)
        }

        fun getListPessoas(): List<PessoaEntity>{
            return listaPessoas
        }

    }
}