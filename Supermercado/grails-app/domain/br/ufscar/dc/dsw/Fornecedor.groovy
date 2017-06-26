package br.ufscar.dc.dsw

class Fornecedor {

    static hasMany = [produtos: Produto]

    static constraints = {
        nome(blank:false, size:1..100)
    }

    String nome
    Endereco endereco

    String toString(){
        "[" + this.getClass().getSimpleName() + "]" + nome + ", " + endereco
    }
}
