package g2_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestG2_1 {

	
	//StatementCoverage
	@Test
	public void hexDigToDecTest1() {
		char unaLetra='a';
		int res=EjecutorG2_1.hexDigToDec(unaLetra);
		assertTrue(res==10);
		
		unaLetra='A';
		res=EjecutorG2_1.hexDigToDec(unaLetra);
		assertTrue(res==10);
		
		
		unaLetra='0';
		res=EjecutorG2_1.hexDigToDec(unaLetra);
		assertTrue(res==0);
		
	}
	
	//Decision(Branch) Coverage ; Condition Coverage ; Decision/Condition Coverage ;
	//Multiple Condition Coverage (Term Coverage) ; no hay bucles... es un programa bastante sencillo
	//de ahí, que los cuatro conjuntos coincida
	@Test
	public void hexDigToDecTest2() {
		char unaLetra='a';
		int res=EjecutorG2_1.hexDigToDec(unaLetra);
		assertTrue(res==10);
		
		unaLetra='A';
		res=EjecutorG2_1.hexDigToDec(unaLetra);
		assertTrue(res==10);
		
		
		unaLetra='0';
		res=EjecutorG2_1.hexDigToDec(unaLetra);
		assertTrue(res==0);
		
		unaLetra='K';
		res=EjecutorG2_1.hexDigToDec(unaLetra);
		assertTrue(res==-1);
	}
	
	
}