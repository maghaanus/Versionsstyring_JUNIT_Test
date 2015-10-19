package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	Billetautomat automat = new Billetautomat();
	
	@Test
	public void test() {
		 
		int retur;
		
		automat.montørLogin("6789");	
		automat.setBilletpris(20);
		retur = automat.getBilletpris();
		
		assertEquals(10, retur);
		
	}

}
