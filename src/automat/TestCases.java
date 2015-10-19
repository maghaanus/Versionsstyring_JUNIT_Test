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

		int antalFejl = 0;
	}

}
