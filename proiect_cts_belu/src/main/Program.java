package main;

import interfete.IAuto;


import clase.Anunt;
import clase.Autoturism;
import clase.Detalii;
import clase.ListaAutoturisme;
import designPattern.AnuntAdaptat;
import designPattern.Berlina;
import designPattern.Caroserie;
import designPattern.Clase;
import designPattern.ClaseFactory;
import designPattern.Coupe;
import designPattern.DetaliiBuilder;
import designPattern.ParcAutoFacade;

public class Program {

	public static void main(String[] args) {
		

		
		//SingleTon
		Autoturism a1=Autoturism.getInstance("Land Rover", "Range Rover");
		a1.Detine();
		System.err.println(a1.toString());
		
		//SimpleFactory
		ClaseFactory clase=new ClaseFactory();
		IAuto auto1=clase.createObject(Clase.Detalii);
		auto1.Detine();
		System.out.println("----------------------------------------");
		
		//Adapter
		Anunt anunt=new Anunt("Mavru","Ionut","Renault", "Salut!",  1);
		AnuntAdaptat anuntAdaptat=new AnuntAdaptat(anunt);
		anuntAdaptat.play();
		System.out.println(anunt.clientul()+anunt.cumpara());
		
		//Builder
		Detalii det=new DetaliiBuilder().setAnFabricatie(2002).setCapacitate(1.2).setRulaj(331300).build();
		System.out.println(det.toString());
		anuntAdaptat.stop_negativ();

		System.out.println("----------------------------------------");
		
		//Facade
		ParcAutoFacade.adaugaInParc("Dacia", "Logan", 2005, 2500, 1.4, 78000, "benzina","Popescu","Ion","Dacia");
		ParcAutoFacade.adaugaInParc("Fiat", "Punto", 2012, 4100, 1.3, 18000, "motorina","Popescu","Ion","Fiat");
		ParcAutoFacade.adaugaInParc("Renault", "Twingo", 1999, 1000, 1.2, 225000, "benzina","Popescu","Ion","Renault");
		System.out.println("----------------------------------------");
		
		//Composite
		ListaAutoturisme l1=new ListaAutoturisme();
		ListaAutoturisme l2=new ListaAutoturisme();
		Autoturism a2=new Autoturism("Mercedes","C200");
		Autoturism a3=new Autoturism("Audi","A6");
		Autoturism a4=new Autoturism("Peugeot","508");
		l1.adaugaAuto(a2);
		l1.adaugaAuto(a3);
		l1.adaugaAuto(a4);
		l1.descriere();
		System.out.println("----------------------------------------");
		
		//Observer
		Autoturism a5=new Autoturism("Citroen","C5");
		Anunt an1=new Anunt("Pavel","Gigi","Renault", "Salut!",  1);;
		a5.adauga(an1);
		System.out.println(a5.Vinde());
		System.out.println("----------------------------------------");
		
		//Strategy
		System.err.println(a1.toString());
		Caroserie caroserie=new Caroserie(new Coupe());
		caroserie.Cars();
		System.err.println(a2.toString());
		caroserie.setTip(new Berlina());
		caroserie.Cars();
		System.out.println("----------------------------------------");
		
	}

}
