package relativiterestreinte;

import constantes.ConstantesUniverselles;

public class Energie {
	
	//E =mc2
	public static double E_mc2(double m){
		return m * Math.pow(ConstantesUniverselles.VLumiere, 2);
	}
	
	public static double c_Em(double E, double m){
		return Math.sqrt(E/m);
	}
	
	public static double m_Ec(double E){
		return E/ ConstantesUniverselles.VLumiere;
	}
	
	//Energie cinetique
	public static double Ec(double m, double v){
		return (1/2) * m * v;
	}
	
	
	
	
	
}
