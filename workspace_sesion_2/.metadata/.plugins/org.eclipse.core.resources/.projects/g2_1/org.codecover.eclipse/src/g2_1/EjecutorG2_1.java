package g2_1;

public class EjecutorG2_1 {
	
	public static int hexDigToDec (char unaLetra)
	{
		int ret=-1;
		boolean esCifra=false;
		boolean esLetraHex=false;
		
		//convierto todo a minusculas
		if (unaLetra>='A' && unaLetra<='F')
			unaLetra=Character.toLowerCase(unaLetra);
			
		
		//compruebo si entrada está bien
		esLetraHex=(unaLetra>='a' && unaLetra<='f');
		esCifra=(unaLetra>='0' && unaLetra<='9');
		
		boolean error=!(esCifra || esLetraHex);
		
		//proceso
		if (!error) //if (unaLetra>='a' && unaLetra<='f') OR
					//(unaLetra>='0' && unaLetra<='9')
		{
			if (esCifra)
				ret=Character.getNumericValue(unaLetra);
			else
				if (esLetraHex)
					ret=10+unaLetra-'a';
		}
				
	
		
		
		return ret;
	}

}
