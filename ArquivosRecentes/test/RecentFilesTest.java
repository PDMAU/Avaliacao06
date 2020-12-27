import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecentFilesTest {
	
	@Test
	public void quandoaAListaEhCriadaDeveEstarVazia() {
		RecentFiles lista = new RecentFiles();
		assertTrue(lista.getLista().isEmpty());
	}
	
}
