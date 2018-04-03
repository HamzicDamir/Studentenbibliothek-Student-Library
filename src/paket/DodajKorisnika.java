package paket;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class DodajKorisnika extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	public DodajKorisnika() {
        try{
        	slika1 = ImageIO.read(new File("images/library.png"));
			slika2 = ImageIO.read(new File("images/back.png"));
			slika3 = ImageIO.read(new File("images/snimi1.png"));
			slika4 = ImageIO.read(new File("images/lijevo1.png"));
			slika5 = ImageIO.read(new File("images/desno1.png"));
			slika6 = ImageIO.read(new File("images/add1.png"));
        }
		
		catch(IOException e){
				e.printStackTrace();
		}	
        initComponents();
        this.setIconImage(slika1);
    }
                       
    private void initComponents() {

        back = new javax.swing.JButton();
        snimi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        prezime = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sifra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Uloga = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jmbg = new javax.swing.JTextField();
        LindexZvanje = new javax.swing.JLabel();
        indexZvanje = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        semestar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        lijevo = new javax.swing.JButton();
        desno = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dodaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Profil");
        setLocation(new java.awt.Point(400, 200));
        setResizable(false);

        back.setIcon(new javax.swing.ImageIcon(slika2));
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

        dodaj.setIcon(new javax.swing.ImageIcon(slika6)); 
        dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajActionPerformed(evt);
            }
        });
        
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Profil");

        jLabel2.setText("Ime");

        jLabel3.setText("Prezime");

        jLabel4.setText("Password");

        jLabel5.setText("Uloga");

        Uloga.setEditable(false);
        Uloga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nastavnik", "student" }));
        Uloga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UlogaActionPerformed(evt);
            }
        });

        jLabel7.setText("Back");

        jLabel8.setText("Snimi");

        jLabel9.setText("Datum ro�enja");

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        jLabel10.setText("JMBG");

        LindexZvanje.setText("jLabel11");

        jLabel12.setText("Semestar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestar)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(semestar)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jList2);

        lijevo.setIcon(new javax.swing.ImageIcon(slika5));
        lijevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lijevoActionPerformed(evt);
            }
        });

        desno.setIcon(new javax.swing.ImageIcon(slika4));
        desno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desnoActionPerformed(evt);
            }
        });

        jLabel6.setText("Lista predmeta");

        dodaj.setIcon(new javax.swing.ImageIcon(slika6)); 

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel6))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lijevo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(dodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(desno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lijevo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

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
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(sifra, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ime, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(prezime, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(indexZvanje)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(10, 10, 10)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LindexZvanje)
                        .addGap(68, 68, 68)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jmbg)
                            .addComponent(Uloga, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(snimi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel8))
                                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(prezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jmbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(26, 26, 26)))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sifra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Uloga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(snimi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LindexZvanje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(indexZvanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        
        
        if(Uloga.getSelectedItem().equals("nastavnik"))
        {
        	jPanel1.setVisible(false);
        	LindexZvanje.setText("Akademsko zvanje");
        }
        else
        {
        	jPanel2.setVisible(false);
        	LindexZvanje.setText("Broj index-a");
        }
        
        
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
		EntityManager em=emf.createEntityManager();
		List<Predmet> listaPredmeta =em.createQuery("select e from Predmet e").getResultList();
		 listModel2 = new DefaultListModel();
		System.out.println(listaPredmeta.size());
		 for(int i=0;i<listaPredmeta.size();++i)
		{
			listModel2.addElement(listaPredmeta.get(i).getNaziv());			
		}
		jList1.setModel(listModel1);
		jList2.setModel(listModel2);
        pack();
    }

    private void snimiActionPerformed(java.awt.event.ActionEvent evt) {   
    	emf=Persistence.createEntityManagerFactory("StudentskaBiblioteka");
    	EntityManager em=emf.createEntityManager();
    	Student student = new Student();
    	Nastavnik nastavnik = new Nastavnik();
    	if(ime.getText().equals("") || prezime.getText().equals("") || sifra.getText().equals("") ||
    		jDateChooser1.getDate()==null || jmbg.getText().equals(""))
    	{
    		 JOptionPane.showMessageDialog(this,"Niste unijeli sve potrebne podatke!!!");
    		return;
    	}
    	String uloga = "",uloga1 = "";
    	try{
    	if(Uloga.getSelectedItem().toString().equals("nastavnik"))
    		uloga = (String) em.createQuery("select e.uloga from Nastavnik e where e.ime='"+ime.getText()+"'").getSingleResult();
    	else if(Uloga.getSelectedItem().toString().equals("student"))
    		uloga1 =(String) em.createQuery("select e.uloga from Student e where e.brojIndexa='"+indexZvanje+"'").getSingleResult();
    	}
    	catch(Exception e)
    	{}
    	if( !uloga.equals("") || !uloga1.equals(""))
		{
			JOptionPane.showMessageDialog(this,"Postoji vec takav korisnik u bazi!!!");
    		return;
		}
		if(Uloga.getSelectedItem().toString().equals("student"))
    	{
   
			student.setIme(ime.getText());
	    	student.setPrezime(prezime.getText());
	    	student.setPass(sifra.getText());
	    	student.setUloga(Uloga.getSelectedItem().toString());
	    	java.sql.Date datum= new java.sql.Date(jDateChooser1.getDate().getTime());
	    	student.setDatumRodjenja(datum);
	    	student.setJmbg(jmbg.getText());
	    	student.setBrojIndexa(indexZvanje.getText());
	    	student.setSemestar(Integer.parseInt(semestar.getText()));
	    	
	    	em.getTransaction().begin();
	    	em.persist(student);
	    	em.getTransaction().commit();
    	}
		
		if(Uloga.getSelectedItem().toString().equals("nastavnik"))
    	{
			
			nastavnik.setIme(ime.getText());
	    	nastavnik.setPrezime(prezime.getText());
	    	nastavnik.setPass(sifra.getText());
	    	nastavnik.setUloga(Uloga.getSelectedItem().toString());
	    	java.sql.Date datum= new java.sql.Date(jDateChooser1.getDate().getTime());
	    	nastavnik.setDatumRodjenja(datum);
	    	nastavnik.setJmbg(jmbg.getText());
    		nastavnik.setAkademskoZvanje(indexZvanje.getText());
    		
    		em.getTransaction().begin();
        	em.persist(nastavnik);
        	em.getTransaction().commit();
    		
    		
    	}
    	
    	
    	dispose();
        panelBiblioteke= new PanelBiblioteke();
        panelBiblioteke.setVisible(true);
    	
    }                                     

    private void backActionPerformed(java.awt.event.ActionEvent evt) {       
        dispose();
        panelBiblioteke= new PanelBiblioteke();
        panelBiblioteke.setVisible(true);
    }                                    

    private void desnoActionPerformed(java.awt.event.ActionEvent evt) {                                        
   	 int a=jList2.getSelectedIndex();
        if(a==-1)
        	return;
        String nastavnik=jList2.getSelectedValue();
        listModel1.addElement(nastavnik);
        listModel2.removeElementAt(a);   
   }                               

   private void lijevoActionPerformed(java.awt.event.ActionEvent evt) {                                       
   	int a=jList1.getSelectedIndex();
       if(a==-1)
       	return;
       String nastavnik=jList1.getSelectedValue();
       listModel2.addElement(nastavnik);
       listModel1.removeElementAt(a);
   }                                        

    private void dodajActionPerformed(java.awt.event.ActionEvent evt) {                                      
        UnosPredmeta unosPredmeta=new UnosPredmeta();
        unosPredmeta.setVisible(true);
     } 
    private void UlogaActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
        String a=Uloga.getSelectedItem().toString();
        if(a.equals("nastavnik"))
        {
         jPanel1.setVisible(false);
         jPanel2.setVisible(true);
         LindexZvanje.setText("Akademsko zvanje");
        }
        else if(a.equals("student"))
        {
        	jPanel1.setVisible(true);
            jPanel2.setVisible(false);
            LindexZvanje.setText("Broj indexa");
        }
    }                                     

    private PanelBiblioteke panelBiblioteke;                  
    private javax.swing.JLabel LindexZvanje;
    private javax.swing.JComboBox<String> Uloga;
    private javax.swing.JButton back;
    private javax.swing.JButton desno;
    private javax.swing.JTextField ime;
    private javax.swing.JTextField indexZvanje;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jmbg;
    private javax.swing.JButton lijevo;
    private java.awt.Image slika1,slika2,slika3,slika4,slika5,slika6;
    private javax.swing.JTextField prezime;
    private javax.swing.JTextField semestar;
    private javax.swing.JTextField sifra;
    private javax.swing.JButton snimi;  
    private javax.swing.JButton dodaj;
    private DefaultListModel listModel1=new DefaultListModel();
    private DefaultListModel listModel2=new DefaultListModel();
	private static EntityManagerFactory emf;
	}
