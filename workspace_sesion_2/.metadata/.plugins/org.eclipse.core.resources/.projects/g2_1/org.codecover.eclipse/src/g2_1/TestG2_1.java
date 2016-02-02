package g2_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestG2_1 {

	@Test
	public void hexDigToDecTest1() {
		char unaLetra='a';
		int res=EjecutorG2_1.hexDigToDec(unaLetra);
		assertTrue(res==10);
	}
	
	@Test
	public void hexDigToDecTest2() {
		char unaLetra='f';
		int res=EjecutorG2_1.hexDigToDec(unaLetra);
		assertTrue(res==15);
	}
	
	@Test
	public void hexDigToDecTest3() {
		char unaLetra='0';
		int res=EjecutorG2_1.hexDigToDec(unaLetra);
		assertTrue(res==0);
	}
	
	@Test
	public void hexDigToDecTest4() {
		char unaLetra='9';
		int res=EjecutorG2_1.hexDigToDec(unaLetra);
		assertTrue(res==9);
	}
	
	@Test
	public void hexDigToDecTest5() {
		char unaLetra='A';
		int res=EjecutorG2_1.hexDigToDec(unaLetra);
		assertTrue(res==10);
	}
	
	@Test
	public void hexDigToDecTest6() {
		char unaLetra='F';
		int res=EjecutorG2_1.hexDigToDec(unaLetra);
		assertTrue(res==15);
	}
	
	@Test
	public void hexDigToDecTest7() {
		char unaLetra='K';
		int res=EjecutorG2_1.hexDigToDec(unaLetra);
		assertTrue(res==-1);
	}
	
	@Test
	public void hexDigToDecTest8() {
		char unaLetra='z';
		int res=EjecutorG2_1.hexDigToDec(unaLetra);
		assertTrue(res==-1);
	}
	
}