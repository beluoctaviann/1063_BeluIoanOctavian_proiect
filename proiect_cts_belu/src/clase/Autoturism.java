package clase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import interfete.IAuto;
import interfete.IListaAuto;
import interfete.Observer;

public class Autoturism implements IAuto,IListaAuto,Serializable {
	
	private String marca;
	private String model;
	private static Autoturism instance=null;
	
	public static Autoturism getInstance(String marca,String model)
	    {
	        if(instance==null)
	            instance=new Autoturism(marca,model);
	        return instance;
	    }
	
	
	public Autoturism(String marca, String model) {
		super();
		this.marca = marca;
		this.model = model;
	}
	
	public Autoturism()
	{
		this.marca="Audi";
		this.model="a4";
	}
	
	public void Detine()
	{
		System.out.println("Vanzatorul are autoturismul "+marca+",model "+model);
	}
	public String Vinde()
	{
		String text="Autoturismul "+marca+" a fost vandut.\n";
		return text;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Autoturism [marca=" + marca + ", model=" + model + "]";
	}
	
	
	public static List<Detalii> det=new LinkedList<Detalii>();

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

	//COMPOSITE
	@Override
	public void adaugaAuto(IListaAuto a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stergeAuto(IListaAuto a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IListaAuto getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void descriere() {
		System.out.println(marca+" "+model);
		
	}

	
	
	//OBSERVER
	
	private List<Observer>lista=new ArrayList<Observer>();
	@Override
	public void adauga(Observer o) {
		lista.add(o);
		
	}
	@Override
	public void sterge(Observer o) {
		lista.remove(o);
		
	}


	@Override
	public void notifica(String mesaj) {
		  for(Observer o:lista)
	        {
	            o.update(mesaj);
	        }
		
	}

	
	

	

}
