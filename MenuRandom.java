import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MenuRandom implements Menu {

	private ArrayList<Platillo> lista_platillos;
	private Platillo platillo;

	public MenuRandom() {
		this.lista_platillos = new ArrayList<Platillo>();
	}

	/*Devuelve la lista de platillos*/
	@Override
	public ArrayList<Platillo> getListaPlatillos() {
		return this.lista_platillos;
	}

	public void cambiarMenu() {
		ArrayList<Platillo> nueva_lista = new ArrayList<Platillo>();
		for (Platillo p : lista_platillos) {
			int indice = 0; //indice de la lista
			while (indice ) {
				
			}
		}
	}


	
}