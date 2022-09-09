package br.com.linketinder.pessoa

def entrevistado = new PessoaFisica(nome: "Rock Lee", email: "rocklee@konoha.com",cpf: 12345678900,idade: 15, estado: "GO",
		cep: 74463280,descricaoPessoal: "Estudante de Java/Groovy")
entrevistado.adicionarCompetencia("Java")
entrevistado.adicionarCompetencia("Python")
entrevistado.adicionarCompetencia("PHP")

def entrevistadoDois = new PessoaFisica(nome: "Sandubinha", email: "sandubinha@gmail.com",cpf: 12345678900,idade: 23, estado: "PA",
		cep: 74463280,descricaoPessoal: "Especialista em Python.")
def entrevistadoTres = new PessoaFisica(nome: "Gaara", email: "gaara@sunagakure.com",cpf: 12345678900,idade: 28, estado: "MT",
		cep: 74463280,descricaoPessoal: "Estagiário.")
def entrevistadoQuatro = new PessoaFisica (nome: "Goku", email: "goku@dbz.com",cpf: 12345678900,idade: 19, estado: "MG",
		cep: 74463280,descricaoPessoal: "Salvador do mundo")
def entrevistadoCinco = new PessoaFisica(nome: "Popeye", email: "popeye@gmail.com",cpf: 12345678900,idade: 35, estado: "PE",
		cep: 74463280,descricaoPessoal: "Estudante de Java/Groovy.")

def empresaUm = new PessoaJuridica(nome:"Konoha Ltda.",email: "candidatos@konoha.com",cnpj: 63257059000180,estado: "Konoha",pais: "Folha",
		cep: 54525230,descricaoEmpresa: "Empresa voltada a criação de combates online")
empresaUm.adicionarCompetencia("Necessita de Desenvolvedor JAVA")
empresaUm.adicionarCompetencia("Desenvolvedor WEB Junior")

def empresaDois = new PessoaJuridica(nome:"Entregas Hogwarts Ltda.",email: "candidatos@hogwarts.com",cnpj: 32693532000148,estado: "Mundo dos Bruxos",
		pais: "Reino Unido",cep: 36204499,descricaoEmpresa: "Empresa voltada a entrega de encomendas via corujas.")
empresaDois.adicionarCompetencia("Necessita de estagiários")

def empresaTres = new PessoaJuridica(nome:"Horti Fruti Ltda.",email: "candidatos@hortifruti.com",cnpj: 44763834000124,estado: "MG",
		pais: "Brasil",cep: 56506292,descricaoEmpresa: "Compra e venda de hortifruti")
def empresaQuatro = new PessoaJuridica(nome:"Transporte Rápido Ltda.",email: "candidatos@transporterapido.com",cnpj: 19182622000152,estado: "California",
		pais: "USA",cep: 57306035,descricaoEmpresa: "Viagens rápidas em menor tempo possível.")
def empresaCinco = new PessoaJuridica(nome:"Lajes ltda.",email: "candidatos@laje.com",cnpj: 17906767000187,estado: "PE",
		pais: "Brasil",cep: 74354420,descricaoEmpresa: "Serviço para agendamento de montagem e enchimento de laje.")

List listaDeCandidatos = [entrevistado,entrevistadoDois,entrevistadoTres,entrevistadoQuatro,entrevistadoCinco]
List listaDeEmpresas = [empresaUm,empresaDois,empresaTres,empresaQuatro,empresaCinco]
listaDeCandidatos.each {
	println(it)
}
println("--------------------------------------------------------------------")
listaDeEmpresas.each {
	println (it)
}