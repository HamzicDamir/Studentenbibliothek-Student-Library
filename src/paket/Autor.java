package paket;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.*;
@Entity
public class Autor {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "sifra")
		private int sifra;
		private String ime;
		private String prezime;
		private Date datumRodjenja;
		@ManyToMany(mappedBy="listaAutora")
		private Collection<Knjiga> listaKnjiga;
		
		public Autor(){
			sifra=0;
			ime="";
			prezime="";
			datumRodjenja=null;
		}
		public Autor(int sifraA,String imeA,String prezimeA){
			sifra=sifraA;
			ime=imeA;
			prezime=prezimeA;
		}
		public Autor(int sifraA,String imeA,String prezimeA, Date datumA){
			sifra=sifraA;
			ime=imeA;
			prezime=prezimeA;
			datumRodjenja=datumA;
		}
		public int getSifra(){
			return sifra;
		}
		public String getIme(){
			return ime;
		}
		public String getPrezime()
		{
			return prezime;
		}
		public Date getDatRod(){
			return datumRodjenja;
		}
		public void setSifra(int sifraA){
			sifra=sifraA;
		}
		public void setIme(String imeA){
			ime=imeA;
		}
		public void setPreizme(String prezimeA){
			prezime=prezimeA;
		}
		public void setDatRod(Date datumA){
			datumRodjenja=datumA;
		}
}
