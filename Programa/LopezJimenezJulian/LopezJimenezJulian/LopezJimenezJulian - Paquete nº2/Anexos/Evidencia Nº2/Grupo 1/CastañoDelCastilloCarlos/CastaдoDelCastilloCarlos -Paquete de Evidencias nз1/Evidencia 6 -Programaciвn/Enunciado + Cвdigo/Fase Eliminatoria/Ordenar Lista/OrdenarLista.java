package FaseInicial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarLista {

	// El método hace que ordene los números de la siguiente manera:
		// Si el string que entra es "menor" es que empieza de menor a mayor.
		// Si el string que entra es "mayor" es que empieza de mayor a menor.
		// Si el string que entra es "pares" es que empieza primero con los pares y luego los impares.
		// Si el string que entra es "impares" es que empieza primero con los impares y luego los pares.
		// Si el string que entra es cualquier otro, transforma la lista en una lista de 0s.
		public static List<Integer> ordenarLaLista(List<Integer> l, String way){
			if(way == "menor") {
				Collections.sort(l);
				
			}else if(way == "mayor") {
				Collections.reverse(l);
				
				
			}else if(way == "pares") {
				List<Integer> m = l;
				l = new ArrayList<Integer>();
				for(int e = 0; e< m.size(); e++) {
					if(e == 0)
						l.add(m.get(e));
					else {
						if(m.get(e)%2 == 0) {
							l.add(0, m.get(e));
						}else {			//Aquí añado los impares
							l.add(l.size()-1, e);
						}
					}
				}
				
			}else if(way == "impares") {
				List<Integer> m = l;
				l = new ArrayList<Integer>();
				for(int e = 0; e< m.size(); e++) {
					if(e == 0)
						l.add(m.get(e));
					
					else {
						if(m.get(e)%2 == 1) {
							l.add(0, m.get(e));
						}else {			//Aquí añado los pares
							l.add(l.size()-1, e);
						}
					}
				}
				
			}else {
				l = new ArrayList<Integer>();
				for(int i = 0; i == l.size(); i++) {
					l.add(0);
				}
			}
			System.out.println(l);
			return l;
		}
}
