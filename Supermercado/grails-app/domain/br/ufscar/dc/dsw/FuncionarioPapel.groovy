package br.ufscar.dc.dsw

import grails.compiler.GrailsCompileStatic
import grails.gorm.DetachedCriteria
import groovy.transform.ToString
import org.codehaus.groovy.util.HashCodeHelper

@GrailsCompileStatic
@ToString(cache=true, includeNames=true, includePackage=false)
class FuncionarioPapel implements Serializable {

	private static final long serialVersionUID = 1

	Funcionario funcionario
	Papel papel

	@Override
	boolean equals(other) {
		if (other instanceof FuncionarioPapel) {
			other.funcionarioId == funcionario?.id && other.papelId == papel?.id
		}
	}

    @Override
	int hashCode() {
	    int hashCode = HashCodeHelper.initHash()
        if (funcionario) {
            hashCode = HashCodeHelper.updateHash(hashCode, funcionario.id)
		}
		if (papel) {
		    hashCode = HashCodeHelper.updateHash(hashCode, papel.id)
		}
		hashCode
	}

	static FuncionarioPapel get(long funcionarioId, long papelId) {
		criteriaFor(funcionarioId, papelId).get()
	}

	static boolean exists(long funcionarioId, long papelId) {
		criteriaFor(funcionarioId, papelId).count()
	}

	private static DetachedCriteria criteriaFor(long funcionarioId, long papelId) {
		FuncionarioPapel.where {
			funcionario == Funcionario.load(funcionarioId) &&
			papel == Papel.load(papelId)
		}
	}

	static FuncionarioPapel create(Funcionario funcionario, Papel papel, boolean flush = false) {
		def instance = new FuncionarioPapel(funcionario: funcionario, papel: papel)
		instance.save(flush: flush)
		instance
	}

	static boolean remove(Funcionario u, Papel r) {
		if (u != null && r != null) {
			FuncionarioPapel.where { funcionario == u && papel == r }.deleteAll()
		}
	}

	static int removeAll(Funcionario u) {
		u == null ? 0 : FuncionarioPapel.where { funcionario == u }.deleteAll() as int
	}

	static int removeAll(Papel r) {
		r == null ? 0 : FuncionarioPapel.where { papel == r }.deleteAll() as int
	}

	static constraints = {
		papel validator: { Papel r, FuncionarioPapel ur ->
			if (ur.funcionario?.id) {
				FuncionarioPapel.withNewSession {
					if (FuncionarioPapel.exists(ur.funcionario.id, r.id)) {
						return ['userRole.exists']
					}
				}
			}
		}
	}

	static mapping = {
		id composite: ['funcionario', 'papel']
		version false
	}
}
