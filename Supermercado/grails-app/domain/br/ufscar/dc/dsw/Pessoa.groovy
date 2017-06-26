package br.ufscar.dc.dsw

class Pessoa {

    static constraints = {
        nomePessoa(blank:false, size:1..100)
        sexoPessoa(size:1..15)
        CPF(min:11)
    }

    int CPF
    String nomePessoa
    String sexoPessoa
    Endereco endereco

    String toString(){
        "[" + this.getClass().getSimpleName() + "]" + nomePessoa + ", " + CPF + ", " + sexoPessoa
    }

}
