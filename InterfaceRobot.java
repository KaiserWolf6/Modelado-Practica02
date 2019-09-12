import java.util.Iterator;
import java.util.NoSuchElementException;

/*Interfaz de la clase Robot*/
public interface InterfaceRobot {
	
	/*Metodo que permitira que el robot se active*/
	public void activar();

	/*Permite que el robot se suspenda*/
	public void desactivar();

	/*Muestra el procedimiento de coccion y entrega*/
	public boolean cocinar(boolean cocina);

	/*Guarda los menus*/
	public void guardar();

	/*Muestra que el robot se dirige hacie el cliente*/
	public boolean caminar(boolean camina, boolean cocina);

	/*Muestra los menus que hay disponibles*/
	public void leer();

	/*Muestra la interaccion con el cliente*/
	public boolean atender(boolean atender);

	/*Accede a la lista de Menus*/
	public void acceder();

} /*Fin de la interfaz*/