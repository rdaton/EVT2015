package g2_2;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestG2_2 {
	
	
	
	//Statement Coverage; Decision(Branch) Coverage;
	@Test
	public void redondaTest1 ()
	{
	int[] unArray={2,4,6};
	int unRes=EjecutorG2_2.reRedonda(unArray);
	assertTrue(unRes==2);
	
	unArray=new int[0];
	unRes=EjecutorG2_2.reRedonda(unArray);		
	assertTrue(unRes==-1);
	
	unArray=new int[2];
	unArray[0]=1;
	unArray[1]=2;
	unRes=EjecutorG2_2.reRedonda(unArray);		
	assertTrue(unRes==-1);
	}
	
	//Condition Coverage; Term Coverage; 
	@Test
	public void redondaTest2 ()
	{
		redondaTest1();
		
		int[] unArray={6,4,2};
		int unRes=EjecutorG2_2.reRedonda(unArray);
		assertTrue(unRes==-1);
		
		unArray=new int[3];
		unArray[0]=2;
		unArray[1]=2;
		unArray[2]=6;
		unRes=EjecutorG2_2.reRedonda(unArray);		
		assertTrue(unRes==1);
		
		
	}
	
	

}
