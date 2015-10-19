package automat;

public class TjekAfMontoerkoder {

	public static void main(String[] args) {

		Billetautomat automat = new Billetautomat();
		
		int antalFejl = 0;
		int retur;
		
		System.out.println("*** Tjek af, at kun den korrekte montørkode fungerer");
		automat.montørLogin("6789");	
		automat.setBilletpris(20);
		
		retur = automat.getBilletpris();
		
		if (retur != 10) {
			System.out.println("FEJL, setBilletpris() skulle give 10, men den gav: "+retur);
			antalFejl = antalFejl + 1;

		}

		System.out.println();
		System.out.println();
		System.out.println("Der blev fundet "+antalFejl+" fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");
		}	

	}
}	
		
		
		

