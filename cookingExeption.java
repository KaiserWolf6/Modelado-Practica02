/*
 * Clase para excepcion de cuando el robot esta cocinando
 */
public class cookingExeption extends Exception {
	
	/*
     * Constructor vacio
 	 */
	public cookingExeption() {}

	/*
     * Constructor que recibe un mensaje para el usuario
     * @param manda un mensaje que vera el usuario cuando ocurra el error
 	 */	
	public cookingExeption(String mensaje) {
		super(mensaje);
	}
}