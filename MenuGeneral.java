import java.util.NoSuchElementException;
import java.util.ArrayList;

public class MenuGeneral implements Menu {
	
	/*Arreglo del numero de hamburguesas disponibles*/	
	private int hamburguesas[];
	/*Lista de platillos del menu*/
	private ArrayList<Platillo> lista_platillos;

	/*Constructor del MenuGeneral*/
	public MenuGeneral(int hamburguesas[]) {
		this.hamburguesas = hamburguesas;
		this.lista_platillos = new ArrayList<Platillo>();
	}

	/*Devuelve la cantidad de hamburguesas que tiene el menu*/
	public int getNumHamburguesas() {
		return hamburguesas.length;
	}

	/*Devuelve la lista de platillos*/
	@Override
	public ArrayList<Platillo> getListaPlatillos() {
		return this.lista_platillos;
	}	

	/*Coloca el numero de hamburguesas disponibles en el menu*/
	public void setNumHamburguesas(int hamburguesas[]) {
		this.hamburguesas = hamburguesas;
	}

	/*Metodo que nos permite saber si aun hay hamburguesas o ya se agoraton*/
	public void limiteHamburguesas(int num_hamburguesas[]) {
		if (num_hamburguesas.length <= 0) 
			System.out.println("Se acabaron las hamburguesas");
		for (int i = num_hamburguesas.length; i >= 0; i--) {
			System.out.println("Se compro una hamburguesas");
		}
	}


}