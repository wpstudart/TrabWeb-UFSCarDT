package br.ufscar.dc.dsw

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@EqualsAndHashCode(includes='username')
@ToString(includes='username', includeNames=true, includePackage=false)
class Funcionario extends Pessoa implements Serializable {

	static hasMany = [compras: Compra]

	private static final long serialVersionUID = 1

	transient springSecurityService

	String username
	String password
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
	String nomePessoa

	Funcionario(String username, String password) {
		this()
		this.username = username
		this.password = password
	}

	Set<Papel> getAuthorities() {
		FuncionarioPapel.findAllByFuncionario(this)*.papel
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
	}

	static transients = ['springSecurityService']

	static constraints = {
		password blank: false, password: true
		username blank: false, unique: true
	}

	static mapping = {
		password column: '`password`'
	}

	String toString() {
		return nomePessoa
	}
}
