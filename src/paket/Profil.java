package paket;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.DefaultListModel;

public class Profil extends javax.swing.JFrame {

	public Profil(int Sifra,String Uloga)  {
    	try{
			slika1 = ImageIO.read(new File("images/library.png"));
			slika2 = ImageIO.read(new File("images/back.png"));
			slika3 = ImageIO.read(new File("images/snimi1.png"));
	}
	catch(IOException e){
			e.printStackTrace();
	}	
    	sifraKorisnika=Sifra;
    	uloga=Uloga;
    
    initComponents();
    setIconImage(slika1);
    setTitle("Profil");
    }
    private void initComponents() {

        snimi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        ime = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jmbg = new javax.swing.JTextField();
        prezime = new javax.swing.JTextField();
        LindexZvanje = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        indexZvanje = new javax.swing.JTextField();
        sifra = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        semestar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Uloga = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        JLabel = new javax.swing.JLabel();
        negativniBodovi = new javax.swing.JLabel();

        setTitle("Profil");
        setLocation(new java.awt.Point(400, 200));
        setResizable(false);
        
        snimi.setIcon(new javax.swing.ImageIcon(slika3));
        snimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snimiActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jLabel6.setText("Lista predmeta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel8.setText("Snimi");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Profil");

        jLabel9.setText("Datum ro�enja");

        jLabel2.setText("Ime");

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        jLabel10.setText("JMBG");

        jLabel3.setText("Prezime");

        LindexZvanje.setText("jLabel11");

        jLabel4.setText("Password");

        jLabel12.setText("Semestar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(semestar)
            .addComponent(jLabel12)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(semestar)
                .addContainerGap())
        );

        jLabel5.setText("Uloga");

        Uloga.setEditable(false);
        Uloga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nastavnik", "student" }));
        Uloga.setEnabled(false);

        jLabel7.setText("Back");

        back.setIcon(new javax.swing.ImageIcon(slika2));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        JLabel.setText("Negativni bodovi:");

        negativniBodovi.setForeground(new java.awt.Color(255, 0, 0));
        negativniBodovi.setText("l");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(LindexZvanje))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 46, Short.MAX_VALUE))
                            .addComponent(sifra, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ime, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(indexZvanje)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(prezime, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Uloga, 0, 140, Short.MAX_VALUE)
                            .addComponent(jmbg)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(negativniBodovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel)
                            .addComponent(negativniBodovi))
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

        if(uloga.equals("nastavnik"))
        {

            try{
            	korisnik1 =(Nastavnik) em.createQuery("select e from Nastavnik e where e.sifra='"+sifraKorisnika+"'").getSingleResult();
            }
            catch(Exception e){}
            ime.setText(korisnik1.getIme());
            ime.setEditable(false);
            prezime.setText(korisnik1.getPrezime());
            prezime.setEditable(false);
            sifra.setText(korisnik1.getPass());
            Uloga.setSelectedItem(korisnik1.getUloga());
            Uloga.setEditable(false);
            negativniBodovi.setText(String.valueOf(korisnik1.getNegativniBodovi()));
            jDateChooser1.setDate(korisnik1.getDatumRodjenja());
            jmbg.setText(String.valueOf(korisnik1.getJmbg()));
            indexZvanje.setEditable(false);
            
            listModel = new DefaultListModel();
            List<Predmet> lista=new ArrayList(korisnik1.getListaPredmeta());
            for(int i=0;i<lista.size();++i)
            {
            	listModel.addElement(lista.get(i).getNaziv());
            }
            jList1.setModel(listModel);
            LindexZvanje.setText("Akademsko zvanje");indexZvanje.setText(korisnik1.getAkademskoZvanje());
        	em.close();
        	
        	jPanel1.setVisible(false);
            }
        else if(uloga.equals("student"))
        {

            try{
            	korisnik =(Student) em.createQuery("select e from Student e where e.sifra='"+sifraKorisnika+"'").getSingleResult();
            	
            }
            catch(Exception e){}
            ime.setText(korisnik.getIme());
            prezime.setText(korisnik.getPrezime());
            sifra.setText(korisnik.getPass());
            Uloga.setSelectedItem(korisnik.getUloga());
            Uloga.setEnabled(false);
            uloga=korisnik.getUloga();
            negativniBodovi.setText(String.valueOf(korisnik.getNegativniBodovi()));
            jDateChooser1.setDate(korisnik.getDatumRodjenja());
            jmbg.setText(String.valueOf(korisnik.getJmbg()));
            this.indexZvanje.setEditable(false);
            LindexZvanje.setText("Broj index-a");
            indexZvanje.setText(korisnik.getBrojIndexa());
            semestar.setText(String.valueOf(korisnik.getSemestar()));
        	jPanel2.setVisible(false);
        	em.close();
        }
        pack();
    }                        

    private void snimiActionPerformed(java.awt.event.ActionEvent evt) {                                      
    	password=sifra.getText();
    	java.sql.Date datum= new java.sql.Date(jDateChooser1.getDate().getTime());
    	updateKorisnik(ime.getText(),prezime.getText(),sifra.getText(),datum,jmbg.getText(),Uloga.getSelectedItem().toString());
    	opcija();
    }                                     

   
    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
    	 opcija();
    }            
    public void updateKorisnik(String ime, String prezime, String pass,java.sql.Date date,String jmbg,String uloga){
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("StudentskaBiblioteka");
		EntityManager em=emf.createEntityManager();
		String query="";
		if(uloga.equals("nastavnik"))
			query="Update Nastavnik e set e.ime='"+ime+"', e.prezime='"+prezime+"', e.pass='"+pass+"',e.uloga='"+uloga+"', e.datumRodjenja='"+date+"', e.jmbg ='"+jmbg+"' where e.sifra='"+sifraKorisnika+"'";
		else if(uloga.equals("student"))
			query="Update Student e set e.ime='"+ime+"', e.prezime='"+prezime+"', e.pass='"+pass+"',e.uloga='"+uloga+"', e.datumRodjenja='"+date+"', e.jmbg ='"+jmbg+"' where e.sifra='"+sifraKorisnika+"'";
		em.getTransaction().begin();
		em.createQuery(query).executeUpdate();
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
    
    private void opcija()
    {
    	if(uloga.equals("student"))
    	{
    		panelStudenta=new PanelStudenta(this.getSifra());
    		panelStudenta.setVisible(true);
    	}
    	else if(uloga.equals("nastavnik"))
    	{
    		panelNastavnika=new PanelNastavnika(this.getSifra());
    		panelNastavnika.setVisible(true);
    	}
		dispose();
    }

   
    public void setUloga(String Uloga)
    {
    	uloga=Uloga;
    }
    
    public String getUloga()
    {
    	return uloga;
    }
    
    public void setSifra(int Sifra)
    {
    	sifraKorisnika=Sifra;
    }
    public void setPassword(String Password)
    {
        password=Password;
    }
    public int getSifra()
    {
        return sifraKorisnika;
    }
    public String getPassword()
    {
        return password;
    }
    private int sifraKorisnika;
    private String password;
    private String uloga;
    private javax.swing.JLabel JLabel;
    private javax.swing.JLabel LindexZvanje;
    private javax.swing.JComboBox<String> Uloga;
    private javax.swing.JButton back;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jmbg;
    private javax.swing.JLabel negativniBodovi;
    private javax.swing.JTextField prezime;
    private javax.swing.JTextField semestar;
    private javax.swing.JTextField sifra;
    private javax.swing.JButton snimi;
    private PanelNastavnika panelNastavnika;
    private PanelStudenta panelStudenta;  
    private java.awt.Image slika1,slika2,slika3,slika4,slika5;
    private Student korisnik;
	private Nastavnik korisnik1;
	private DefaultListModel listModel;
	private EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
	private EntityManager em=emf.createEntityManager();
}
