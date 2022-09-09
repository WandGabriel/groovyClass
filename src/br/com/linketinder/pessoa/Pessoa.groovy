package br.com.linketinder.pessoa

import groovy.transform.ToString

@ToString
class Pessoa {
	String nome
	String email
	String estado
	BigDecimal cep
	List listaDeCompetencia = []

	void adicionarCompetencia(String competencia){
		listaDeCompetencia.add(competencia)
	}
}
