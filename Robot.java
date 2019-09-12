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

	/*Saluda al cliente*/
	public void saludar() {
		System.out.println("Bienvenido! Que desea ordenar?");
	}

	/*Nos permite saber si el robot esta activado*/
	@Override
	public void activar() {
		this.activado = true;
		System.out.println("Robot activado!");
	}

	/*Nos permite saber si el robot esta desactivado*/
	@Override
	public void desactivar() {
		this.activado = false;
		System.out.println("Robot desactivado!");
	}

	/*Nos permite saber si el robot esta caminando*/
	@Override
	public void caminar(boolean camina) {
		if (camina != this.cocina) 
			desactivar();
			this.cocina = false;
			this.camina = false;
		this.camina = true;
	}

	/*Nos permite saber si el robot esta cocinando*/
	@Override
	public void cocinar(boolean cocina) {
		if (cocina) {
			this.camina = false;
			this.atiende = false;
			this.cocina = true;
			//incompleto, falta mostrar el procedimiento
		} else if (cocina && desactivar()) {
			throw new CookException("El robot esta desactivado");
		} else {
			this.cocina = false;
		}
	}

	@Override
	public void leer() {

	}

	@Override
	public void guardar() {

	}

	@Override
	public void atender(boolean atiende) {
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