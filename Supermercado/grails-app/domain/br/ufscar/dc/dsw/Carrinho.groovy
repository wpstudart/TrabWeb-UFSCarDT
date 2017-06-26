package br.ufscar.dc.dsw

class Carrinho {

    static hasMany = [produto: Produto]

    static constraints = {
        subtotal(blank: false)
        numItens(blank: false)
    }


}
