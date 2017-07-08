package br.ufscar.dc.dsw

class Cliente extends Pessoa {

    static constraints = {
        dataAniversario(nullable: false)
    }

    Date dataAniversario
}
