package molecules;

public class Molecule_H2O {
	
	//Proprietes Chimiques
	public static String Nom_H2O = "Eau";
	public static String FormuleBrute_H2O = "H2O";
	public static double MasseMolaire_H2O = 18.0153;
	public static double MomentDipolaire_H20 = 1.8546;
	public static double DiametreMoleculaire_H2O = 0.343;
	
	//Proprietes Physiques
	public static double TFusion_H2O = 0;
	public static double TEbullition_H2O = 100;
	public static double ParametreSolubilite_H2O = 47.9;//25°C
	public static double MasseVolumique_H2O = 0.99984;//0°C
	//                                   0°C    10    20    30   40     50     60     70      80      90      100
	public static double[] PressionVapeurSaturante_H2O = {6.112, 12.4, 23.4, 42.5, 73.8, 123.5, 199.4, 311,81, 473,79, 701,23, 1013,25};
	public static double ViscositeDynamique_H2O = 0.001002;//20°C
	public static double[] PointTriple_H2O = {0.01, 611.73};
	public static double ConductiviteThermique = 565;
	public static double TensionSuperficielle = 0.0728;//20°C
	public static double ConductiviteElectrique = 5.5 * -1000000;
	
	
}
