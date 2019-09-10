public class Platillo  {
	
	private int id;
	private String nombrePlatillo;
	private String descripcion;
	private int precio;
	private boolean tieneQueso;
	private boolean vegetariano;

	public Platillo(int id, String, nombrePlatillo, String descripcion, 
		int precio) {

		this.id = id;
		this.nombrePlatillo = nombrePlatillo;
		this.descripcion = descripcion;
		this.precio = precio;
		tieneQueso = false;
		vegetariano = false;
	}

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

	public boolean getQueso() {
		return tieneQueso;
	}

	public void setQueso(boolean tieneQueso) {
		this.tieneQueso = tieneQueso;
	}

	public boolean getVegetariano() {
		return vegetariano;
	}

	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}

}