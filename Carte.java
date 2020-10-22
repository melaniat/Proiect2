package Proiect2;

public class Carte {

	//public static void main(String[] args) {
			// TODO Auto-generated method stub
		String autor;
	    String denumire;
	    String gen;
	    int nrPagini;
	    boolean esteDisponibila;
	    int nrExemplare;

	    Carte(String autor, String denumire, String gen, int nrPagini,
	          boolean esteDisponibila, int nrExemplare){
	        this.autor = autor;
	        this.denumire = denumire;
	        this.gen = gen;
	        this.nrPagini = nrPagini;
	        this.esteDisponibila = esteDisponibila;
	        this.nrExemplare = nrExemplare;
	    }

	    void afisareDetalii() {
	        System.out.println("Titlul cartii este: " + this.denumire);
	        System.out.println("Autorul cartii este: " + this.autor);
	        System.out.println("Genul cartii este: " + this.gen);
	        System.out.println("Este cartea disponibila? " + this.esteDisponibila);
	        System.out.println("#############################################################");
	    }

		

	}


