/*Clase Platillo*/
public class Platillo implements PlatilloInterface {
	
	private int id;
	private String nombrePlatillo;
	private String descripcion;
	private int precio;
	private boolean tieneQueso;
	private boolean vegetariano;

	/*Constructor de la clase platillo*/
	public Platillo(int id, String, nombrePlatillo, String descripcion, 
		int precio) {

		this.id = id;
		this.nombrePlatillo = nombrePlatillo;
		this.descripcion = descripcion;
		this.precio = precio;
		tieneQueso = false;
		vegetariano = false;
	}

	@Override
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombrePlatillo() {
		return nombrePlatillo;
	}

	public void setNombrePlatillo(String nombrePlatillo) {
		this.nombrePlatillo = nombrePlatillo;
	}	

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}	

	@Override
	public void tenerQueso(boolean tieneQueso) {
		if (tieneQueso) {
			this.tieneQueso = true;
		}
		this.tieneQueso = false;
	}

	@Override
	public void esVegetariano(boolean vegetariano) {
		if (vegetariano) {
			this.vegetariano = true;
		}
		this.vegetariano = false;
	}


}