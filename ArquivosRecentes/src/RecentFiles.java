import java.util.ArrayList;
import java.util.List;

public class RecentFiles {
	private static final int  MAX = 15;

	private List<String> lista;
	private boolean habilitada = true;
	
	public RecentFiles() {
		this.lista = new ArrayList<String>();
	}

	public List<String> getLista(){
		return this.lista;
	}
	
	public void adicionarArquivo(String fileName) {	
		if(!this.habilitada)
			return;
		
		int index = this.lista.indexOf(fileName);		
		if(index != -1) {
			this.lista.remove(index);
		}else if(this.lista.size() >= MAX) {
			this.lista.remove(MAX-1);
		}
		this.lista.add(0, fileName);
	}
	
	public void esvaziar() {
		this.lista.clear();
	}
	
	public void desabilitar() {
		this.habilitada = false;
	}
	
}
 