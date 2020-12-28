import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecentFilesTest {
	
	@Test
	public void quandoAListaEhCriadaDeveEstarVazia() {
		RecentFiles lista = new RecentFiles();
		assertTrue(lista.getLista().isEmpty());
	}
	
	@Test
	public void quandoArquivoEhAdicionadoNaListaONumeroDeElementosDeveAumentar() {
		RecentFiles lista = new RecentFiles();
		lista.adicionarArquivo("NovoArquivo.txt");
		assertEquals(1, lista.getLista().size());
		
	}
	
	@Test
	public void quandoArquivoEhAdicionadoDeveIrParaOTopoDalista() {
		RecentFiles lista = new RecentFiles();
		lista.adicionarArquivo("ArquivoVelho.txt");
		lista.adicionarArquivo("NovoArquivo.txt");
		
		assertTrue(lista.getLista().get(0).equals("NovoArquivo.txt"));
		
	}
	
	@Test
	public void quandoArquivoEhAdicionadoSeJaExisteNaoDeveDuplicar() {
		RecentFiles lista = new RecentFiles();
		lista.adicionarArquivo("ArquivoVelho.txt");
		lista.adicionarArquivo("NovoArquivo.txt");
		lista.adicionarArquivo("ArquivoVelho.txt");
		
		assertTrue(lista.getLista().get(0).equals("ArquivoVelho.txt"));
		assertEquals(2, lista.getLista().size());

		
	}
	
	@Test
	public void quandoListaEstaCheiaDeveRetirarUltimoElementoEAdicionarONovo() {
		RecentFiles lista = new RecentFiles();
		for(int i = 0; i <= 15; i++) {
			lista.adicionarArquivo("Arquivo"+i+".txt");
		}
		
		assertTrue(lista.getLista().get(0).equals("Arquivo15.txt"));
		assertTrue(lista.getLista().get(14).equals("Arquivo1.txt"));
		
	}
	
	@Test
	public void quandoListaEhEsvaziadaDeveFicarVazia() {
		RecentFiles lista = new RecentFiles();
		for(int i = 0; i <= 15; i++) {
			lista.adicionarArquivo("Arquivo"+i+".txt");
		}
		lista.esvaziar();
		assertEquals(0, lista.getLista().size());
		
		
	}
	
	@Test
	public void quandoListaEstaDesabilitadaNaoDeveSerAdicionadosNovosArquivos() {
		RecentFiles lista = new RecentFiles();
		lista.adicionarArquivo("Arquivo0.txt");
		lista.adicionarArquivo("Arquivo1.txt");
		lista.desabilitar();		
		lista.adicionarArquivo("Arquivo2.txt");
		assertTrue(lista.getLista().get(0).equals("Arquivo1.txt"));
		assertEquals(2, lista.getLista().size());
	}
	
	
}
