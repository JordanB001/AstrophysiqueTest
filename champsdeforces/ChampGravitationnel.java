package champsdeforces;

import constantes.ConstantesGravitation;

public class ChampGravitationnel {
	
	public static double LoiUniverselleGravitationelle(double m1, double m2, double d){
				
		return ConstantesGravitation.ConstanteGravitationelle * m1 * m2 / (Math.pow(d, 2));
		
	}
}
