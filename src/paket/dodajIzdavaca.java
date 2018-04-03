package paket;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class dodajIzdavaca extends javax.swing.JFrame {
	public dodajIzdavaca(int Sifra,String NaslovKnjige){
		 try{
	     	slika1 = ImageIO.read(new File("images/library.png"));
				slika2 = ImageIO.read(new File("images/back.png"));
				slika3 = ImageIO.read(new File("images/snimi1.png"));
			}
			catch(IOException e){
					e.printStackTrace();
			}	
	     initComponents();
	     sifra=Sifra;
	     naslovKnjige=NaslovKnjige;
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

        setLocation(new java.awt.Point(470, 250));
        setResizable(false);
        
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setText("Unos Izdava�a");

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

        jLabel9.setText("Nazad");

        jLabel8.setText("Snimi");

        jLabel2.setText("Naziv");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ime, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel9)
                                    .addGap(25, 25, 25))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(30, 30, 30)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(snimi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(snimi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel8)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>                        

    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
        UnosKnjige a=new UnosKnjige(sifra,naslovKnjige);
    	dispose();
    	a.setVisible(true);
    }                                    

    private void snimiActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Izdavac izdavac=new Izdavac();
        if(ime.getText().isEmpty()){
    		JOptionPane.showMessageDialog(this,"Niste unijeli sve podatke!");
    	}
        else{
        	izdavac.setNaziv(ime.getText());
        	em.getTransaction().begin();
        	em.persist(izdavac);
        	em.getTransaction().commit();
        	setVisible(false);
        	UnosKnjige a=new UnosKnjige(sifra,naslovKnjige);
        	a.setVisible(true);
        	dispose();
        }
    }
    
    public void setSifra(int Sifra)
    {
    	sifra=Sifra;
    }
    
    public int getSifra()
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.Image slika1,slika2,slika3;
    private javax.swing.JToggleButton snimi;
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
	private EntityManager em=emf.createEntityManager();
	
}

