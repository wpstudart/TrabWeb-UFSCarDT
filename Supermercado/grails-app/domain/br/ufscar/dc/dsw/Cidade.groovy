package br.ufscar.dc.dsw

class Cidade {

    static constraints = {
        nomeCidade(blank: false, size: 1 .. 30)
        estado(nullable: false)
    }

    String nomeCidade
    Estado estado

    String toString(){
        return "[" + this.getClass().getSimpleName() + "]" + nomeCidade
    }
}
