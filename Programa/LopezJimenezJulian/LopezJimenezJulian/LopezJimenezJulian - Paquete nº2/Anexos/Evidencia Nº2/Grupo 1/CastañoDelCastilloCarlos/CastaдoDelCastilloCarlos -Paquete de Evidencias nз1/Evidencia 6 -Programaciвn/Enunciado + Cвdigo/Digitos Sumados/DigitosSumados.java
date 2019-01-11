package FaseInicial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigitosSumados {
	
	
	public static List<Integer> getListaDigitosSumados(Integer valor, Integer limite){
		List<Integer> valoresBuenos = new ArrayList<Integer>();
		
		for(int i = 0; i < limite; i++) {
			List<Integer> numero = new ArrayList<Integer>();
			Integer e = i;
			Integer suma = 0;
			while(e >= 10) {
				numero.add(i%10);
				e = e/10;
			}
			numero.add(e);
			
			for(Integer a: numero) {
				suma += a;
			}
			
			if(suma == valor) {
				valoresBuenos.add(i);
			}
		}
		
		System.out.println("Valor: "+valor+". Y la lista: "+valoresBuenos);
		
		return valoresBuenos;
		
		
	}
}