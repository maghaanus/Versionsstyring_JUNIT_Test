package automat;

public class TjekNegativeBeloeb {
	public static void main(String[] arg) {
		Billetautomat automat = new Billetautomat();

		int antalFejl = 0;
		int retur;

		retur = automat.getBilletpris();
		if (retur != 10) {
			System.out.println("FEJL, getBilletpris() != 10");
		}
		automat.indsætPenge(500);
		int balance = automat.getBalance();
		if (balance != 500) {
			System.out.println("FEJL, balance skulle give 500, men den gav: " + balance);
			antalFejl = antalFejl + 1;
		}

		System.out.println("*** Tjek at automaten ikke kan modtage negative indsatte tal");
		automat.indsætPenge(-150);
		balance = automat.getBalance();
		if (balance != 500) {
			System.out.println("FEJL, returpenge() burde blive på 500, eftersom brugeren ikke bør kunne sætte -150 på sin konto, men gav i stedet: " + balance);
			antalFejl = antalFejl + 1;
		}

		System.out.println();
		System.out.println();
		System.out.println("Der blev fundet " + antalFejl + " fejl i automaten");
		if (antalFejl == 0) {
			System.out.println("Automaten er fejlfri, HURRA!!!");
		} else {
			System.out.println("Automaten har fejl, ØV!!!");
		}
	}
}