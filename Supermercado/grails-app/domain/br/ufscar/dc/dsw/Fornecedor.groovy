package br.ufscar.dc.dsw

class Fornecedor {

    static hasMany = [produtos: Produto]
    static hasOne = [endereco: Endereco]

    static constraints = {
        nome(blank:false, size:1..100)
    }

    String nome

    String toString(){
        "[" + this.getClass().getSimpleName() + "]" + nome + ", " + endereco
    }
}
