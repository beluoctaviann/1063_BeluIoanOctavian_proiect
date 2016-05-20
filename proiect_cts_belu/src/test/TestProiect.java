package test;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Detalii;

public class TestProiect {

	@Test
	public void test_pret() {
		Detalii det=new Detalii();
		int pretOferitClient=det.getPret(2500);
		int pretVanzator=2500;
		assertEquals("Pret necorespunzator",pretVanzator,pretOferitClient);
		assertTrue(det.pretMare(pretOferitClient, pretVanzator));
		assertFalse(det.pretMare((pretOferitClient-1000), pretVanzator));
		assertFalse(det.pretMare(pretOferitClient,(pretVanzator+100)));
		try{
			int p=det.diferentaPret(pretOferitClient, pretVanzator);
			fail("Pret necorespunzator");
		}
		catch(Exception er)
		{}
	}
	
	@Test
	public void test_anFabricatie()
	{
		Detalii det=new Detalii();
		assertTrue(det.checkFabricatie());
		assertNotNull(det.varstaAuto(2016));
		
		
		Detalii det2=new Detalii();
		det2.setAnFabricatie(1999);
		int varstaAuto=det2.varstaAuto(2016);
		int rezultat=17;
		assertEquals("Rezultat gresit",rezultat,varstaAuto);
		
	}

	@Test
	public void test_capacitate()
	{
		Detalii det=new Detalii();
		double capacitate=det.taxa(1.3, 300);
		double taxa=300;
		assertEquals("Taxa incorecta",taxa,capacitate,2); 
		
	}
	
	@Test
	public void test_rulaj()
	{
		Detalii det=new Detalii();
		int km=det.uzura(80000,"noua");
		int uz=80000;
		assertEquals("Error",uz,km); 
		
		Detalii det2=new Detalii();
		int medieAn=det2.medieKm(2016, 2002, 125000);
		int rezultat=8928;
		assertEquals("Error",rezultat,medieAn);
		
		
	}
	
	@Test
	public void test_combustibil()
	{
		Detalii det=new Detalii(2001,3200,1.9,231000,"1");
		assertEquals("benzina",det.getCombustibil1());
		
		Detalii det2=new Detalii(2015,15000,1.5,31000,"3");
		assertEquals("hybrid",det2.getCombustibil1());
	}
	
	@Test
	public void test_verificaAnunt()
	{
		Detalii det=new Detalii();
		assertSame(det,det.Clone());
	}
	
	@Test
	public void test_vinde()
	{
		Detalii det=new Detalii(2001,3200,1.9,231000,"motorina");
		assertTrue(det.Vinde2(2300));
		
	}
	@Test
	public void test_DateComplete()
	{
		Detalii det=new Detalii();
		assertTrue(det.DateComplete(2002, 1500, 2.0, 381254));
	}
}
