package paket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

@Entity
public class Nastavnik extends KorisnickiProfil{
	private String akademskoZvanje;
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name="NastavnikPredmet",joinColumns=@JoinColumn(name="sifraNastavnika", 
	   referencedColumnName="sifra"), inverseJoinColumns=@JoinColumn(name="sifraPredmeta",
	   referencedColumnName="sifra"))
	private Collection<Predmet> listaPredmeta;
	
	public Nastavnik()
	{
		akademskoZvanje = "";
	}

	public String getAkademskoZvanje()
	{
		return akademskoZvanje;
	}
	
	public Collection<Predmet> getListaPredmeta()
	{
		return listaPredmeta;
	}
	
	public void setAkademskoZvanje(String a)
	{
		akademskoZvanje = a;
	}
	
	public void setListaPredmeta(List<Predmet> a)
	{
		listaPredmeta = a;
	}
	
	public void dodajPredmet(Predmet novi)
	{
		this.listaPredmeta.add(novi);
	}

}
