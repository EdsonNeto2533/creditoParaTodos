package repository

import entity.PessoaEntity

class PessoaRepository {

            //Lista de pessoas cadastradas
            companion object{
                val listaPessoas = mutableListOf<PessoaEntity>()

                fun salvarPessoa(pessoa: PessoaEntity){
                    listaPessoas.add(pessoa)
                }

                fun getListPessoas(): List<PessoaEntity>{
                    return listaPessoas
                }
            }


    }
