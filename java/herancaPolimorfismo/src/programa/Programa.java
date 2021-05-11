package programa;

import classes.Cachorro;
import classes.Cavalo;
import classes.Preguica;

public class Programa {
	public static void main(String[] args) {
		Cavalo cavalo = new Cavalo("Pé-de-pano", 24);
		cavalo.correr();
		cavalo.emitirSom();
		
		Cachorro cachorro = new Cachorro("Duda", 4);
		cachorro.correr();
		cachorro.emitirSom();
		
		Preguica preguica = new Preguica("Cid", 1000000000);
		preguica.subirArvore();
		preguica.emitirSom();
		
	}

}
