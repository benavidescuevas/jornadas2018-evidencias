package cuartosfin;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Moleculas{
	
	
	public static Integer getNumeroMovimientos(Integer cantidad, Integer positions) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> newList = new ArrayList<Integer>();
		Integer movimientos = 0;
		
		for (int i = 0; i< cantidad; i++) {
			list.add(i);
			newList.add(i);
		}
		for(int i = 0; i< 1000000000; i++) {
			Collections.rotate(newList, positions);
			if(dosListasIguales(list, newList)) {
				movimientos = i;
				break;
			}
		}
	
		
		System.out.println(movimientos);
		return movimientos;
	}

	private static boolean dosListasIguales(List<Integer> lista, List<Integer> nuevaLista) {
		for(int i = 0; i< lista.size(); i++) {
			if(lista.get(i) != nuevaLista.get(i)) {
				return false;
			}
		}
		return true;
	}
}