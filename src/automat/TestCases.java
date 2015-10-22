package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	Billetautomat automat = new Billetautomat();

	@Test
	public void testAfMontørkoderSetBilletpris() {

		int retur;

		automat.montørLogin("6789");
		automat.setBilletpris(20);
		retur = automat.getBilletpris();

		assertEquals(10, retur);

	}

	@Test
	public void testBilletSalg() {

		int retur;

		automat.indsætPenge(0);
		automat.udskrivBillet();
		retur = automat.returpenge();

		assertEquals(0, retur);

	}

	@Test
	public void testIndtjening() {

		automat.montørLogin("1234");

		for (int i = 0; i < 2; i++) {
			automat.indsætPenge(10);
			automat.udskrivBillet();
		}
		automat.setBilletpris(20);
		for (int i = 0; i < 2; i++) {
			automat.indsætPenge(20);
			automat.udskrivBillet();
		}

		assertEquals(automat.getTotal(), 60);

	}

	@Test
	public void testNejativBeloeb() {

		automat.indsætPenge(500);

		automat.indsætPenge(-150);

		assertEquals(automat.getBalance(), 500);

	}

}
