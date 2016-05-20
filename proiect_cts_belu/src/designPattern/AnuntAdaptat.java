package designPattern;

import clase.Anunt;
import interfete.IAuto;

public class AnuntAdaptat implements IAuto{

	Anunt anunt;
	public AnuntAdaptat(Anunt an)
	{
		anunt=an;
	}
	@Override
	public void Detine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String Vinde() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMarca() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String clientul() {
		// TODO Auto-generated method stub
		return anunt.clientul();
	}

	@Override
	public String cumpara() {
		return anunt.cumpara();
	}

	@Override
	public void play() {
		anunt.incepe();
		
	}

	@Override
	public void stop_negativ() {
		anunt.sfarsit_rau();
		
	}
	@Override
	public void stop_pozitiv() {
		anunt.sfarsit_bun();
		
	}

}
