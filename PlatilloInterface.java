/*Interfaz para la clase platillo y sus variantes*/
public interface PlatilloInterface {
	
	/*Nos permitira ver el id del platillo*/	
	public int getId();

	/*Metodo que le pone queso al platillo*/
	public void tenerQueso();

	/*Metodo que indica si el platillo es vegetariano o tiene ingredientes 
	 *del mismo
	 */
	public void esVegetariano();

}