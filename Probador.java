import java.util.ArrayList;

class Probador  {

	public void f(int[] h, int compras) {
		int limite_hamburguesas = h.length;
		while (limite_hamburguesas > 0) {
			if (limite_hamburguesas < 0) 
				System.out.println("Empty");
			System.out.println("Se compro: " + compras);
			int reducir = limite_hamburguesas - compras;
			System.out.println("Quedan: " + reducir);
			limite_hamburguesas--;

		}
		//System.out.println("Empty");
	}

	public static void main(String[] args) {
		int h[] = new int[] {1,2};
		Probador p = new Probador();
		Probador p2 = new Probador();
		int c = 2;
		int c2 = 1;
		p.f(h, c);
		p2.f(h,c2);
	}

}