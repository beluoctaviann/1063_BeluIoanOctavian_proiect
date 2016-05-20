package designPattern;

import clase.Autoturism;
import clase.Detalii;
import interfete.IAuto;

public class ClaseFactory {
	public IAuto createObject(Clase cls)
	{
		switch(cls)
		{
		case Autoturism:return new Autoturism();
		case Detalii:return new Detalii();
		}
		return null;
	}
}
