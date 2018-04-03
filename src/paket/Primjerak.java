package paket;

import java.util.Calendar;
import java.sql.Date;
import javax.persistence.*;

@Entity
public class Primjerak{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "sifra")
	private int inventarniBroj;
	private Date datumPreuzimanja;
	private Date datumVracanja;
	private boolean dostupnost;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinTable(name="KnjigaPrimjerak",joinColumns=@JoinColumn(name="sifraKnjige", 
	   referencedColumnName="sifra"), inverseJoinColumns=@JoinColumn(name="sifraPrimjerak",
	   referencedColumnName="sifra"))
	private Knjiga knjiga;
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinTable(name="KorisnikPrimjerka",joinColumns=@JoinColumn(name="sifraKorisnika", 
	   referencedColumnName="sifra"), inverseJoinColumns=@JoinColumn(name="sifraPrimjerka",
	   referencedColumnName="sifra"))
	private KorisnickiProfil korisnik;

	public Primjerak()
	{
		dostupnost=true;
		datumPreuzimanja = null;
		datumVracanja=null;
	}
	
	public void setInventarniBroj(int br)
	{
		inventarniBroj = br;
	}
	
	public void setDostupnost(boolean a)
	{
		dostupnost = a;
	}
	
	public void setDatumPreuzimanja(Date a)
	{
		datumPreuzimanja = a;
	}
	
	public void setDatumVracanja(Date a)
	{
		datumVracanja = a;
	}
	
	public int getInventarniBroj()
	{
		return inventarniBroj;
	}
	
	public boolean getDostupnost()
	{
		return dostupnost;
	}
	public Date getDatumPreuzimanja()
	{
		return datumPreuzimanja;
	}
	
	public Date getDatumVracanja()
	{
		return datumVracanja;
	}
	
	public Knjiga getKnjiga()
	{
		return knjiga;
	}
	public void setKnjiga(Knjiga A)
	{
		knjiga=A;
	}
	public KorisnickiProfil getKorisnik()
	{
		return korisnik;
	}
	
	public void setKorisnik(KorisnickiProfil Korisnik)
	{
		korisnik=Korisnik;
	}
	
}
