import br.com.linketinder.pessoa.PessoaFisica
import br.com.linketinder.pessoa.PessoaJuridica
import static org.junit.Assert.*
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

		assertEquals(pessoaFisica.toString(), pessoaFisicaEsperado.toString())
	}

	@Test
	void testAdicionarElementoLista(){
		List listaDeCandidato = []

		listaDeCandidato.add(new PessoaFisica())
		int resultado = listaDeCandidato.size().toInteger()

		int resultadoEsperado = 1

		assertEquals(resultadoEsperado,resultado)
	}

	@Test
	void testCriaObjetoPessoaJuridia(){
		def pessoaJuridicaTest = new PessoaJuridica()
		pessoaJuridicaTest.cnpj = 12312312312311

		def pessoaJuridicaTestEsperado = new PessoaJuridica()
		pessoaJuridicaTestEsperado.cnpj = 12312312312311

		assertEquals(pessoaJuridicaTest.toString(),pessoaJuridicaTestEsperado.toString())
	}

}

