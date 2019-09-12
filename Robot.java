import java.util.Iterator;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Robot implements InterfaceRobot {

	/*Nos permite saber si el robot fue activado*/
	private boolean activado;
	/*Nos indica de que el robot camina*/
	private boolean camina;
	/*Nos indica de que el robot cocina*/
	private boolean cocina;
	/*Nos indica que el robot esta atendiendo al cliente*/
	private boolean atiende;

	/*Constructor de la clase robot*/
	public Robot() {
		this.activado = false;
		this.camina = false;
		this.cocina = false;
		this.atiende = false;
	}

	/*Nos permite saber si el robot esta activado*/
	@Override
	public void activar() {
		this.activado = true;
	}

	/*Nos permite saber si el robot esta desactivado*/
	@Override
	public void desactivar() {
		this.activado = false;
	}

	/*Nos permite saber si el robot esta caminando*/
	@Override
	public void caminar() {
		if (this.camina && !this.cocina) 
			this.activado = false;
		
	}

	@Override
	public void cocinar() {

	}

	@Override
	public void leer() {

	}

	@Override
	public boolean atender(boolean atiende) {
		if (atiende) {
			activar();
			this.atiende = true;
			this.camina = false;
			this.cocina = true;
		} else {
			this.atiende = false;
		}

	}
	
}