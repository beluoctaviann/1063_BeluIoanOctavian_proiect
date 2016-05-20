package clase;

import interfete.Observer;

public class Anunt extends Client implements Observer{
	public Anunt(String nume, String prenume, String masina,String mesaj,int nr_notificare) {
		super(nume, prenume,masina,mesaj,nr_notificare);
		
	}
	

	@Override
	public String clientul() {
		return "Clientul "+nume+" "+prenume;
	}

	@Override
	public String cumpara() {
		return " vrea sa cumpere "+masina;
	}
	
	public void incepe()
	{
		System.out.println("Actiunea a inceput:");
	}
	public void sfarsit_rau()
	{
		System.out.println("Clientul nu a cumparat masina vanzatorului.");
	}
	public void sfarsit_bun()
	{
		System.out.println("Clientul a cumparat masina vanzatorului.");
	}


	@Override
	public void update(String mesaj) {
		 System.out.println("Mesaj nou:"+mesaj);
		
	}
	

}
