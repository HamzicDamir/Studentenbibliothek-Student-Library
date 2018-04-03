package paket;

import java.util.Calendar;	
import java.sql.Date;
import java.util.List;
import javax.persistence.*;

@Entity
public class Rezervacija  {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "sifra")
	private int sifra;
	@OneToOne
	private Primjerak Knjiga;
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinTable(name="KorisnikRezervacija",joinColumns=@JoinColumn(name="sifraKorisnik", 
	   referencedColumnName="sifra"), inverseJoinColumns=@JoinColumn(name="sifraRezervacije",
	   referencedColumnName="sifra"))
	private KorisnickiProfil korisnik;
	private Date datumRezervacija;	
	
	public Rezervacija()
	{}
	public Rezervacija(KorisnickiProfil kor,Primjerak prim){
		korisnik=kor;
		kor.setListaRezervacija(this);
		Knjiga=prim;
		prim.setDostupnost(false);
		java.util.Date datum = (Calendar.getInstance()).getTime();
		datumRezervacija=new Date(datum.getTime());
		
	}
	
	public void setPrimjerak(Primjerak primjerak)
	{
		Knjiga=primjerak;
	}
	
	public void setKorisnik(KorisnickiProfil kor)
	{
		korisnik = kor;
	}
	
	public Primjerak getPrimjerak()
	{
		return Knjiga;
	}
	
	public KorisnickiProfil getKorisnik()
	{
		return korisnik;
	}
	
	public Date getDatumRezervacije()
	{
		return datumRezervacija;
	}
	
	public int getSifra()
	{
		return sifra;
	}
}

