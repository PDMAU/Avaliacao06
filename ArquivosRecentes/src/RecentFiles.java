import java.util.ArrayList;
import java.util.List;

public class RecentFiles {
	
	private List<String> lista;
	
	
	public RecentFiles() {
		this.lista = new ArrayList<String>();
	}

	public List<String> getLista(){
		return this.lista;
	}
	
	public void adicionarArquivo(String fileName) {	
		int index = this.lista.indexOf(fileName);
		if(index != -1) {
			this.lista.remove(index);
		}
		this.lista.add(0, fileName);
	}
	
}
