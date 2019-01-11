package Fin;



public class AgenteSecreto {
	
	public static String codificarMensaje(String original) {
		String primeraFase = primerCambio(original);
		
		String segundaFase = segundoCambio(primeraFase);
		
		System.out.println(segundaFase);
		return segundaFase;
	}


	private static String primerCambio(String original) {
		String cambio = "";
		
		
		
		for(int i = 0; i < original.length(); i++) {
			if(esVocal(original.charAt(i))) {
				cambio = cambio +original.charAt(i);
				
			}else {
				
				String espejo = Character.toString(original.charAt(i));
				
				for(int e = i+1; e < original.length(); e++) {
					if(esVocal(original.charAt(e))) {
						break;
					}else {
						espejo = espejo + Character.toString((original.charAt(e)));
					}
				
				
				}
				
				cambio = cambio + new StringBuilder(espejo).reverse().toString();
				i = i+espejo.length()-1;
				 
			}
		}
		
		return cambio;
	}
	
	private static boolean esVocal(char c) {
		if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		
		return false;
	}


	private static String segundoCambio(String primeraFase) {
		System.out.println(primeraFase);
		Integer longitud = primeraFase.length();
		String cambio = "";
		for(int i = 0; i < longitud/2; i++) {
			cambio = cambio + primeraFase.charAt(i);
			cambio = cambio + primeraFase.charAt(primeraFase.length()-1-i);
		}
		
		return cambio;
	}
}
