/*
 * Clase para excepcion de cuando el robot esta suspendido
 */
public class SuspenderException extends Exception {
	
	/*
     * Constructor vacio
 	 */
	public SuspenderException() {}

	/*
     * Constructor que recibe un mensaje para el usuario
     * @param manda un mensaje que vera el usuario cuando ocurra el error
 	 */	
	public SuspenderException(String mensaje) {
		super(mensaje);
	}
}