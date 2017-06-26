package br.ufscar.dc.dsw

class Endereco {

    static constraints = {
        rua(blank:false, size:1..40)
        numero(blank:false, min:1)
        bairro(blank:false, size:1..20)
        logradouro(size:1..50)
        cep(blank:false, min:8)
        cidade(blank:false, min:1..30)
        estado(blank:false, min:1..20)
    }

    String rua
    int numero
    String bairro
    String logradouro
    String cep
    String cidade
    String estado

    String toString(){
        "[" + this.getClass().getSimpleName() + "] " + rua + ", " + numero + "\n" + bairro + ", " +
                logradouro + "\n" + cep + "\n" + cidade + " - " + estado
    }

}
