package br.ufscar.dc.dsw

class Cliente extends Pessoa {

    static constraints = {
        dataAniversario(blank:false, min:10)
    }

    String dataAniversario
}
