package automat;

public class TjekIndtjening {

	public static void main(String[] args) {

		Billetautomat automat = new Billetautomat();
		
		int fejl = 0;
		int retur;
		automat.montørLogin("1234");
		System.out.println("Vi køber 2 billetter af 10kr stykket, og 2 billetter af 20kr stykket");
		System.out.println("Total indkomst er 60kr");
		for (int i = 0; i < 2; i++) {
			automat.indsætPenge(10);
			automat.udskrivBillet();
		}
		automat.setBilletpris(20);
		for (int i = 0; i < 2; i++) {
			automat.indsætPenge(20);
			automat.udskrivBillet();
		}	
		if (automat.getTotal() != 60) {
			System.out.println("Total indkomst blev ikke 60!");
			fejl = 1;
		}
		System.out.println("Total indkomst: " + automat.getTotal()+" kr");
		
		if (fejl == 1) {
			System.out.println("Automaten har fejl, ØV!!!");
		} else {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		}

	}

}
