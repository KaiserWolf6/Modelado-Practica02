import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class Menu<T> implements Iterable<T>{
	
	/*Clase Nodo privada para uso interno de la clase Menu*/
	private class Nodo {

		/*El elemento del nodo que viene siendo los menus*/
		public T item;
		/*Nodo anterior*/
		public Nodo anterior;
		/*Nodo siguiente*/
		public Nodo siguiente;

		/*Construye un nodo con un elemento*/
		public Nodo(T item) {
			this.item = item;
			this.anterior = null;
			this.siguiente = null;
		}

	}

	/*Clase Iterador privada para iteradores*/
	private class Iterador implements IteradorMenu<T> {

		/*El nodo anterior*/
		public Nodo anterior;
		/*El nodo siguiente*/
		public Nodo siguiente;

		/*Construye un nuevo iterador*/
		public Iterador() {
			this.anterior = null;
			this.siguiente = first;
		}

		/*Nos dice si hay un elemento siguiente*/
		@Override public boolean hasNext() {
			return siguiente != null;
		}

		/*Nos da el elemento siguiente*/
		@Override public T next() {
			if (siguiente == null) 
				throw new NoSuchElementException("Empty");
			anterior = siguiente;
			siguiente = siguiente.siguiente;
			return anterior.item;
		}

		/*Nos dice si hay un elemento anterior*/
		@Override public boolean hasPrevious() {
			return anterior != null;
		}

		/*Nos da el elemento anterior*/
		@Override public T previous() {
			if (anterior == null) 
				throw new NoSuchElementException("Empty");
			siguiente = anterior;
			anterior = anterior.anterior;
			return siguiente.item;
		}

		/*Mueve el iterador al inicio del menu*/
		@Override public void start() {
			anterior = null;
			siguiente = first;
		}

		/*Mueve el iterador al final del menu*/
		@Override public void end() {
			anterior = last;
			siguiente = null;
		}

		@Override public void remove() {
			throw new UnsupportedOperationException();
		}

	}

	/*Primer elemento*/
	private Nodo first;
	/*Ultimo elemento*/
	private Nodo last;
	/*Nombre del tipo de Menu*/
	private String tipo_de_menu;
	/*Lista de Menus*/
	private ArrayList<Menu> lista_de_menus;

	/*Constructor de la clase principal Menu*/
	public Menu() {}

	/*Regresa el tipo de menu*/
	public String getTipoMenu() {
		return tipo_de_menu
	}

	/**/
	public void setTipoMenu(String tipo_de_menu) {
		this.tipo_de_menu = tipo_de_menu;
	}

	/*Regresa la lista de menus*/
	public ArrayList getListaMenus() {
		return lista_de_menus;
	}

	/*Agrega los menus que se van a mostrar al cliente*/
	public void agregarMenu(T item) {
		lista_de_menus.add(item);		
	}



}