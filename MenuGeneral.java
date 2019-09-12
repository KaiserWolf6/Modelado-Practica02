import java.util.NoSuchElementException;

public class MenuGeneral implements Interface {
	
	private int num_hamburguesas;

	public MenuGeneral(int num_hamburguesas) {
		this.num_hamburguesas = num_hamburguesas;
	}

	public int getNumHamburguesas() {
		return num_hamburguesas;
	}

	public void setNumHamburguesas(int num_hamburguesas) {
		this.num_hamburguesas = num_hamburguesas;
	}

	public void limiteHamburguesas(int num_hamburguesas) {
		if (num_hamburguesas <= 0) 
			throw new NoSuchElementException("Se acabaron las Hamburguesas");
		
	}

}