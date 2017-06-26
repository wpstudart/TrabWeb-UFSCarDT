package br.ufscar.dc.dsw

class Funcionario extends Pessoa {

    static constraints = {
        salario(min:new Float(0.01))
    }

    Float salario
}
