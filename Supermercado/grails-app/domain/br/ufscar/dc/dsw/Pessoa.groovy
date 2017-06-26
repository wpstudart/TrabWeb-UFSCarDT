package br.ufscar.dc.dsw

class Pessoa {

    static hasOne = [endereco: Endereco]

    static constraints = {
        nomePessoa(blank:false, size:1..100)
        sexoPessoa(size:1..15)
        CPF(min:11)
    }

    int CPF
    String nomePessoa
    String sexoPessoa

    String toString(){
        "[" + this.getClass().getSimpleName() + "]" + nomePessoa + ", " + CPF + ", " + sexoPessoa
    }

}
