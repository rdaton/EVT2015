package a1;

public class Triangulo {
	
	public enum TipoTriangulo{
		INVALIDO,EQUILATERO,ISOCELES,ESCALENO 
		}
	static int producto(int[] unar)
	{
		return unar[0]*unar[1]*unar[2];
	}
	static boolean factible (int[] unar)
	{
		return (unar[0]+unar[1]>unar[2]
				&&  unar[1]+unar[2]>unar[0]
				&&  unar[0]+unar[2]>unar[1]
						);
	}
	static boolean iguales(int[] unar)
	{
		return (unar[0]==unar[1] && unar[1]==unar[2] && unar[0]==unar[2]);
	}
	static boolean dosIguales(int[] unar)
	{
		return ((unar[0]==unar[1] && unar[1]==unar[2] && unar[0]!=unar[2])
				|| (unar[0]!=unar[1] && unar[1]==unar[2] && unar[0]==unar[2])
				|| (unar[0]==unar[1] && unar[1]!=unar[2] && unar[0]==unar[2])
				);
	}
	 static TipoTriangulo tipoDeTriangulo(int a, int b, int c)
	{
		int[] lados={a,b,c};
		boolean error=false;
		TipoTriangulo unReturn=TipoTriangulo.INVALIDO;
		
		if (producto(lados)<=0) return unReturn;
		if (!factible(lados)) return unReturn;
		if (iguales (lados)) 
			unReturn=TipoTriangulo.EQUILATERO;
		else if (dosIguales(lados))
			unReturn=TipoTriangulo.ISOCELES;
		else 
			unReturn=TipoTriangulo.ESCALENO;
		
		return unReturn;
	}

}


	