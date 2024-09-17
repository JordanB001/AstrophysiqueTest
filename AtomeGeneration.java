
public class AtomeGeneration {
	
	public AtomeGeneration(int nbrA){
		double Isotope = 0 + (double)(Math.random() * ((100 - 0.0) + 1));
		
		//Hydrogene
		if(nbrA == 1 & Parametres.nbrProton >= 1 & Parametres.nbrElectron >= 1){
			if(Isotope <= 0.0000001 & Parametres.nbrNeutron >= 2){
				Parametres.nbrProton -= 1;
				Parametres.nbrElectron -= 1;
				Parametres.nbrNeutron -= 2;
				Parametres.nbrTritium += 1;
			}else if(Isotope <= 0.015 & Parametres.nbrNeutron >= 1){
				Parametres.nbrProton -= 1;
				Parametres.nbrElectron -= 1;
				Parametres.nbrNeutron -= 1;
				Parametres.nbrDeuterium += 1;
			}else{
				Parametres.nbrProton -= 1;
				Parametres.nbrElectron -= 1;
				Parametres.nbrHydrogene += 1;
		}}
		//Helium
		if(nbrA == 2 & Parametres.nbrProton >= 2 & Parametres.nbrNeutron >= 2 & Parametres.nbrElectron >= 2){
			if(Isotope <= 0.000137){
				Parametres.nbrProton -= 2;
				Parametres.nbrElectron -= 2;
				Parametres.nbrNeutron -= 1;
				Parametres.nbrHelium += 1;
			}else{
			Parametres.nbrProton -= 2;
			Parametres.nbrElectron -= 2;
			Parametres.nbrNeutron -= 2;
			Parametres.nbrHelium += 1;
		}}
		//Lithium
		if(nbrA == 3 & Parametres.nbrProton >= 3 & Parametres.nbrNeutron >= 4 & Parametres.nbrElectron >= 3){
			if(Isotope <= 5.9323351){
				Parametres.nbrProton -= 3;
				Parametres.nbrElectron -= 3;
				Parametres.nbrNeutron -= 3;
				Parametres.nbrLithium6 += 1;
			}else{
			Parametres.nbrProton -= 3;
			Parametres.nbrElectron -= 3;
			Parametres.nbrNeutron -= 4;
			Parametres.nbrLithium += 1;
		}}
		//Beryllium
		if(nbrA == 4 & Parametres.nbrProton >= 4 & Parametres.nbrNeutron >= 5 & Parametres.nbrElectron >= 4){
			Parametres.nbrProton -= 4;
			Parametres.nbrElectron -= 4;
			Parametres.nbrNeutron -= 5;
			Parametres.nbrBeryllium += 1;
		}
		//Bore
		if(nbrA == 5 & Parametres.nbrProton >= 5 & Parametres.nbrNeutron >= 6 & Parametres.nbrElectron >= 5){
			if(Isotope <= 19.9){
				Parametres.nbrProton -= 5;
				Parametres.nbrElectron -= 5;
				Parametres.nbrNeutron -= 5;
				Parametres.nbrBore10 += 1;
			}else{
			Parametres.nbrProton -= 5;
			Parametres.nbrElectron -= 5;
			Parametres.nbrNeutron -= 6;
			Parametres.nbrBore += 1;
		}}
		//Carbone
		if(nbrA == 6 & Parametres.nbrProton >= 6 & Parametres.nbrNeutron >= 6 & Parametres.nbrElectron >= 6){
			if(Isotope <= 1.07 & Parametres.nbrNeutron >= 7){
				Parametres.nbrProton -= 6;
				Parametres.nbrElectron -= 6;
				Parametres.nbrNeutron -= 7;
				Parametres.nbrCarbone13 += 1;
			}else{
			Parametres.nbrProton -= 6;
			Parametres.nbrElectron -= 6;
			Parametres.nbrNeutron -= 6;
			Parametres.nbrCarbone += 1;
		}}
		//Azote
				if(nbrA == 7 & Parametres.nbrProton >= 7 & Parametres.nbrNeutron >= 7 & Parametres.nbrElectron >= 7){
					if(Isotope <= 0.366 & Parametres.nbrNeutron >= 8){
						Parametres.nbrProton -= 7;
						Parametres.nbrElectron -= 7;
						Parametres.nbrNeutron -= 8;
						Parametres.nbrAzote15 += 1;
					}else{
					Parametres.nbrProton -= 7;
					Parametres.nbrElectron -= 7;
					Parametres.nbrNeutron -= 7;
					Parametres.nbrAzote += 1;
				}}
				//Oxygene
				if(nbrA == 8 & Parametres.nbrProton >= 8 & Parametres.nbrNeutron >= 8 & Parametres.nbrElectron >= 8){
					if(Isotope <= 0.038 & Parametres.nbrNeutron >= 9){
						Parametres.nbrProton -= 8;
						Parametres.nbrElectron -= 8;
						Parametres.nbrNeutron -= 9;
						Parametres.nbrOxygene17 += 1;
					}else if(Isotope <= 0.205 & Parametres.nbrNeutron >= 10){
						Parametres.nbrProton -= 8;
						Parametres.nbrElectron -= 8;
						Parametres.nbrNeutron -= 10;
						Parametres.nbrOxygene18 += 1;
					}else{
					Parametres.nbrProton -= 8;
					Parametres.nbrElectron -= 8;
					Parametres.nbrNeutron -= 8;
					Parametres.nbrOxygene += 1;
				}}
				//Fluor
				if(nbrA == 9 & Parametres.nbrProton >= 9 & Parametres.nbrNeutron >= 10 & Parametres.nbrElectron >= 9){
					Parametres.nbrProton -= 9;
					Parametres.nbrElectron -= 9;
					Parametres.nbrNeutron -= 10;
					Parametres.nbrFluor += 1;
				}
				//Neon
				if(nbrA == 10 & Parametres.nbrProton >= 10 & Parametres.nbrNeutron >= 10 & Parametres.nbrElectron >= 10){
					if(Isotope <= 0.27 & Parametres.nbrNeutron >= 11){
						Parametres.nbrProton -= 10;
						Parametres.nbrElectron -= 10;
						Parametres.nbrNeutron -= 11;
						Parametres.nbrNeon21 += 1;
					}else if(Isotope <= 9.25 & Parametres.nbrNeutron >= 12){
						Parametres.nbrProton -= 10;
						Parametres.nbrElectron -= 10;
						Parametres.nbrNeutron -= 12;
						Parametres.nbrNeon22 += 1;
					}else{
					Parametres.nbrProton -= 10;
					Parametres.nbrElectron -= 10;
					Parametres.nbrNeutron -= 10;
					Parametres.nbrNeon += 1;
				}}
				//Sodium
				if(nbrA == 11 & Parametres.nbrProton >= 11 & Parametres.nbrNeutron >= 12 & Parametres.nbrElectron >= 11){
					Parametres.nbrProton -= 11;
					Parametres.nbrElectron -= 11;
					Parametres.nbrNeutron -= 12;
					Parametres.nbrSodium += 1;
				}
				//Magnesium
				if(nbrA == 12 & Parametres.nbrProton >= 12 & Parametres.nbrNeutron >= 12 & Parametres.nbrElectron >= 12){
					if(Isotope <= 10.00 & Parametres.nbrNeutron >= 13){
						Parametres.nbrProton -= 12;
						Parametres.nbrElectron -= 12;
						Parametres.nbrNeutron -= 13;
						Parametres.nbrMagnesium25 += 1;
					}else if(Isotope <= 11.01 & Parametres.nbrNeutron >= 14){
						Parametres.nbrProton -= 12;
						Parametres.nbrElectron -= 12;
						Parametres.nbrNeutron -= 14;
						Parametres.nbrMagnesium26 += 1;
					}else{
					Parametres.nbrProton -= 12;
					Parametres.nbrElectron -= 12;
					Parametres.nbrNeutron -= 12;
					Parametres.nbrMagnesium += 1;
				}}
				//Aluminium
				if(nbrA == 13 & Parametres.nbrProton >= 13 & Parametres.nbrNeutron >= 14 & Parametres.nbrElectron >= 13){
					Parametres.nbrProton -= 13;
					Parametres.nbrElectron -= 13;
					Parametres.nbrNeutron -= 14;
					Parametres.nbrAluminium += 1;
				}
				//Silicium
				if(nbrA == 14 & Parametres.nbrProton >= 14 & Parametres.nbrNeutron >= 14 & Parametres.nbrElectron >= 14){
					if(Isotope <= 3.092 & Parametres.nbrNeutron >= 16){
						Parametres.nbrProton -= 14;
						Parametres.nbrElectron -= 14;
						Parametres.nbrNeutron -= 16;
						Parametres.nbrSilicium30 += 1;
					}else if(Isotope <= 4.685 & Parametres.nbrNeutron >= 15){
						Parametres.nbrProton -= 14;
						Parametres.nbrElectron -= 14;
						Parametres.nbrNeutron -= 15;
						Parametres.nbrSilicium29 += 1;
					}else{
					Parametres.nbrProton -= 14;
					Parametres.nbrElectron -= 14;
					Parametres.nbrNeutron -= 14;
					Parametres.nbrSilicium += 1;
				}}
				//Phosphore
				if(nbrA == 15 & Parametres.nbrProton >= 15 & Parametres.nbrNeutron >= 16 & Parametres.nbrElectron >= 15){
					Parametres.nbrProton -= 15;
					Parametres.nbrElectron -= 15;
					Parametres.nbrNeutron -= 16;
					Parametres.nbrPhosphore += 1;
				}
				//Soufre
				if(nbrA == 16 & Parametres.nbrProton >= 16 & Parametres.nbrNeutron >= 16 & Parametres.nbrElectron >= 16){
					if(Isotope <= 0.02 & Parametres.nbrNeutron >= 20){
						Parametres.nbrProton -= 16;
						Parametres.nbrElectron -= 16;
						Parametres.nbrNeutron -= 20;
						Parametres.nbrSoufre36 += 1;
					}else if(Isotope <= 0.76 & Parametres.nbrNeutron >= 17){
						Parametres.nbrProton -= 16;
						Parametres.nbrElectron -= 16;
						Parametres.nbrNeutron -= 17;
						Parametres.nbrSoufre33 += 1;
					}else if(Isotope <= 4.29 & Parametres.nbrNeutron >= 18){
						Parametres.nbrProton -= 16;
						Parametres.nbrElectron -= 16;
						Parametres.nbrNeutron -= 18;
						Parametres.nbrSoufre34 += 1;
					}else{
					Parametres.nbrProton -= 16;
					Parametres.nbrElectron -= 16;
					Parametres.nbrNeutron -= 16;
					Parametres.nbrSoufre += 1;
				}}
		//		//Chlore
		//		if(nbrA == 17 & Parametres.nbrProton >= 17 & Parametres.nbrNeutron >= AA & Parametres.nbrElectron >= 17){
		//			if(Isotope <= AA){
		//				Parametres.nbrProton -= 17;
		//				Parametres.nbrElectron -= 17;
		//				Parametres.nbrNeutron -= AA;
		//				Parametres.nbrAA += 1;
		//			}else{
		//			Parametres.nbrProton -= 17;
		//			Parametres.nbrElectron -= 17;
		//			Parametres.nbrNeutron -= AA;
		//			Parametres.nbrChlore += 1;
		//		}}
		//		//Argon
		//		if(nbrA == 18 & Parametres.nbrProton >= 18 & Parametres.nbrNeutron >= AA & Parametres.nbrElectron >= 18){
		//			if(Isotope <= AA){
		//				Parametres.nbrProton -= 18;
		//				Parametres.nbrElectron -= 18;
		//				Parametres.nbrNeutron -= AA;
		//				Parametres.nbrAA += 1;
		//			}else{
		//			Parametres.nbrProton -= 18;
		//			Parametres.nbrElectron -= 18;
		//			Parametres.nbrNeutron -= AA;
		//			Parametres.nbrArgon += 1;
		//		}}
		//		//Potassium
		//		if(nbrA == 19 & Parametres.nbrProton >= 19 & Parametres.nbrNeutron >= AA & Parametres.nbrElectron >= 19){
		//			if(Isotope <= AA){
		//				Parametres.nbrProton -= 19;
		//				Parametres.nbrElectron -= 19;
		//				Parametres.nbrNeutron -= AA;
		//				Parametres.nbrAA += 1;
		//			}else{
		//			Parametres.nbrProton -= 19;
		//			Parametres.nbrElectron -= 19;
		//			Parametres.nbrNeutron -= AA;
		//			Parametres.nbrPotassium += 1;
		//		}}
		//		//Calcium
		//		if(nbrA == 20 & Parametres.nbrProton >= 20 & Parametres.nbrNeutron >= AA & Parametres.nbrElectron >= 20){
		//			if(Isotope <= AA){
		//				Parametres.nbrProton -= 20;
		//				Parametres.nbrElectron -= 20;
		//				Parametres.nbrNeutron -= AA;
		//				Parametres.nbrAA += 1;
		//			}else{
		//			Parametres.nbrProton -= 20;
		//			Parametres.nbrElectron -= 20;
		//			Parametres.nbrNeutron -= AA;
		//			Parametres.nbrCalcium += 1;
		//		}}
		//		//Scandium
		//		if(nbrA == 21 & Parametres.nbrProton >= 21 & Parametres.nbrNeutron >= AA & Parametres.nbrElectron >= 21){
		//			if(Isotope <= AA){
		//				Parametres.nbrProton -= 21;
		//				Parametres.nbrElectron -= 21;
		//				Parametres.nbrNeutron -= AA;
		//				Parametres.nbrAA += 1;
		//			}else{
		//			Parametres.nbrProton -= 21;
		//			Parametres.nbrElectron -= 21;
		//			Parametres.nbrNeutron -= AA;
		//			Parametres.nbrScandium += 1;
		//		}}
		//		//Titane
		//		if(nbrA == 22 & Parametres.nbrProton >= 22 & Parametres.nbrNeutron >= AA & Parametres.nbrElectron >= 22){
		//			if(Isotope <= AA){
		//				Parametres.nbrProton -= 22;
		//				Parametres.nbrElectron -= 22;
		//				Parametres.nbrNeutron -= AA;
		//				Parametres.nbrAA += 1;
		//			}else{
		//			Parametres.nbrProton -= 22;
		//			Parametres.nbrElectron -= 22;
		//			Parametres.nbrNeutron -= AA;
		//			Parametres.nbrTitane += 1;
		//		}}
		//		//Vanadium
		//		if(nbrA == 23 & Parametres.nbrProton >= 23 & Parametres.nbrNeutron >= AA & Parametres.nbrElectron >= 23){
		//			if(Isotope <= AA){
		//				Parametres.nbrProton -= 23;
		//				Parametres.nbrElectron -= 23;
		//				Parametres.nbrNeutron -= AA;
		//				Parametres.nbrAA += 1;
		//			}else{
		//			Parametres.nbrProton -= 23;
		//			Parametres.nbrElectron -= 23;
		//			Parametres.nbrNeutron -= AA;
		//			Parametres.nbrVanadium += 1;
		//		}}
		//		//Chrome
		//		if(nbrA == 24 & Parametres.nbrProton >= 24 & Parametres.nbrNeutron >= AA & Parametres.nbrElectron >= 24){
		//			if(Isotope <= AA){
		//				Parametres.nbrProton -= 24;
		//				Parametres.nbrElectron -= 24;
		//				Parametres.nbrNeutron -= AA;
		//				Parametres.nbrAA += 1;
		//			}else{
		//			Parametres.nbrProton -= 24;
		//			Parametres.nbrElectron -= 24;
		//			Parametres.nbrNeutron -= AA;
		//			Parametres.nbrChrome += 1;
		//		}}
		//		//Manganese
		//		if(nbrA == 25 & Parametres.nbrProton >= 25 & Parametres.nbrNeutron >= AA & Parametres.nbrElectron >= 25){
		//			if(Isotope <= AA){
		//				Parametres.nbrProton -= 25;
		//				Parametres.nbrElectron -= 25;
		//				Parametres.nbrNeutron -= AA;
		//				Parametres.nbrAA += 1;
		//			}else{
		//			Parametres.nbrProton -= 25;
		//			Parametres.nbrElectron -= 25;
		//			Parametres.nbrNeutron -= AA;
		//			Parametres.nbrManganese += 1;
		//		}}
		//		//Fer
		//		if(nbrA == 26 & Parametres.nbrProton >= 26 & Parametres.nbrNeutron >= AA & Parametres.nbrElectron >= 26){
		//			if(Isotope <= AA){
		//				Parametres.nbrProton -= 26;
		//				Parametres.nbrElectron -= 26;
		//				Parametres.nbrNeutron -= AA;
		//				Parametres.nbrAA += 1;
		//			}else{
		//			Parametres.nbrProton -= 26;
		//			Parametres.nbrElectron -= 26;
		//			Parametres.nbrNeutron -= AA;
		//			Parametres.nbrFer += 1;
		//		}}
		//		//Cobalt
		//		if(nbrA == 27 & Parametres.nbrProton >= 27 & Parametres.nbrNeutron >= AA & Parametres.nbrElectron >= 27){
		//			if(Isotope <= AA){
		//				Parametres.nbrProton -= 27;
		//				Parametres.nbrElectron -= 27;
		//				Parametres.nbrNeutron -= AA;
		//				Parametres.nbrAA += 1;
		//			}else{
		//			Parametres.nbrProton -= 27;
		//			Parametres.nbrElectron -= 27;
		//			Parametres.nbrNeutron -= AA;
		//			Parametres.nbrCobalt += 1;
		//		}}
		//		//Nickel
		//		if(nbrA == 28 & Parametres.nbrProton >= 28 & Parametres.nbrNeutron >= AA & Parametres.nbrElectron >= 28){
		//			if(Isotope <= AA){
		//				Parametres.nbrProton -= 28;
		//				Parametres.nbrElectron -= 28;
		//				Parametres.nbrNeutron -= AA;
		//				Parametres.nbrAA += 1;
		//			}else{
		//			Parametres.nbrProton -= 28;
		//			Parametres.nbrElectron -= 28;
		//			Parametres.nbrNeutron -= AA;
		//			Parametres.nbrNickel += 1;
		//		}}
		//		//Cuivre
		//		if(nbrA == 29 & Parametres.nbrProton >= 29 & Parametres.nbrNeutron >= AA & Parametres.nbrElectron >= 29){
		//			if(Isotope <= AA){
		//				Parametres.nbrProton -= 29;
		//				Parametres.nbrElectron -= 29;
		//				Parametres.nbrNeutron -= AA;
		//				Parametres.nbrAA += 1;
		//			}else{
		//			Parametres.nbrProton -= 29;
		//			Parametres.nbrElectron -= 29;
		//			Parametres.nbrNeutron -= AA;
		//			Parametres.nbrCuivre += 1;
		//		}}
		//		//Zinc
		//		if(nbrA == 30 & Parametres.nbrProton >= 30 & Parametres.nbrNeutron >= AA & Parametres.nbrElectron >= 30){
		//			if(Isotope <= AA){
		//				Parametres.nbrProton -= 30;
		//				Parametres.nbrElectron -= 30;
		//				Parametres.nbrNeutron -= AA;
		//				Parametres.nbrAA += 1;
		//			}else{
		//			Parametres.nbrProton -= 30;
		//			Parametres.nbrElectron -= 30;
		//			Parametres.nbrNeutron -= AA;
		//			Parametres.nbrZinc += 1;
		//		}}
		//		//Gallium
		//		if(nbrA == 31 & Parametres.nbrProton >= 31 & Parametres.nbrNeutron >= AA & Parametres.nbrElectron >= 31){
		//			if(Isotope <= AA){
		//				Parametres.nbrProton -= 31;
		//				Parametres.nbrElectron -= 31;
		//				Parametres.nbrNeutron -= AA;
		//				Parametres.nbrAA += 1;
		//			}else{
		//			Parametres.nbrProton -= 31;
		//			Parametres.nbrElectron -= 31;
		//			Parametres.nbrNeutron -= AA;
		//			Parametres.nbrGallium += 1;
		//		}}
		//		//AA
		//		if(nbrA == AA & Parametres.nbrProton >= AA & Parametres.nbrNeutron >= AA & Parametres.nbrElectron >= AA){
		//			if(Isotope <= AA){
		//				Parametres.nbrProton -= AA;
		//				Parametres.nbrElectron -= AA;
		//				Parametres.nbrNeutron -= AA;
		//				Parametres.nbrAA += 1;
		//			}else{
		//			Parametres.nbrProton -= AA;
		//			Parametres.nbrElectron -= AA;
		//			Parametres.nbrNeutron -= AA;
		//			Parametres.nbrAA += 1;
		//		}}
				
				
				
				
				
				
				
				
				
				
		
	}
}
