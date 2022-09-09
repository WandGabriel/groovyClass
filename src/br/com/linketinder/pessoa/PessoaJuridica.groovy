package br.com.linketinder.pessoa

import groovy.transform.ToString

@ToString
class PessoaJuridica extends Pessoa{

	BigDecimal cnpj
	String pais
	String descricaoEmpresa
}
