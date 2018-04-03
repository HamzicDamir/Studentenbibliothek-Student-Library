package paket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

@Entity
public class Predmet {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "sifra")
	private int sifra;
	private String naziv;
	private String skracenica;
	private int brojSemestra;
	@ManyToMany(mappedBy="listaPredmeta")
	private Collection<Nastavnik> listaNastavnika;
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name="PredmetKnjiga",joinColumns=@JoinColumn(name="sifraPredmeta", 
	   referencedColumnName="sifra"), inverseJoinColumns=@JoinColumn(name="sifraKnjige",
	   referencedColumnName="sifra"))
	private Collection<Knjiga> listaKnjiga;
	
	public Predmet()
	{
		naziv=" ";
		skracenica=" ";
		brojSemestra=0;
		listaNastavnika = new ArrayList<Nastavnik>();
		listaKnjiga = new ArrayList<Knjiga>();
	}
	
	public Collection<Knjiga> getListaKnjiga()
	{
		return listaKnjiga;
	}
	
	public Collection<Nastavnik> getListaNastavnik()
	{
		return listaNastavnika;
	}
	
	public int getSifra()
	{
		return sifra;
	}
	
	public String getNaziv()
	{
		return naziv;
	}
	
	public String getSkracenica()
	{
		return skracenica;
	}
	
	public int getBrojSemestra()
	{
		return brojSemestra;
	}
	
	public void setSifra(int sifra1)
	{
		sifra = sifra1;
	}
	
	public void setNaziv(String naziv1)
	{
		naziv = naziv1;
	}
	
	public void setSkracenica(String skracenica1)
	{
		skracenica = skracenica1;
	}
	
	public void setBrojSemestra(int brojSemestra1)
	{
		brojSemestra = brojSemestra1;
	}
	
	public void setListaNastavnika(List<Nastavnik> ListaNastavnika)
	{
		listaNastavnika=ListaNastavnika;
	}
	
	public void setKnjiga(Knjiga k)
	{
		listaKnjiga.add(k);
	}
	
	public void setNastavnik(Nastavnik n)
	{
		listaNastavnika.add(n);
	}
}
