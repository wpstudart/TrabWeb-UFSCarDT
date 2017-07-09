package br.ufscar.dc.dsw

class Pessoa {

    static constraints = {
        nomePessoa(size:1..100)
        sexoPessoa(inList:["F", "M"])
        endereco(nullable: false)
        cpf(nullable: false)
    }

    static mapping = {
        tablePerHierarchy false
    }

    String cpf
    String nomePessoa
    String sexoPessoa
    Endereco endereco

    String toString(){
        "[" + this.getClass().getSimpleName() + "]" + nomePessoa + ", " + cpf + ", " + sexoPessoa
    }

}
