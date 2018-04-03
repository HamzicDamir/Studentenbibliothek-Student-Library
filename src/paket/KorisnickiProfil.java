package paket;

import java.sql.Date;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.persistence.*;
//import javax.swing.JOptionPane;
@Entity
@Table(name = "KorisnickiProfil")
public class KorisnickiProfil {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "sifra")
	private int sifra;
	private String uloga;
	private String ime;
	private String prezime;
	private int negativniBodovi;
	private String pass;	
	private Date datumRodjenja;
	private String jmbg;
	private int brojKnjiga;
	@OneToMany(mappedBy="korisnik")
	private Collection<Rezervacija> listaRezervacija;
	@OneToMany(mappedBy="korisnik")
	private Collection<Primjerak> listaPodignutih;
	
	public KorisnickiProfil()
	{
		sifra=0;
		ime="";
		prezime="";
		negativniBodovi=0;
		jmbg=" ";
		brojKnjiga=0;
		uloga="";
		
	}
	
	public void setListaPodignutih(Collection<Primjerak> a)
	{
		this.listaPodignutih = a;
	}
	public String getUloga()
	{
		return uloga;
	}
	
	public int getSifra()
	{
		return sifra;
	}
	
	public String getIme()
	{
		return ime;
	}
	
	public String getPrezime()
	{
		return prezime;
	}
	
	public int getNegativniBodovi()
	{
		return negativniBodovi;
	}

	
	public Date getDatumRodjenja()
	{
		return datumRodjenja;
	}
	
	public String getJmbg()
	{
		return jmbg;
	}
	
	public int getBrojKnjiga()
	{
		return brojKnjiga;
	}
	
	public Collection<Rezervacija> getListaRezervacija()
	{
		return this.listaRezervacija;
	}
	
	public Collection<Primjerak> getListaPodignutih()
	{
		return listaPodignutih;
	}
	
	public void setListaRezervacija(Rezervacija a)
	{
		listaRezervacija.add(a);
	}
	public void setUloga(String Uloga)
	{
		uloga=Uloga;
	}
	public void setSifra(int sifra)
	{
		this.sifra = sifra;
	}

	public void setIme(String ime)
	{
		this.ime = ime;
	}
	
	public void setPrezime(String prezime)
	{
		this.prezime = prezime;
	}
	
	public void setNegativniBodovi(int negativniBodovi)
	{
		this.negativniBodovi=this.negativniBodovi+negativniBodovi;
	}
	
	public void setNB()
	{
		this.negativniBodovi=0;
	}
	
	public void setDatumRodjenja(Date datumRodjenja)
	{
		this.datumRodjenja = datumRodjenja;
	}
	
	public void setJmbg(String Jmbg)
	{
		jmbg = Jmbg;
	}
	
	public void setPodignutih(Primjerak a)
	{
		listaPodignutih.add(a);
	}
	
	public void setPodignuta(Primjerak a)
	{
		listaPodignutih.add(a);
	}

	/*public void deleteRez(int sifra)
	{
		listaRezervisanih
	}
	/*public void setListaKnjiga(Collection<Knjiga> listaKnjiga)
	{
		this.listaKnjiga = listaKnjiga;
	}*/
	public void setPass(String passw){
		this.pass=passw;
	}
	public String getPass(){
		return pass;
	}
	
	public void setBrojKnjiga(int brojKnjiga)
	{
		this.brojKnjiga = brojKnjiga;
	}
	
	/*public void Dodaj_Knjigu(Knjiga A)
	{
		if(this.brojKnjiga<3)
		{
			boolean a=true;
			Iterator<Knjiga> iterator= listaKnjiga.iterator();
			while(iterator.hasNext())
			{
				if(iterator.next().getSifra()==A.getSifra())
				{	
		//			JOptionPane.showMessageDialog(Okvir.frame, "Ne mozete izvrsiti ponovno rezervaciju iste knjige.");
					a=false;
				}
			}
			if(a==true)
			{
				this.listaKnjiga.add(A);
				
				++this.brojKnjiga;
			}
		}
		//else
		//	 JOptionPane.showMessageDialog(Okvir.frame, "Ne mozete rezervisati vise od 3 knjige!!!");
	}
	
	public void Izbrisi_Knjigu(Knjiga A)
	{
		Iterator<Knjiga> iterator = listaKnjiga.iterator();
		while(iterator.hasNext())
		{
			if(iterator.next().getSifra()==A.getSifra())
					iterator.remove();
		}
	}
*/
}
