package br.ufscar.dc.dsw

class Produto {

    static belongsTo = [fornecedor: Fornecedor]

    static constraints = {
        nomeProd(blank:false, size:1..50)
        valorProd(min:new Float(0.01))
        quantidade(min:0)
        codProd(min:0, unique: true)
        validadeProd(nullable: false)
    }

    String nomeProd
    float valorProd
    int quantidade
    int codProd
    Date validadeProd

    String toString() {
        return "[" + this.getClass().getSimpleName() + "]" + nomeProd + ", " + valorProd + ", " + quantidade +
                ", " + codProd + ", " + validadeProd
    }
}
