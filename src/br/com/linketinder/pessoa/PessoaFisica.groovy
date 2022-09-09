package br.com.linketinder.pessoa

import groovy.transform.ToString

@ToString
class PessoaFisica extends Pessoa{


	String idade
	BigDecimal cpf
	String descricaoPessoal

}
