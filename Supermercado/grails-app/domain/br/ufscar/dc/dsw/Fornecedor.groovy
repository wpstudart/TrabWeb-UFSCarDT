package br.ufscar.dc.dsw

class Fornecedor {

    static hasMany = [produtos: Produto]

    static constraints = {
        nome(blank:false, size:1..100)
        cnpj (blank:false, unique:true, size:18..18)
        endereco(nullable: false)
    }

    String nome
    String CNPJ
    Endereco endereco

    String toString(){
        return "[" + this.getClass().getSimpleName() + "]" + nome + ", " + endereco.toString()
    }
}
