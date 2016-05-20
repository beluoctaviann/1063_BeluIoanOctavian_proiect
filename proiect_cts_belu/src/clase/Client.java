package clase;

import interfete.Observer;

public abstract class Client {
	protected String nume;
	protected String prenume;
	protected String masina;
	protected String mesaj;
	protected int nr_notificare;
	
	public Client(String nume, String prenume, String masina, String mesaj,int nr_notificare) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.masina=masina;
		this.mesaj=mesaj;
		this.nr_notificare=nr_notificare;
	}
	public Client()
	{
		nume="Bogdan";
		prenume="Marian";
		masina="Mercedes";
		mesaj="Ai o notificare";
		nr_notificare=1;
	}
	public void notifica()
	{
		for (int i=0;i<nr_notificare;i++)
		{System.out.println(mesaj);
		try {
			Thread.sleep(nr_notificare);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getMasina() {
		return masina;
	}

	public void setMasina(String masina) {
		this.masina = masina;
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}


	public int getNr_notificare() {
		return nr_notificare;
	}

	public void setNr_notificare(int nr_notificare) {
		this.nr_notificare = nr_notificare;
	}


	public abstract String clientul();
	public abstract String cumpara();
	
	
	
	
	
	

}

