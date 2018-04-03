package paket;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;

import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class PodesavanjeRezervacije extends javax.swing.JFrame {
    public PodesavanjeRezervacije(Knjiga knjiga1,String Uloga,int Sifra) {
    	try{
			slika1 = ImageIO.read(new File("images/library.png"));
		}
    	   catch(IOException e){
   			e.printStackTrace();
   	}
    	knjiga=knjiga1;
        uloga=Uloga;
        sifra=Sifra;
     
        this.setIconImage(slika1);
    
    	initComponents();
        }
                       
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rezervisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setResizable(false);
        
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("Podesavanje rezervacije");

        jLabel2.setText("Krajnji datum preuzimanja");

        jLabel3.setText("Krajnji datum vracanja knjige");

        rezervisi.setText("Rezervisi");
        rezervisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	rezervisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(rezervisi)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(rezervisi)
                .addContainerGap())
        );

        pack();
    }
    private void rezervisiActionPerformed(java.awt.event.ActionEvent evt) {    
    	
    	if(jDateChooser1.getDate()==null || jDateChooser2.getDate()==null)
    	{
    		 JOptionPane.showMessageDialog(this,"Niste unijeli sve potrebne podatke!!!");
    		return;
    	}
    	java.util.Date datum1= new java.util.Date(jDateChooser1.getDate().getTime());
    	java.util.Date datum2= new java.util.Date(jDateChooser2.getDate().getTime());
    	java.util.Date trenutniDat =  Calendar.getInstance().getTime();
    	
    	long razlika1 = ((datum1.getTime())/(1000*60*60*24)) - ((trenutniDat.getTime()/(1000*60*60*24)) + 1);
    	long razlika2 = ((trenutniDat.getTime()/(1000*60*60*24))- ((datum2.getTime())/(1000*60*60*24)) +1);
    	if(true)
    	{
    		System.out.println(razlika1);
    		System.out.println(razlika2);
    		return;
    	}
    	if(datum1.getTime()<trenutniDat.getTime() || datum2.getTime()<trenutniDat.getTime() || datum2.getTime()<datum1.getTime() || razlika1>5)// || razlika2>365)
            {
    			JOptionPane.showMessageDialog(this,"Niste unijeli validan datum !!");
    			return;
            }
    	java.sql.Date datum3 = new java.sql.Date(jDateChooser1.getDate().getTime());
    	java.sql.Date datum4 = new java.sql.Date(jDateChooser2.getDate().getTime());
    	Primjerak primjerak = knjiga.getPrimjerak();
		primjerak.setDatumPreuzimanja(datum3);
		primjerak.setDatumVracanja(datum4);
    	em.getTransaction().begin();
		em.createQuery("update Primjerak e set e.dostupnost=0,e.datumPreuzimanja='"+datum3+"',e.datumVracanja='"+datum4+"' where e.inventarniBroj='"+primjerak.getInventarniBroj()+"'").executeUpdate();
		em.getTransaction().commit();
		
		
		KorisnickiProfil korisnik = new KorisnickiProfil();  
		if(uloga.equals("student"))	
			  korisnik =(Student) em.createQuery("select e from Student e where e.sifra='"+sifra+"'").getSingleResult();
		 else if(uloga.equals("nastavnik"))
			  korisnik =(Nastavnik) em.createQuery("select e from Nastavnik e where e.sifra='"+sifra+"'").getSingleResult();
        Rezervacija rez = new Rezervacija(korisnik, primjerak);
        em.getTransaction().begin();
    	em.persist(rez);
    	em.getTransaction().commit();
		em.close();	
		
		ListaKnjiga listaKnjiga=new ListaKnjiga(sifra,uloga,"");
		listaKnjiga.setVisible(true);
		dispose();
     }                                        

    private Knjiga knjiga;
    private int sifra;
    private String uloga;
    private Student korisnik;
    private Nastavnik korisnik1;
    private javax.swing.JButton rezervisi;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;             
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
   	private EntityManager em=emf.createEntityManager();
   	private java.awt.Image slika1;
}

