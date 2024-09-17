package fermions;

public class Quark {
	
	//Charge +2/3
	
	//QUARK UP
	public static String SymboleQUP       = "u";
	public static double MasseQUP         = Math.random() * (4.0 - 1.5) + 1.5;//MeV.c-2
	public static double ChargElecQUP     = 2/3;//e
	public static double SpinQUP          = 1/2;
	
	//QUARK CHARM
	public static String SymboleQC       = "c";
	public static double MasseQC         = Math.random() * (1350 - 1150) + 1150;//MeV.c-2
	public static double ChargElecQC     = 2/3;//e
	public static double SpinQC          = 1/2;
	
	//QUARK TOP
	public static String SymboleQT       = "t";
	public static double MasseQT         = 173340;//MeV.c-2
	public static double ChargElecQT     = 2/3;//e
	public static double SpinQT          = 1/2;
	
	//Charge -1/3
	
	//QUARK DOWN
	public static String SymboleQDOWN     = "d";
	public static double MasseQDOWN       = Math.random() * (8.0 - 4.0) + 4.0;//MeV.c-2
	public static double ChargElecQDOWN   = -1/3;//e
	public static double SpinQDOWN        = 1/2;
	
	//QUARK STRANGE
	public static String SymboleQS       = "s";
	public static double MasseQS         = Math.random() * (130.0 - 80.0) + 80.0;//MeV.c-2
	public static double ChargElecQS     = -1/3;//e
	public static double SpinQS          = 1/2;
	
	
	//QUARK BOTTOM
	public static String SymboleQB       = "b";
	public static double MasseQB         = Math.random() * (4400 - 4100) + 4100;//MeV.c-2
	public static double ChargElecQB     = -1/3;//e
	public static double SpinQB          = 1/2;
	
	
	
}
