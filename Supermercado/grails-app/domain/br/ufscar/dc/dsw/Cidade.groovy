package br.ufscar.dc.dsw

class Cidade {

    static constraints = {
        nomeCidade(blank: false, min:4)
    }

    String nomeCidade

    String toString(){
        "[" + this.getClass().getSimpleName() + "]" + nomeCidade
    }
}
