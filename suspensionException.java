public class suspensionException extends Exception {

	/*
     * Constructor vacio
 	 */
	public suspensionException() {}

	/*
     * Constructor que recibe un mensaje para el usuario
     * @param manda un mensaje que vera el usuario cuando ocurra el error
 	 */	
	public suspensionException(String mensaje) {
		super(mensaje);
	}
	
}