package clase;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import interfete.IAuto;

public class Detalii implements IAuto,Serializable{
	
	private int anFabricatie;
	private int pret;
	private double capacitate;
	private int rulaj;
	private String combustibil;
	

	public Detalii(int anFabricatie, int pret, double capacitate, int rulaj,
			String combustibil) {
		
		this.anFabricatie = anFabricatie;
		this.pret = pret;
		this.capacitate = capacitate;
		this.rulaj = rulaj;
		this.combustibil = combustibil;
	}
	
	public Detalii()
	{
		anFabricatie=2001;
		pret=3200;
		capacitate=1.9;
		rulaj=221500;
		combustibil="motorina";
	}
	
	
	
	public int getAnFabricatie() {
		return anFabricatie;
	}

	public void setAnFabricatie(int anFabricatie) {
		this.anFabricatie = anFabricatie;
	}

	public int getPret(int pret) {
		return pret;
	}

	public  void setPret(int pret) {
		this.pret = pret;
	}

	public double getCapacitate() {
		return capacitate;
	}

	public void setCapacitate(double capacitate) {
		this.capacitate = capacitate;
	}

	public int getRulaj() {
		return rulaj;
	}

	public void setRulaj(int rulaj) {
		this.rulaj = rulaj;
	}

	public String getCombustibil() {
		return combustibil;
	}

	public void setCombustibil(String combustibil) {
		this.combustibil = combustibil;
	}

	public static List<Autoturism> getAutoturisme() {
		return autoturisme;
	}

	public static void setAutoturisme(List<Autoturism> autoturisme) {
		Detalii.autoturisme = autoturisme;
	}
	
	@Override
	public void Detine()
	{
		System.out.println("Fabricat in "+anFabricatie+" la pretul "+pret+",capacitate:"
				+capacitate+",rulaj:"+rulaj+",combustibil:"+combustibil);
	}
	
	@Override
	public String Vinde()
	{
		String text="Autotursimul a fost vandut la un pret de "+pret;
		return text;
	}
	
	
	@Override
	public String getMarca() {
		return null;
	}
	
	
	
	@Override
	public String toString() {
		return "Detalii [anFabricatie=" + anFabricatie + ", pret=" + pret
				+ ", capacitate=" + capacitate + ", rulaj=" + rulaj
				+ ", combustibil=" + combustibil + "]";
	}



	public static List<Autoturism> autoturisme=new LinkedList<Autoturism>();


	@Override
	public String clientul() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cumpara() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop_negativ() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop_pozitiv() {
		// TODO Auto-generated method stub
		
	}
	
	//testari
	public boolean pretMare(int n1,int n2)
	{
		return n1==n2;
	}
	
	public boolean DateComplete(int anFabricatie, int pret, double capacitate, int rulaj)
	{
		if(anFabricatie==0 && pret==0 && capacitate==0 && rulaj==0)
		{
			throw new IllegalArgumentException("Nu au fost introduse toate datele!");
		}
		else
			return true;
	}
	
	public boolean Vinde2(int pret)
	{
		if(pret==0)
			throw new IllegalArgumentException("Autotursimul nu are pret");
		else
			return true;
	}
	public int diferentaPret(int n1,int n2)
	{
		if((n1-n2)<=n1)
		{
			throw new IllegalArgumentException("Pretul Vanzatorului este prea mare!");
		}
		else
			return n1=n2;
	}
	
	public boolean checkFabricatie()
	{
		if(anFabricatie<1986)
			throw new IllegalArgumentException("Masina este de epoca.");
		else
			return true;
	}
	
	public int varstaAuto(int anCurent)
	{
		if(anFabricatie==0)
			throw new IllegalArgumentException("Masina nu exista.");
		else
			return (anCurent-anFabricatie);
	}
	public double taxa(double capacitate1,double taxa)
	{
		if(capacitate1<=1.2)
			throw new IllegalArgumentException("Taxa de mediu este sub 300 euro.");
		else
			return capacitate1=300;
	}
	
	public int uzura(int km,String uz)
	{
		if(km>=100000)
			throw new IllegalArgumentException("Masina este putin uzata.");
		else
			return km;
	}
	
	public int medieKm(int anCurent, int anFabricatie,int rulaj)
	{
		if(anFabricatie==0)
			throw new IllegalArgumentException("Masina nu exista.");
		else
			return rulaj/(anCurent-anFabricatie);
	}
	
	public String getCombustibil1()
	{
		switch(combustibil.charAt(0))
		{
		case '1':return "benzina";
		case '2':return "motorina";
		case '3':return "hybrid";
		}
		return "Nu exista acest carburant";
	}
	
	public Detalii Clone()
	{
		return this;
	}
	
}
