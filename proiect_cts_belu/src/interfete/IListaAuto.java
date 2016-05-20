package interfete;

public interface IListaAuto {
		public void adaugaAuto(IListaAuto a); 
	   public void stergeAuto(IListaAuto a);
	   public IListaAuto getChild(int i);
	   public void descriere();
	   
	    public void adauga(Observer o);
	    public void sterge(Observer o);
	    public void notifica(String mesaj);
}
