package br.ufscar.dc.dsw

class Estado {

    static constraints = {
        nomeEstado(blank: false, size: 1..20)
        sigla(nullable: false, size: 2..2)
    }

    String nomeEstado
    String sigla

    String getSigla() {
        return sigla
    }

    String toString(){
        return "[" + this.getClass().getSimpleName() + "]" + nomeEstado
    }
}
