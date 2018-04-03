package paket;

import java.util.ArrayList;	
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.persistence.*;
@Entity
public class Knjiga {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "sifra")
		private int sifraKnjiga;
		private String naslov;
		private String originalniNaslovKnjige;
		private int brojStranica;
		private int godinaIzdanja;
		private String vrsta;
		@ManyToMany(cascade = CascadeType.PERSIST)
		@JoinTable(name="KnjigaAutori",joinColumns=@JoinColumn(name="sifraKnjige", 
				   referencedColumnName="sifra"), inverseJoinColumns=@JoinColumn(name="sifraAutora",
				   referencedColumnName="sifra"))
		private Collection<Autor>  listaAutora;
		@ManyToOne(cascade = CascadeType.PERSIST)
		@JoinTable(name="KnjigaIzdavac",joinColumns=@JoinColumn(name="sifraKnjige", 
		   referencedColumnName="sifra"), inverseJoinColumns=@JoinColumn(name="sifraIzdavaca",
		   referencedColumnName="sifra"))
		private Izdavac izdavac;
		@OneToMany(mappedBy="knjiga")
		private Collection<Primjerak> listaPrimjeraka;
		@ManyToMany(mappedBy="listaKnjiga")
		private Collection<Predmet> listaPredmeta;
		
		
		public Knjiga(){
			this.sifraKnjiga=0;
			this.naslov="";
			this.originalniNaslovKnjige="";
			this.brojStranica=0;
			this.godinaIzdanja=0;
			this.vrsta="";
			this.listaAutora = new ArrayList<Autor>();
			this.izdavac=null;
			this.listaPrimjeraka = new ArrayList<Primjerak>();
		
		}
		
		public Knjiga(int sifra,String naslovK, String origNaslovKnjige, int brojStranicaK, boolean dostupnostK, int godinaIzdanjaK,int negativniBodoviK, String vrstaK, ArrayList<Autor> listaAutoraK,Izdavac izdavacK )
		{
			sifraKnjiga=sifra;
			naslov=naslovK;
			originalniNaslovKnjige=origNaslovKnjige;
			brojStranica=brojStranicaK;
			godinaIzdanja= godinaIzdanjaK;
			vrsta=vrstaK;
			listaAutora = listaAutoraK;
			izdavac=izdavacK;

		}
		
		public void setPredmet(Predmet p)
		{
			listaPredmeta.add(p);
		}
		public int getSifra()
		{
			return sifraKnjiga;
		}
		
		public String getNaslov()
		{
			return naslov;
		}
		
		public int getBrojDostupnihKnjiga()
		{
			int b=0;
			List<Primjerak> lista=new ArrayList(listaPrimjeraka);
			for(int i=0;i<lista.size();++i)
				if(lista.get(i).getDostupnost()==true)
					++b;
			return b;
		}
		
		public String getOriginalniNaslov()
		{
			return originalniNaslovKnjige;
		}
		
		public int getbrojStranica()
		{
			return brojStranica;
		}
		
		public int getGodinaIzdanja()
		{
			return godinaIzdanja;
		}
		
		public String getVrsta()
		{
			return vrsta;
		}
		
		public int brojPrimjeraka(){
			return this.listaPrimjeraka.size();
		}
		
		public Collection<Autor> getListaAutora()
		{
			return listaAutora;
		}
		
		public Izdavac getIzdavac()
		{
			return izdavac;
		}
		
		public Primjerak getPrimjerak()
		{
			List<Primjerak> lista=new ArrayList(listaPrimjeraka);
			for(int i=0;i<lista.size();++i)
			{	
				if(lista.get(i).getDostupnost()==true)
					return lista.get(i);
			}
			System.out.println("NEmaaaaaaaaaaaa");
			return null;
		}
		
		public void setPrimjerak(Primjerak knjiga)
		{
			listaPrimjeraka.add(knjiga);
		}
		
		public void setSifra(int sifra){
			sifraKnjiga=sifra;
		}
		
		public void setNaslov(String naslovK)
		{
			naslov=naslovK;
		}
		
		public void setOriginalniNaslov(String naziv)
		{
			originalniNaslovKnjige=naziv;
		}
		
		public void setbrojStranica(int brojStranica)
		{
			this.brojStranica=brojStranica;
		}
		
		public void setGodinaIzdanja(int godina)
		{
			godinaIzdanja=godina;
		}
		
		public void setVrsta(String vrsta)
		{
			this.vrsta = vrsta;
		}
		
		public void setAutor(Autor a)
		{
			this.listaAutora.add(a);
		}
		
		
		public void setIzdavac(Izdavac izdavacK)
		{
			izdavac=izdavacK;
		}
}
