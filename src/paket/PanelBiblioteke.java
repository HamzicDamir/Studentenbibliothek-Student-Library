package paket;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class PanelBiblioteke extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	
   
    public PanelBiblioteke() {
       try{
				slika = ImageIO.read(new File("images/library.png"));
				slika1 = ImageIO.read(new File("images/lista1.png"));
				slika2 = ImageIO.read(new File("images/korisnici.png"));
				slika3 = ImageIO.read(new File("images/uredi1.png"));
				slika4 = ImageIO.read(new File("images/dodaj.png"));
				slika5 = ImageIO.read(new File("images/dodaj_knjiga1.png"));
				slika6 = ImageIO.read(new File("images/listaKnjiga1.png"));
				slika7 = ImageIO.read(new File("images/logout-icon1.png"));				
		}
		catch(IOException e){
				e.printStackTrace();
		}
        initComponents();
        this.setIconImage(slika);
    }

                       
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        listaKnjiga = new javax.swing.JButton();
        listaKorisnika = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        profil = new javax.swing.JButton();
        dodajKorisnika = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dodajKnjigu = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        listaPKnjiga = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setResizable(false);

        jLabel1.setText("Lista Knjiga");

        listaKnjiga.setIcon(new javax.swing.ImageIcon(slika1));
        listaKnjiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaKnjigaActionPerformed(evt);
            }
        });

        listaKorisnika.setIcon(new javax.swing.ImageIcon(slika2));
        listaKorisnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaKorisnikaActionPerformed(evt);
            }
        });

        jLabel2.setText("Lista Korisnika");

        profil.setIcon(new javax.swing.ImageIcon(slika3)); 
        profil.setEnabled(false);
        
        
        dodajKorisnika.setIcon(new javax.swing.ImageIcon(slika4));
        dodajKorisnika.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dodajKorisnikaActionPerformed(evt);
			}
        });

        jLabel3.setText("Profil");

        jLabel4.setText("Dodaj Korisnika");

        dodajKnjigu.setIcon(new javax.swing.ImageIcon(slika5));
        dodajKnjigu.setEnabled(false);
        dodajKnjigu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajKnjiguActionPerformed(evt);
            }
        });

        jLabel5.setText("Dodaj Knjigu");

      listaPKnjiga.setIcon(new javax.swing.ImageIcon(slika6)); 
        listaPKnjiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaPKnjigaActionPerformed(evt);
            }
        });

        jLabel6.setText("Lista Podignutih Knjiga");
        
        jLabel7.setText("Logout");

       logout.setIcon(new javax.swing.ImageIcon(slika7)); 
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(listaKnjiga, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(listaKorisnika, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(profil))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addGap(72, 72, 72)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dodajKorisnika)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dodajKnjigu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(31, 31, 31)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(listaPKnjiga)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(299, 299, 299)
                                .addComponent(logout))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(339, 339, 339)
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaKorisnika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listaKnjiga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(206, 206, 206))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dodajKnjigu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(profil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dodajKorisnika, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listaPKnjiga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );

        pack();
    }                       

    private void listaKnjigaActionPerformed(java.awt.event.ActionEvent evt) {                                            
    		listaknjiga=new ListaKnjiga(0,"admin","");
    		listaknjiga.setVisible(true);
    		dispose();
    }                                           

    private void listaKorisnikaActionPerformed(java.awt.event.ActionEvent evt) {                                               
    	listakorisnika=new ListaKorisnika("");
    	listakorisnika.setVisible(true);
    	dispose();
    }                                              
    
    private void dodajKorisnikaActionPerformed(java.awt.event.ActionEvent evt) {
    	dodajkorisnika=new DodajKorisnika();
    	dodajkorisnika.setVisible(true);
    	dispose();
    } 
    
    private void dodajKnjiguActionPerformed(java.awt.event.ActionEvent evt) {                                            

    }                                           

    private void listaPKnjigaActionPerformed(java.awt.event.ActionEvent evt) {                                             
    		listaPknjiga=new ListaPodignutihAdmin();
    		listaPknjiga.setVisible(true);
    		dispose();
    }                                            

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	login1=new Login();
        login1.setVisible(true);    
    	dispose();
    }                                      
    
    
    private Login login1;
    private ListaKnjiga listaknjiga;
    private ListaKorisnika listakorisnika;
    private DodajKorisnika dodajkorisnika;
    private ListaPodignutihAdmin listaPknjiga;
    private javax.swing.JButton dodajKnjigu;
    private javax.swing.JButton dodajKorisnika;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton listaKnjiga;
    private javax.swing.JButton listaKorisnika;
    private javax.swing.JButton listaPKnjiga;
    private javax.swing.JButton logout;
    private javax.swing.JButton profil;
    private java.awt.Image slika,slika1, slika2, slika3, slika4, slika5, slika6, slika7;
}
