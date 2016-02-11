package g3_3;

public class EjecutorG3_3 {

	public static int encuentraPrimeraOvalada (int[] unArray)
	{
		//si array vacío
		if (unArray.length==0) return -1;
		int acumulada=0;		
		int i=0;
		boolean enc=false;		
		while ((i<unArray.length)  && !enc)
		{
			
			enc=((unArray[i]==0) || (unArray[i]==acumulada)&& (unArray[i]%2==0));
			acumulada+=unArray[i];			
			i++;
		}
		
		if (enc)
			return i-1;
		else
			return -1;

	}
	
	
}
