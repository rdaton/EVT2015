package g2_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestG2_1 {

	@Test
	public void hexDigToDecTest1() {
		char unaLetra='a';
		int res=EjecutorG2_1.hexDigToDec(unaLetra);
		assertTrue(res==0);
	}

}