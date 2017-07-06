package br.ufscar.dc.dsw

class Estado {

    static constraints = {
        nomeEstado(blank: false, min: 4)
    }

    String nomeEstado
    Cidade cidade

    String toString(){
        "[" + this.getClass().getSimpleName() + "]" + nomeEstado
    }
}
