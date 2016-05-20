package designPattern;

import interfete.TipCaroserie;

public class Caroserie {
	private TipCaroserie tip;

	public Caroserie(TipCaroserie tip) {
		super();
		this.tip = tip;
	}

	public void setTip(TipCaroserie tip) {
		this.tip = tip;
	}
	
	public void Cars()
	{
		tip.execute();
	}

}
