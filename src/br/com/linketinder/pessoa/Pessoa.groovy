package br.com.linketinder.pessoa

class Pessoa {
	String nome
	String email
	String estado
	BigDecimal cep
	List listaDeCompetencia = []

	void adicionarCompetencia(String competencia){
		listaDeCompetencia.add(competencia)
	}

	@Override
	public String toString() {
		return "Pessoa{" +
				"nome='" + nome + '\'' +
				", email='" + email + '\'' +
				", estado='" + estado + '\'' +
				", cep=" + cep +
				", listaDeCompetencia=" + listaDeCompetencia +
				'}';
	}
}
