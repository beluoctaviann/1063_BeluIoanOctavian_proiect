package clase;

import java.util.ArrayList;
import java.util.List;

import interfete.IListaAuto;
import interfete.Observer;

public class ListaAutoturisme implements IListaAuto{
	
	List<IListaAuto> lista=new ArrayList<IListaAuto>();

	@Override
	public void adaugaAuto(IListaAuto a) {
		lista.add(a);
		
	}

	@Override
	public void stergeAuto(IListaAuto a) {
		lista.remove(a);
		
	}

	@Override
	public IListaAuto getChild(int i) {
		return lista.get(i); 
	}

	@Override
	public void descriere() {
		System.out.println("ListaAuto contine:");
        for(IListaAuto a:lista)
        {
            a.descriere();
        }
		
	}

	@Override
	public void adauga(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sterge(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifica(String mesaj) {
		// TODO Auto-generated method stub
		
	}

}
