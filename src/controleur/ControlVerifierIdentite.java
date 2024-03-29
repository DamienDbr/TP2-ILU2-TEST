package controleur;

import villagegaulois.Village;

public class ControlVerifierIdentite {
	private Village village;

	public ControlVerifierIdentite(Village village) {
		this.village = village;
	}

	public boolean verifierIdentite(String nomVendeur) {
		//TODO a completer, attention le retour ne dit pas etre false :-)
		//debut modif
		if(nomVendeur != null) {
			if(village.trouverHabitant(nomVendeur) !=null) {
				return true;
			}
			return false;
		}
		return false;
		
	}
}
