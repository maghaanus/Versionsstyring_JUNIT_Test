package automat;
public class TjekBilletSalg
{
	public static void main(String[] arg)
	{
		Billetautomat automat = new Billetautomat();
		
		int antalFejl = 0;
		int retur;
		
System.out.println("*** Tjek af salg af en billet med en balance på 0");
		automat.indsætPenge(0);
		automat.udskrivBillet();
		retur = automat.returpenge();
		if (retur != 0) {
			System.out.println("Automaten har fejl, ØV!!!");
			System.out.println("FEJL, returpenge() skulle give 0, men den gav: "+retur);
			antalFejl = antalFejl + 1;
			
	
			
		
		}
	}
}