package a1;

import static org.junit.Assert.*;

import org.junit.*;

public class TipoTrianguloTest {
	public Triangulo.TipoTriangulo unTriangulo;
	
	@Before
	public void antesDelTest()
	{	
		
	}
	
	@After
	public void despuesDelTest()
	{
		
	}
	
	@Test
	public void test() {
		this.unTriangulo= Triangulo.tipoDeTriangulo(4,7,10);
		assertTrue(unTriangulo==Triangulo.TipoTriangulo.ESCALENO);
	}

}
