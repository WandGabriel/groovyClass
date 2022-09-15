import br.com.linketinder.pessoa.PessoaFisica
import org.junit.Assert
import org.junit.Test

class TestPessoa {

	@Test
	void testCriacaoObjetoPessoaFuncionario() {
		def pessoaFisica = new PessoaFisica()
		pessoaFisica.nome = 'Wanderson'
		pessoaFisica.idade = 28
		pessoaFisica.email = 'wg@gmail.com'
		pessoaFisica.cpf = 12312312312
		pessoaFisica.estado = 'GO'
		pessoaFisica.descricaoPessoal = 'Teste'

		def pessoaFisicaEsperado = new PessoaFisica()
		pessoaFisicaEsperado.nome = 'Wanderson'
		pessoaFisicaEsperado.idade = 28
		pessoaFisicaEsperado.email = 'wg@gmail.com'
		pessoaFisicaEsperado.cpf = 12312312312
		pessoaFisicaEsperado.estado = 'GO'
		pessoaFisicaEsperado.descricaoPessoal = 'Teste'

		Assert.assertEquals(pessoaFisica.toString(), pessoaFisicaEsperado.toString())
	}

	@Test
	void testAdicionarElementoLista(){
		List listaDeCandidato = []

		listaDeCandidato.add(new PessoaFisica())
		int resultado = listaDeCandidato.size().toInteger()

		int resultadoEsperado = 1

		Assert.assertEquals(resultadoEsperado,resultado)
	}

}

