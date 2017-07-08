package br.ufscar.dc.dsw

class Pessoa {

    static constraints = {
        nomePessoa(size:1..100)
        sexoPessoa(inList:["F", "M"])
        CPF(min:11)
        endereco(nullable: false)
    }

    static mapping = {
        tablePerHierarchy false
    }

    int CPF
    String nomePessoa
    String sexoPessoa
    Endereco endereco

    String toString(){
        "[" + this.getClass().getSimpleName() + "]" + nomePessoa + ", " + CPF + ", " + sexoPessoa
    }

}
