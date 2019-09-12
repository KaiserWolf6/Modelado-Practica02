/*
 * Clase para excepcion de cuando el robot esta cocinando
 */
public class CookException extends Exception {
	
	/*
     * Constructor vacio
 	 */
	public CookException() {}

	/*
     * Constructor que recibe un mensaje para el usuario
     * @param manda un mensaje que vera el usuario cuando ocurra el error
 	 */	
	public CookException(String mensaje) {
		super(mensaje);
	}
}