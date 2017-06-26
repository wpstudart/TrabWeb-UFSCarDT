import br.ufscar.dc.dsw.Funcionario
import br.ufscar.dc.dsw.Papel
import br.ufscar.dc.dsw.FuncionarioPapel
import br.ufscar.dc.dsw.Cliente
import br.ufscar.dc.dsw.Compra
import br.ufscar.dc.dsw.Endereco
import br.ufscar.dc.dsw.Produto


class BootStrap {

    def init = { servletContext ->

        def adminPapel = Papel.findByAuthority("ROLE_ADMIN") ?:
                new Papel(authority: "ROLE_ADMIN").save()

        def admin = new Funcionario(
                username: "admin",
                password: "admin",
                nomePessoa: "Gerente",
                enabled: true,
                sexoPessoa: "Macho",
                CPF: 12,
                salario: 1000.0
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
            username: "messias",
            password: "vacilao",
            nomePessoa: "Messias",
            enabled: true, sexoPessoa: "Indefinido", CPF: 101
        )

        messias.save()
        if(messias.hasErrors()){
            println messias.errors
        }

        println 'Populando usuario vacilao, ops, Messias - ok'

        // Adicionar as demais classes (para inicializar)
    }
    def destroy = {
    }
}
