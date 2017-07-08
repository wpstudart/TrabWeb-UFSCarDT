import br.ufscar.dc.dsw.*

class BootStrap {

    def init = { servletContext ->

        def saoPaulo = new Estado(sigla: 'SP', nome: 'São Paulo')

        saoPaulo.save()
        if(saoPaulo.hasErrors()){
            println saoPaulo.errors
        }

        println 'Populando Estados - ok'

        def saoCarlos = new Cidade(nome: 'São Carlos', estado: saoPaulo)

        saoCarlos.save()
        if(saoCarlos.hasErrors()){
            println saoCarlos.errors
        }

        def saoPauloCidade = new Cidade(nome: 'São Paulo', estado: saoPaulo)

        saoPauloCidade.save()
        if (saoPauloCidade.hasErrors()){
            println saoPauloCidade.errors
        }

        println 'Populando Cidades - ok'

        def enderecoAdmin = new Endereco(
                logradouro: 'Avenida São Carlos',
                numero: 6969,
                bairro: "Centro",
                cep: '13569-200',
                cidade: saoCarlos
        )

        enderecoAdmin.save()
        if(enderecoAdmin.hasErrors()){
            println enderecoAdmin.errors
        }

        def enderecoFornecedor = new Endereco(
                logradouro: 'Via Washington Luis',
                numero: 235,
                bairro: "UFSCar",
                cep: '13560-690',
                cidade: saoCarlos
        )

        enderecoFornecedor.save()
        if(enderecoFornecedor.hasErrors()){
            println enderecoFornecedor.errors
        }

        def enderecoFuncionario = new Endereco(
                logradouro: 'Av. Getulio Vargas',
                numero: 1200,
                bairro: "Casa das Tias",
                cep: '13560-224',
                cidade: saoCarlos
        )

        enderecoFuncionario.save()
        if(enderecoFuncionario.hasErrors()){
            println enderecoFuncionario.errors
        }

        def enderecoCliente = new Endereco(
                logradouro: 'Av. Sao Paulo',
                numero: 24,
                bairro: 'Quebrada',
                cep: '13569201',
                cidade: saoCarlos
        )

        enderecoCliente.save()
        if (enderecoCliente.hasErrors()){
            println enderecoCliente.errors
        }

        def adminPapel = Papel.findByAuthority("ROLE_ADMIN") ?:
                new Papel(authority: "ROLE_ADMIN").save()

        def admin = new Funcionario(
                username: "admin",
                password: "admin",
                nomePessoa: "Gerente",
                enabled: true,
                sexoPessoa: "M",
                CPF: "14410234536",
                salario: 1000.0,
                endereco: enderecoAdmin
        )

        admin.save()
        if (admin.hasErrors()){
            println admin.errors
        }

        FuncionarioPapel.create(admin, adminPapel)

        println 'Populando usuario admin - ok'

        def funcPapel = Papel.findByAuthority("ROLE_USER")?:
                new Papel(authority: "ROLE_USER").save()

        def messias = new Funcionario(
                username: 'messias',
                password: 'vacilao',
                nomePessoa: 'Messias',
                enabled: true,
                sexoPessoa: 'M',
                CPF: '89185358215',
                salario: 50.0,
                endereco: enderecoFuncionario
        )

        messias.save()
        if(messias.hasErrors()){
            println messias.errors
        }

        println 'Populando usuario vacilao, ops, Messias - ok'

        def fornecedorPrincipal = new Fornecedor(
                nome: 'UFSCar',
                CNPJ: '09073204000127',
                endereco: enderecoFornecedor
        )

        fornecedorPrincipal.save()
        if(fornecedorPrincipal.hasErrors()){
            println fornecedorPrincipal.errors
        }

        println 'Populando Fornecedor Principal - ok'

        def clientePrincipal = new Cliente(
                nome: 'July',
                sexoPessoa: 'M',
                CPF: '55793030174',
                endereco: enderecoCliente,
                dataAniversario: new Date()
        )

        clientePrincipal.save()
        if(clientePrincipal.hasErrors()){
            println clientePrincipal.errors
        }

        println 'Populando Cliente July - ok'

        def produtoInicial = new Produto(
                nomeProd: 'Pão',
                valorProd: 1.0,
                quantidade: 100,
                codProd: 1,
                validadeProd: new Date(),
                fornecedor: fornecedorPrincipal
        )

        produtoInicial.save()
        if(produtoInicial.hasErrors()){
            println produtoInicial.errors
        }

        println 'Populando produto inicial - ok'

        def compraInicial = new Compra(
                total: 50.0,
                numItens: 50,
                produto: produtoInicial
        )

        compraInicial.save()
        if(compraInicial.hasErrors()){
            println compraInicial.errors
        }

        println 'Populando compra inicial - ok'


    }
    def destroy = {
    }
}
