package designPattern;

import clase.Anunt;
import clase.Autoturism;
import clase.Detalii;
import interfete.IAuto;

public class ParcAutoFacade {
	
	public static void adaugaInParc(String Marca,String Model,int AnFabricatie,int Pret,double Capacitate,int Rulaj,String Combustibil,String Nume,String Prenume,String AutoDorit)
	{
		Autoturism a2=new Autoturism(Marca, Model);
		a2.Detine();
		
		Detalii det=new Detalii(AnFabricatie,Pret,Capacitate,Rulaj,Combustibil);
		det.Detine();
		
		Anunt anunt=new Anunt(Nume,Prenume,AutoDorit, "Salut!",  1);
		AnuntAdaptat anuntAdaptat=new AnuntAdaptat(anunt);
		anuntAdaptat.play();
		System.out.println(anunt.clientul()+anunt.cumpara());
		anunt.sfarsit_bun();
		System.out.println(a2.Vinde());
	}

}
