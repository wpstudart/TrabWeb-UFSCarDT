package br.ufscar.dc.dsw

class Produto {

    static belongsTo = [fornecedor: Fornecedor]

    static constraints = {
        nomeProd(blank:false, size:1..50)
        valorProd(min:new Float(0.01))
        quantidade(min:0)
        codProd(min:0)
        validadeProd(size:1..10)
    }

    String nomeProd
    float valorProd
    int quantidade
    int codProd
    String validadeProd

    String toString() {
        "[" + this.getClass().getSimpleName() + "]" + nomeProd + ", " + valorProd + ", " + quantidade +
                ", " + codProd + ", " + validadeProd
    }
}
