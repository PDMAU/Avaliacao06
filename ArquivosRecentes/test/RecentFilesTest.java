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
	
}
