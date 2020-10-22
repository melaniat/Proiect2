package Proiect2;
import java.util.ArrayList;
import Proiect2.Biblioteca;
import Proiect2.Carte;

	public class LibraryManagement {

		  /**
	     * The application should be able to list all the books in a library
	     * The application should be able to identify if there are multiple copies of the same book (based on its title)
	     * The application should be able to list groups of books in the library, based on different attributes (genre, author etc.)
	     * The application should allow users to borrow a book. Once borrowed, if the book has only one copy, it should shown as unavailable
	     * Use different constructors where needed
	     * The application should use the object oriented paradigm
	     */

	    public static void main(String[] args) {
	        Biblioteca biblioteca = new Biblioteca();

	        Carte carte0 = new Carte("Matei", "Pisica neagra", "Roman politist", 100, true, 2);
	        Carte carte1 = new Carte("Matei", "Pisica portocalie", "Roman politist", 100, true, 2);
	        Carte carte2 = new Carte("Matei", "Pisica visinie", "Roman politist", 100, true, 2);
	        Carte carte3 = new Carte("Alex", "Pisica alba", "Liric", 50, true, 1);
	        Carte carte4 = new Carte("Victor", "Cainele negru", "Liric", 50, true, 1);

	        ArrayList<Carte> carti = new ArrayList<>();
	        carti.add(carte0);
	        carti.add(carte1);
	        carti.add(carte2);
	        carti.add(carte3);
	        carti.add(carte4);

	        biblioteca.carti = carti;

	        biblioteca.afiseazaCarti();

	        System.out.println("Incepe afisarea pt carti cu genul liric:");
	        biblioteca.afiseazaCartiCuGenul("liric");
	        System.out.println("Incepe afisarea pt carti cu genul Roman politist:");
	        biblioteca.afiseazaCartiCuGenul("Roman politist");
	    }

		}

	


