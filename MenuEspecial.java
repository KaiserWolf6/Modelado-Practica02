import java.util.Hashtable;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MenuEspecial implements Menu {
	
	private ArrayList<Platillo> lista_platillos;
	private Platillo hamburguesa_especial;	

	/*Constructor Menu Especial*/
	public MenuEspecial() {
		this.lista_platillos = new ArrayList<Platillo>();
	}

	/*Devuelve la lista de platillos*/
	@Override
	public ArrayList<Platillo> getListaPlatillos() {
		return this.lista_platillos;
	}

	

}