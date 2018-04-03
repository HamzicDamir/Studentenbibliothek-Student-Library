package paket;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import javax.persistence.*;

public class Main{    
	private static EntityManagerFactory emf;
	public static void main(String[] args)
	{/*
		PanelStudent a=new PanelStudent();
		a.setVisible();
		
	}
	
	*/
		emf=Persistence.createEntityManagerFactory("StudentskaBiblioteka");
		EntityManager em=emf.createEntityManager();
		/*
		List<KorisnickiProfil> lista=em.createQuery("Select e from KorisnickiProfil e where e.ime='a'").getResultList();
		if(lista.isEmpty())
		{
			System.out.println("nemmmmmaaaaaaaaaaa");
			return;
		}
		System.out.println(lista.size()+" podddddddi");
		for(int i=0;i<lista.size();++i)
		{
			System.out.println(lista.get(i).getIme()+" "+lista.get(i).getPrezime()+" "+lista.get(i).getSifra());
			}
		//Login login=new Login();
		//PanelKnjiga panel = new PanelKnjiga();
		/*em.getTransaction().begin();

		KorisnickiProfil k1=new KorisnickiProfil();
		KorisnickiProfil k2=new KorisnickiProfil();
		KorisnickiProfil k3=new KorisnickiProfil();
		k1.setIme("Azra");
		k1.setPrezime("Hasanovic");
		k1.setPass("admin");
		k1.setUloga("student");
		
		k2.setIme("Damir");
		k2.setPrezime("Hamzic");
		k2.setPass("admin");
		k2.setUloga("nastavnik");
		
		k3.setIme("Mladen");
		k3.setPrezime("Zeljic");
		k3.setPass("admin");
		k3.setUloga("student");
		
		em.persist(k1);
		em.persist(k2);
		em.persist(k3);
		em.getTransaction().commit();*/
		
		//Profil a=new Profil("Damir","admin","student");
		//a.setVisible(true);

		em.getTransaction().begin();
		em.createQuery("delete from Izdavac e").executeUpdate();
		em.createQuery("delete from Autor e").executeUpdate();
		em.createQuery("delete from Knjiga e").executeUpdate();
		em.createQuery("delete from Predmet e").executeUpdate();
		em.createQuery("delete from KorisnickiProfil e").executeUpdate();
		em.createQuery("delete from Rezervacija e").executeUpdate();
		em.createQuery("delete from Primjerak e").executeUpdate();	
		em.getTransaction().commit();

em.close();
emf.close();
	}
	
}
