package br.ufscar.dc.dsw

class Compra {

    static hasMany = [produto: Produto]

    static constraints = {
        total(blank: false)
        numItens(blank: false)
    }

    float total
    double numItens
}
