package designPattern;

import clase.Detalii;
import interfete.IDetaliiBuilder;

public class DetaliiBuilder implements IDetaliiBuilder{

	private int anFabricatie;
	private int pret;
	private double capacitate;
	private int rulaj;
	private String combustibil;
	
	public DetaliiBuilder()
	{
		anFabricatie=1995;
		pret=1500;
		capacitate=2.2;
		rulaj=131400;
		combustibil="benzina";
	}

	

	public DetaliiBuilder setAnFabricatie(int anFabricatie) {
		this.anFabricatie = anFabricatie;
		return this;
	}



	public DetaliiBuilder setPret(int pret) {
		this.pret = pret;
		return this;
	}



	public DetaliiBuilder setCapacitate(double capacitate) {
		this.capacitate = capacitate;
		return this;
	}



	public DetaliiBuilder setRulaj(int rulaj) {
		this.rulaj = rulaj;
		return this;
	}



	public DetaliiBuilder setCombustibil(String combustibil) {
		this.combustibil = combustibil;
		return this;
	}



	@Override
	public Detalii build() {
		// TODO Auto-generated method stub
		return new Detalii(this.anFabricatie,this.pret,this.capacitate,this.rulaj,this.combustibil);
	}

}
