package FaseInicial;

import java.util.ArrayList;
import java.util.List;

public class Multiplos {

	public static List<Integer> getMultiplesOf(Integer n, Integer limite){
		List<Integer> multiplos = new ArrayList<Integer>();
		multiplos.add(n);
		Integer contador = 1;
		while (multiplos.get(multiplos.size()-1) <limite-(n-1)) {
			contador +=1;
			multiplos.add(n*contador);
		}
		System.out.println(multiplos);
		return multiplos;
	}
	
	
}
