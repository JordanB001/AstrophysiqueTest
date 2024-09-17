import java.util.Random;
import java.util.Scanner;

import champsdeforces.ChampGravitationnel;
import constantes.ConstantesElectromagnetisme;
import constantes.ConstantesPhysicoChimiques;
import constantes.ConstantesUniverselles;
import fermions.Quark;
import molecules.Molecule_H2O;
import particules.Baryon;
import relativiterestreinte.Energie;

public class Test {
	
	
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		Parametres.nbrProton += 1; Parametres.nbrElectron += 1; Parametres.nbrHydrogene += 5;
		new AtomeGeneration(1 + (int)(Math.random() * ((42 - 1) + 1)));
		System.out.println("il y a " + Parametres.nbrProton + " Proton et " + Parametres.nbrElectron + " Electron et " + Parametres.nbrHydrogene + " Atome d'Hydrogene");
		
		
		
		Random Temprand = new Random();
		Random Press = new Random();
		int Temperature = Temprand.nextInt(200 - -100 + 1) + -100;
		double Pression = 1.00;
		int Fin = 0, Fin2 = 0, Fin3 = 0, Fin4 = 0;
		
		
		
//		double Temperature =  10000726.85, Pression = 1.00;
		int nbrAtomeHydrogene = 221, nbrAtomeOxygene = 121;
//	                            S L G
		int nbrMoleculeH2O[] = {0,0,0,0};
		
		int nbrQuarkUp = (int) (Math.random() * ( 100000 - 0 )), nbrQuarkDown = (int) (Math.random() * ( 100000 - 0 ));
		int nbrProton = 0, nbrNeutron = 0, nbrDeuterium = 0, nbrHelium3 = 0, nbrHelium = 0, nbrElectron = 1000000;
		int nbrNeutrino = 0, nbrPositron = 0, nbrGamma = 0;
		double energieProduite = 0; 
		
		System.out.println("Il y a " + nbrQuarkUp + " Quark UP et " + nbrQuarkDown + " Quark Down");
		System.out.println("Il y a " + nbrProton + " Proton");
		
		do{Fin = 0;
			
			int Choix = (int) (Math.random() * (2));
			
			if(nbrQuarkUp >= 2 & nbrQuarkDown >= 1 & Choix == 0){
				
				nbrQuarkUp -= 2; 
				nbrQuarkDown -= 1;
				nbrProton += 1;
				
			Fin = 1;}
			
			if(nbrQuarkUp >= 1 & nbrQuarkDown >= 2 & Choix == 1){
				
				nbrQuarkUp -= 1; 
				nbrQuarkDown -= 2;
				nbrNeutron += 1;
				
			Fin = 1;}
		}while(Fin == 1);
		
		System.out.println("A la fin il y a:");
		System.out.println("Il y a " + nbrQuarkUp + " Quark UP et " + nbrQuarkDown + " Quark Down");
		System.out.println("Il y a " + nbrProton + " Proton et " + nbrNeutron + " Neutron \n");
		
		System.out.println("fusion chaine Proton-Proton");
		do{Fin = 0;Fin2 = 0; Fin3 = 0;Fin4 = 0;
			if(nbrProton >= 2 & Temperature > 9999726.85 & Temperature < 13999726.85){
				
				nbrProton -= 2;
				nbrDeuterium += 1;
				nbrNeutrino += 1;
				nbrPositron += 1;
				energieProduite += 0.42;//MeV
				
			Fin = 1;}
			
			if(nbrPositron > 0 & nbrElectron > 0 & Temperature > 9999726.85 & Temperature < 13999726.85){
				
				nbrPositron -= 1;
				nbrElectron -= 1;
				nbrGamma += 2;
				energieProduite += 	1.02;
				
			Fin2 = 1;}
			
			if(nbrProton > 0 & nbrDeuterium > 0 & Temperature > 9999726.85 & Temperature < 13999726.85){
				
				nbrProton -= 1;
				nbrDeuterium -= 1 ;
				nbrHelium3 += 1;
				nbrGamma += 1;
				energieProduite += 	5.49;
				
			Fin3 = 1;}
			
			if(nbrHelium3 >= 2 & Temperature > 9999726.85 & Temperature < 13999726.85){
				
				nbrHelium3 -= 2;
				nbrHelium += 1;
				nbrProton += 2;
				energieProduite += 	12.86;
				
			Fin4 = 1;}
			
			
			
		}while(Fin == 1 | Fin2 == 1 | Fin3 == 1 | Fin4 == 1);
		
		
		System.out.println("Il reste " + nbrProton + " Proton \n" + nbrDeuterium + " Deuterium");
		System.out.println(nbrNeutrino + " Neutrino et " + nbrPositron + " Positron et " + nbrGamma + " Rayon Gamma");
		System.out.println(nbrHelium3 + " Helium3 et " + nbrHelium + " Helium");
		System.out.println("L'energie produite est " + energieProduite + "MeV");
		
		
		
		
		
		
		System.out.println("Creation d'une molecule d'eau");
		System.out.println("Il y a " + nbrAtomeHydrogene + " d'Hydrogene et il y a " + nbrAtomeOxygene + " atomes d'Oxygene");
		System.out.println("Il y a " + nbrMoleculeH2O[0] + " Molecule d'eau");
		
		do{Fin = 0;
			if (nbrAtomeHydrogene >= 2 & nbrAtomeOxygene >= 1 ){
				if(Temperature < 0 & Pression == 1.00){
					nbrAtomeHydrogene -= 2;  
					nbrAtomeOxygene -= 1;
					nbrMoleculeH2O[0] ++;
					nbrMoleculeH2O[1] ++;
				}else if(Temperature >= 0 & Temperature <= 100 & Pression == 1.00){
					nbrAtomeHydrogene -= 2;  
					nbrAtomeOxygene -= 1;
					nbrMoleculeH2O[0] ++;
					nbrMoleculeH2O[2] ++;
				}else if(Temperature > 100 & Pression == 1.00){
					nbrAtomeHydrogene -= 2;  
					nbrAtomeOxygene -= 1;
					nbrMoleculeH2O[0] ++;
					nbrMoleculeH2O[3] ++;
				}
				
				Temperature += 6;
				//Temperature = rand.nextInt(200 - -100) + -100;
				
			Fin = 1;}
		}while(Fin == 1);
		
		
		
		
		
		System.out.println("\n Maintenant il y a :");
		System.out.println("Il y a " + nbrAtomeHydrogene + " d'Hydrogene et il y a " + nbrAtomeOxygene + " atomes d'Oxygene");
		System.out.println("Il y a " + nbrMoleculeH2O[0] + " Molecule d'eau");
		System.out.println("Il y a " + nbrMoleculeH2O[1] + " Eau Solide");
		System.out.println("Il y a " + nbrMoleculeH2O[2] + " Eau Liquide");
		System.out.println("Il y a " + nbrMoleculeH2O[3] + " Eau Gazeux");
		

		clavier.close();
	}

}
