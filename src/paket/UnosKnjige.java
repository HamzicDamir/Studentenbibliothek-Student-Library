package paket;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class UnosKnjige extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	public UnosKnjige(int Sifra,String NaslovKnjige) {
    	try{
			slika1 = ImageIO.read(new File("images/library.png"));
			slika2 = ImageIO.read(new File("images/back.png"));
			slika3 = ImageIO.read(new File("images/snimi1.png"));
			slika4 = ImageIO.read(new File("images/add1.png"));
	}
    catch(IOException e){
			e.printStackTrace();
	}
    	sifra=Sifra;
    	naslovKnjige=NaslovKnjige;
        initComponents();
        setTitle("Unos Knjige");
        setIconImage(slika1);
    }

    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        naslov = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        orgNaslov = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        brojStranica = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        vrstaKnjige = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        PrviAutor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        godinaIzdanja = new javax.swing.JTextField();
        back = new javax.swing.JToggleButton();
        snimi = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LprviAutor = new javax.swing.JLabel();
        LdrugiAutor = new javax.swing.JLabel();
        prviAutor = new AutoComplete();
        drugiAutor = new AutoComplete();
        dodajAutora1 = new javax.swing.JButton();
        dodajIzdavaca = new javax.swing.JButton();
        dodajAutora2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setResizable(false);
       
        jLabel1.setText("Naslov");

        jLabel2.setText("Originalni Naslov Knjige");

       
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("Knjiga");

        jLabel4.setText("Broj Stranica");

        jLabel5.setText("Izdavac");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        vrstaKnjige.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "�asopis", "Knjiga", "Diplomski rad", "Magistarski rad", "Doktorski rad" }));
        vrstaKnjige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vrstaKnjigeActionPerformed(evt);
            }
        });

        jLabel6.setText("Vrsta");

        jLabel7.setText("Godina izdanja");


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

        LprviAutor.setText("Prvi Autor");

        LdrugiAutor.setText("Drugi Autor");

        
        dodajAutora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajAutora1ActionPerformed(evt);
            }
        });

        dodajAutora1.setIcon(new javax.swing.ImageIcon(slika4)); 

        dodajIzdavaca.setIcon(new javax.swing.ImageIcon(slika4));

        dodajAutora2.setIcon(new javax.swing.ImageIcon(slika4));
        dodajAutora2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajAutora1ActionPerformed(evt);
            }
        });

        dodajIzdavaca.setIcon(new javax.swing.ImageIcon("C:\\Users\\Damir\\workspace\\StudentskaBiblioteka\\images\\add1.png")); // NOI18N
        dodajIzdavaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dodajIzdavacaActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PrviAutor)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(199, 257, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(29, 29, 29))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(orgNaslov))
                                .addComponent(jLabel1))
                            .addComponent(brojStranica, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(naslov, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prviAutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dodajAutora1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(drugiAutor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LdrugiAutor)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(vrstaKnjige, 0, 111, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addComponent(godinaIzdanja))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(snimi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(29, 29, 29))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dodajIzdavaca, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dodajAutora2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LprviAutor)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(naslov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dodajIzdavaca, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orgNaslov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vrstaKnjige, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(godinaIzdanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(brojStranica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(snimi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LdrugiAutor)
                        .addComponent(jLabel8))
                    .addComponent(LprviAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(drugiAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(prviAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dodajAutora2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dodajAutora1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(PrviAutor)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        naslov.setText(naslovKnjige);
        drugiAutor.setVisible(false);
        dodajAutora2.setVisible(false);
        LdrugiAutor.setVisible(false);
        LprviAutor.setText("Autor");
        jComboBox1.setModel(modelCombobox);
        obnoviIzdavaca();
        pack();
    }                        

    
    private void obnoviIzdavaca()
    {
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
    	EntityManager em=emf.createEntityManager();
    	List<Izdavac> listaIzdavaca=em.createQuery("Select e from Izdavac e").getResultList();
    	modelCombobox.removeAllElements();
    	for(int i=0;i<listaIzdavaca.size();i++){
    		modelCombobox.addElement(listaIzdavaca.get(i).getNaziv());	
    	}
    	System.out.println(modelCombobox.getSize());
        em.close();
        emf.close();
    }
    private void dodajIzdavacaActionPerformed(java.awt.event.ActionEvent evt) {                                              
        dodajIzdavaca DodajIzdavaca=new dodajIzdavaca(sifra,naslov.getText().toString());
        DodajIzdavaca.setVisible(true);
        dispose();
    }  

    private void vrstaKnjigeActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String vrsta=vrstaKnjige.getSelectedItem().toString();
    	if(vrsta.equals("Knjiga") || vrsta.equals("�asopis"))
        {
    		LdrugiAutor.setVisible(false);
        	drugiAutor.setVisible(false);
        	dodajAutora2.setVisible(false);
        	LprviAutor.setText("Autor");
        	
    
        }
        else{
        	LdrugiAutor.setVisible(true);
        	drugiAutor.setVisible(true);
        	dodajAutora2.setVisible(true);
        	LprviAutor.setText("Kandidat");
        	LdrugiAutor.setText("Mentor Rada");
        }
    }  
    
    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
        	panelNastavnika=new PanelNastavnika(sifra);
        	panelNastavnika.setVisible(true);
        	dispose();
    }                 
    
    private void dodajAutora1ActionPerformed(java.awt.event.ActionEvent evt) {
    			DodajAutora dodajAutora=new DodajAutora(sifra,naslovKnjige);
    			dodajAutora.setVisible(true);
    			dispose();
    }

    private void snimiActionPerformed(java.awt.event.ActionEvent evt) {
    	    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentskaBiblioteka");
    	    	EntityManager em=emf.createEntityManager();
    	    	Knjiga knjiga=new Knjiga();
    	    	if(naslov.getText().equals("") || orgNaslov.getText().equals("") || brojStranica.getText().equals("") ||
    	    		godinaIzdanja.equals("") || jComboBox1.getSelectedItem().toString().equals(" ") || prviAutor.getText().equals(" "))
    	    	{
    	    		 JOptionPane.showMessageDialog(this,"Niste unijeli sve potrebne podatke!!!");
    	    		return;
    	    	}
    	    	
    	    	Query query = em.createQuery("select e from Knjiga e where e.originalniNaslovKnjige='"+orgNaslov.getText()+"'");
    			List<Knjiga>knjList=query.getResultList();

    			if(knjList.size()>0)
    			{
    				JOptionPane.showMessageDialog(this,"Postoji vec takva knjiga u bazi!!!");
    	    		return;
    			}
    			
    			knjiga.setNaslov(naslov.getText());
    			knjiga.setOriginalniNaslov(orgNaslov.getText());
    			knjiga.setbrojStranica(Integer.valueOf(brojStranica.getText()));
    			knjiga.setGodinaIzdanja(Integer.valueOf(godinaIzdanja.getText()));
    			knjiga.setVrsta(vrstaKnjige.getSelectedItem().toString());
    			String Ime="";
    			String Prezime="";
    			if(prviAutor.getText().indexOf(" ")>=0)
    			{		
    				int b=prviAutor.getText().indexOf(" ");
    				for(int i=0;i<b;++i)	
    				{
    						Ime=Ime+prviAutor.getText().charAt(i);
    				}	
    				for(int i=b+1;i<prviAutor.getText().length();++i)	
    					Prezime=Prezime+prviAutor.getText().charAt(i);
    			}
    			
    			
    			List<Autor> listaAutora=em.createQuery("select e from Autor e where e.ime='"+Ime+"' and e.prezime='"+Prezime+"'").getResultList();
    			if(listaAutora.size()==0)
    			{
    				JOptionPane.showMessageDialog(this, "Niste selektovali ni jednog autora");
    				return;
    			}
    			Autor autor=listaAutora.get(0);
    			Izdavac izdavac =(Izdavac) em.createQuery("select e from Izdavac e where e.naziv='"+jComboBox1.getSelectedItem().toString()+"'").getSingleResult();
    			knjiga.setAutor(autor);
    			knjiga.setIzdavac(izdavac);
    			int b=10;
    			while(b>0){
    				Primjerak a=new Primjerak();
    				a.setKnjiga(knjiga);
    				knjiga.setPrimjerak(a);
        			em.getTransaction().begin();
        	    	em.persist(a);
        	    	em.getTransaction().commit();
        	    	--b;	
    			}
    			em.getTransaction().begin();
    	    	em.persist(knjiga);
    	    	em.getTransaction().commit();
    			dispose();
    	        panelNastavnika= new PanelNastavnika(sifra);
    	        panelNastavnika.setVisible(true);
    	    	
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
    private javax.swing.JLabel PrviAutor;
    private javax.swing.JLabel LprviAutor;
    private javax.swing.JLabel LdrugiAutor;
    private AutoComplete drugiAutor;
    private javax.swing.JTextField godinaIzdanja;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton dodajAutora1;
    private javax.swing.JButton dodajAutora2;
    private javax.swing.JButton dodajIzdavaca;
    private PanelNastavnika panelNastavnika;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> vrstaKnjige;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField brojStranica;
    private DefaultComboBoxModel<String> modelCombobox = new DefaultComboBoxModel<String>();
    private javax.swing.JToggleButton back;
    private javax.swing.JToggleButton snimi;
    private javax.swing.JTextField naslov;
    private javax.swing.JTextField orgNaslov;
    private AutoComplete prviAutor;
    private java.awt.Image slika1,slika2,slika3,slika4;
    private int sifra;
}