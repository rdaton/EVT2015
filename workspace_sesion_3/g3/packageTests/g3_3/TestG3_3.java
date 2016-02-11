package g3_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestG3_3 {

	//Statement Coverage; Decision(Branch) Coverage;
	@Test
	public void encuentraPrimeraOvaladaTest1 ()
	{
	int[] unArray={2,4,6};
	int unRes=EjecutorG3_3.encuentraPrimeraOvalada(unArray);
	assertTrue(unRes==2);
	
	unArray=new int[0];
	unRes=EjecutorG3_3.encuentraPrimeraOvalada(unArray);		
	assertTrue(unRes==-1);
	
	unArray=new int[2];
	unArray[0]=1;
	unArray[1]=2;
	unRes=EjecutorG3_3.encuentraPrimeraOvalada(unArray);		
	assertTrue(unRes==-1);
	}
	
	//Condition Coverage; Term Coverage; 
	@Test
	public void encuentraPrimeraOvaladaTest2 ()
	{
		encuentraPrimeraOvaladaTest1();
		
		int[] unArray={6,4,2};
		int unRes=EjecutorG3_3.encuentraPrimeraOvalada(unArray);
		assertTrue(unRes==-1);
		
		unArray=new int[3];
		unArray[0]=2;
		unArray[1]=2;
		unArray[2]=6;
		unRes=EjecutorG3_3.encuentraPrimeraOvalada(unArray);		
		assertTrue(unRes==1);
		
		
	}



}
