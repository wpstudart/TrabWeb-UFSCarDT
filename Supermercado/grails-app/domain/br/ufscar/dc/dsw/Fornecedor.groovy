package br.ufscar.dc.dsw

class Fornecedor {

    static hasMany = [produto: Produto]

    static constraints = {
        nome(blank:false, size:1..100)
        cnpj (blank:false, unique:true)
        endereco(nullable: false)
    }

    String nome
    String cnpj
    Endereco endereco

    String toString(){
        return "[" + this.getClass().getSimpleName() + "]" + nome + ", " + endereco.toString()
    }
}
