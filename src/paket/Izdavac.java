package paket;

import java.util.Collection;

import javax.persistence.*;

@Entity
public class Izdavac {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "sifra")
	private int sifra;
	private String naziv;
	@OneToMany(mappedBy="izdavac")
	private Collection<Knjiga> listaKnjiga;
	
	public Izdavac()
	{
		sifra=0;
		naziv="";
	}
	
	public Izdavac(int sifra,String naziv)
	{
		this.sifra=sifra;
		this.naziv=naziv;
	}
	
	public int getSifra()
	{
		return sifra;
	}
	
	public String getNaziv()
	{
		return naziv;
	}
	
	public void setSifra(int sifra)
	{
		this.sifra=sifra;
	}
	
	public void setNaziv(String naziv)
	{
		this.naziv=naziv;
	}

}
