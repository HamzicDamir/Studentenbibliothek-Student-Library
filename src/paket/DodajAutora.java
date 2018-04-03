package paket;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class DodajAutora extends javax.swing.JFrame {
	public DodajAutora(int Sifra,String NaslovKnjige){
	 try{
     	slika1 = ImageIO.read(new File("images/library.png"));
			slika2 = ImageIO.read(new File("images/back.png"));
			slika3 = ImageIO.read(new File("images/snimi1.png"));
		}
		catch(IOException e){
				e.printStackTrace();
		}	
	 sifra=Sifra;
	 naslovKnjige=NaslovKnjige;
     initComponents();
     this.setIconImage(slika1);
    }
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JToggleButton();
        snimi = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        prezime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setLocation(new java.awt.Point(470, 250));
        setResizable(false);
        
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("Unos Autora");

        back.setIcon(new javax.swing.ImageIcon(slika2));
        back.setSelected(true);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        snimi.setIcon(new javax.swing.ImageIcon(slika3));
        snimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snimiActionPerformed(evt);
            }
        });

        jLabel9.setText("Back");

        jLabel8.setText("Snimi");

        jLabel2.setText("Ime");

        jLabel3.setText("Prezime");

        jLabel4.setText("Datum ro�enja");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(prezime, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                        .addComponent(ime, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel4)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(19, 19, 19)))
                    .addComponent(snimi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(snimi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }                        

    private void backActionPerformed(java.awt.event.ActionEvent evt) {       
    	UnosKnjige unosKnjige=new UnosKnjige(sifra,naslovKnjige);
    	unosKnjige.setVisible(true);
       dispose();
    }                                    

    private void snimiActionPerformed(java.awt.event.ActionEvent evt) {   
    	Autor autor=new Autor();
    	if(ime.getText().isEmpty() || prezime.getText().isEmpty()|| jDateChooser1.getDate()==null){
    		JOptionPane.showMessageDialog(this,"Niste unijeli sve podatke!");
    	}
    	else{
    		em.getTransaction().begin();
    		autor.setIme(ime.getText());
    		autor.setPreizme(prezime.getText());
    		java.sql.Date datum= new java.sql.Date(jDateChooser1.getDate().getTime());
    		autor.setDatRod(datum);
    		em.persist(autor);
    		em.getTransaction().commit();
    		UnosKnjige unosKnjige=new UnosKnjige(sifra,naslovKnjige);
    		unosKnjige.setVisible(true);
    		this.dispose();
    	}
    }                                     


    public void SetSifra(int Sifra)
    {
    	sifra=Sifra;
    }
    
    public int GetSifra()
    {
    	return sifra;
    }
    public void setNaslov(String Naslov)
    {
    	naslovKnjige=Naslov;
    }
    
    public String getNaslovKnjige()
    {
    	return naslovKnjige;
    }
    
    private String naslovKnjige;
    private int sifra;
    private javax.swing.JToggleButton back;
    private javax.swing.JTextField ime;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private java.awt.Image slika1,slika2,slika3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField prezime;
    private javax.swing.JToggleButton snimi;
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
   	private EntityManager em=emf.createEntityManager();
}
