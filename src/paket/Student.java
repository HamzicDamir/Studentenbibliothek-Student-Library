package paket;

import javax.persistence.Entity;

@Entity
public class Student extends KorisnickiProfil{
	private String brojIndexa;
	private int semestar;
	
	public Student()
	{
		brojIndexa="";
		semestar=0;
	}
	
	public String getBrojIndexa()
	{
		return brojIndexa;
	}
	
	public int getSemestar()
	{
		return semestar;
	}
	
	public void setBrojIndexa(String BrojIndexa)
	{
		brojIndexa = BrojIndexa;
	}

	public void setSemestar(int Semestar)
	{
		semestar = Semestar;
	}
}