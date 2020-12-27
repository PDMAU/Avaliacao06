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
}
