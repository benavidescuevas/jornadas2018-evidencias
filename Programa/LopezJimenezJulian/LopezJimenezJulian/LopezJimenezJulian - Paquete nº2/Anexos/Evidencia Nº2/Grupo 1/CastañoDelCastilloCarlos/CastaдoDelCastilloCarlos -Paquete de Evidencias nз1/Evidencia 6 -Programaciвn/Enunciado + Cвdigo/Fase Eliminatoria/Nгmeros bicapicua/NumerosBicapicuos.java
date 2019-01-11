package FaseInicial;

import java.util.ArrayList;
import java.util.List;

public class NumerosBicapicuos{
	
	
	public static List<Integer> getBicapicuos(Integer limite){
		List<Integer> lista = new ArrayList<Integer>();
		
		for(int i = 100000; i< limite; i++) {
			if(esBicapicuo(i)) {
				lista.add(i);
			}
		}
		
		System.out.println(lista);
		return lista;
	}

	private static boolean esBicapicuo(int i) {
		if(i <1000000) {
			Boolean centenas = esCapicuo(i%1000);
			Boolean miles = esCapicuo(i/1000);
			return miles&&centenas;
		}else{
			Boolean centenas = esCapicuo(i%1000);
			Boolean miles = esCapicuo(i/1000000);
			Boolean millones = esCapicuo(i%1000000);
			return miles&&centenas&&millones;
		}
		
	}

	private static boolean esCapicuo(Integer i) {
		String numero = Integer.toString(i);
		if(numero.length()==1)
			numero= "00"+numero;
		else if(numero.length()==2)
			numero= "0"+numero;
		
		for(int e = 0; e < numero.length()/2; e++) {
			if(numero.charAt(e) != numero.charAt(numero.length()-(e+1)) || (numero.charAt(e) == '0' && numero.charAt(numero.length()-(e+1)) == '0')) {
				return false;
			}
		}

			
		return true;
	}
}