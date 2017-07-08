package br.ufscar.dc.dsw

class Endereco {

    static constraints = {
        numero(min:1)
        bairro(blank:false, size:1..20)
        logradouro(size:1..50)
        complemento(nullable: true, size:1..50)
        cep(blank:false,  size: 9..9)
        cidade(nullable: false)
    }

    int numero
    String bairro
    String logradouro
    String complemento
    String cep
    Cidade cidade
    //Estado estado

    String toString(){
        return "[" + this.getClass().getSimpleName() + "] " + logradouro + ", " + numero +
                (complemento == null ? "" : " " + complemento) + ". " + bairro + "\n" + cep + " " + cidade //+ " - " + estado.getSigla()
    }

}
