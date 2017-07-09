package br.ufscar.dc.dsw

import org.springframework.security.access.annotation.Secured

@Secured(['ROLE_USER', 'ROLE_ADMIN'])
class MainController {

    def springSecurityService

    def index() {

        def usuario = springSecurityService.getCurrentUser()
        def authority = usuario.getAuthorities()[0].getAuthority()
        //def userName = springSecurityService.authentication.principal.getUsername()
        session.usuario = usuario

        // ROLE_USER se funcionário, ROLE_ADMIN caso gerente
        if(authority.equals('ROLE_USER')){
            redirect(controller: "compra")
            // Não pode redirecionar para uma view
            // redirect(view: "index")
        } else {
            redirect(controller: "funcionario")
        }

    }
}
