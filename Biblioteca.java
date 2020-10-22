package Proiect2;
import java.util.ArrayList;
public class Biblioteca {

	

				/**
				 * The application should be able to list all the books in a library
				 */

				    ArrayList<Carte> carti = new ArrayList<>();

				    Biblioteca(ArrayList<Carte> carti) {
				        this.carti = carti;
				    }

				    Biblioteca() {
				        System.out.println("Se apeleaza constructorul fara parametri.");
				    }

				    void afiseazaCarti() {
//				        for (Carte carte : carti) {
				//
//				        }

				        for (int i = 0; i < carti.size(); i++) {
				            Carte carte = carti.get(i);
				            carte.afisareDetalii();
				        }
				    }

				    void afiseazaCartiCuGenul(String gen) {
				        for (int i = 0; i < carti.size(); i++) {
				            if (carti.get(i).gen.equalsIgnoreCase(gen)) {
				                Carte carte = carti.get(i);
				                carte.afisareDetalii();
				            }
				        }
				}

			
	}


