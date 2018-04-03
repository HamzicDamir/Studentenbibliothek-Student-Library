package paket;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class UnosPredmeta extends javax.swing.JFrame {

    public UnosPredmeta() {
    	try{
		slika1 = ImageIO.read(new File("images/library.png"));
		slika2 = ImageIO.read(new File("images/back.png"));
		slika3 = ImageIO.read(new File("images/snimi1.png"));
		slika4 = ImageIO.read(new File("images/lijevo1.png"));
		slika5 = ImageIO.read(new File("images/desno1.png"));
		}
catch(IOException e){
		e.printStackTrace();
}	initComponents();
	setIconImage(slika1);
	setTitle("Unos Predmeta");
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        lijevo = new javax.swing.JButton();
        desno = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        naziv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        skracenica = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        lijevo1 = new javax.swing.JButton();
        desno1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        snimi = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        brojSemestra = new javax.swing.JTextField();

        setTitle("Profil");
        setLocation(new java.awt.Point(400, 200));
        setResizable(false);
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Unos predmeta");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jList2);

        lijevo.setIcon(new javax.swing.ImageIcon(slika4));
        lijevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lijevoActionPerformed(evt);
            }
        });

        desno.setIcon(new javax.swing.ImageIcon(slika5));
        desno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desnoActionPerformed(evt);
            }
        });

        jLabel6.setText("Lista knjiga");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lijevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(desno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lijevo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        
        jLabel2.setText("Naziv");

        jLabel3.setText("Skracenica");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane3.setViewportView(jList3);

        jScrollPane4.setViewportView(jList4);

        lijevo1.setIcon(new javax.swing.ImageIcon(slika4)); // NOI18N
        lijevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lijevo1ActionPerformed(evt);
            }
        });

        desno1.setIcon(new javax.swing.ImageIcon(slika5)); // NOI18N
        desno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desno1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Lista nastavnika");
        
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desno1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lijevo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(80, 80, 80))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(desno1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lijevo1))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        snimi.setIcon(new javax.swing.ImageIcon(slika3)); // NOI18N
        snimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snimiActionPerformed(evt);
            }
        });

        jLabel9.setText("Snimi");

        back.setIcon(new javax.swing.ImageIcon(slika2));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel4.setText("Nazad");

        jLabel5.setText("Broj semestra");
        jLabel9.setText("Snimi");

        back.setIcon(new javax.swing.ImageIcon(slika3));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(skracenica, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(naziv))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(brojSemestra, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(snimi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(14, 14, 14)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(naziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(brojSemestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(skracenica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(7, 7, 7)
                        .addComponent(snimi, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        
        
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
		EntityManager em=emf.createEntityManager();
		List<Knjiga> listaknjiga =em.createQuery("select e from Knjiga e").getResultList();
		 listModel2 = new DefaultListModel();
		
		 for(int i=0;i<listaknjiga.size();++i)
		{
			listModel2.addElement(listaknjiga.get(i).getOriginalniNaslov());			
		}
		 
		 List<Nastavnik> listaNastavnika =em.createQuery("select e from Nastavnik e").getResultList();
		 listModel4 = new DefaultListModel();
		
		 for(int i=0;i<listaNastavnika.size();++i)
		{
			listModel4.addElement(listaNastavnika.get(i).getIme()+" "+listaNastavnika.get(i).getPrezime());			
		} 
		jList1.setModel(listModel1);
		jList2.setModel(listModel2);
		jList3.setModel(listModel3);
		jList4.setModel(listModel4);
		emf.close();
        pack();
    }

    private void lijevoActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	 int a=jList2.getSelectedIndex();
         if(a==-1)
         	return;
         String knjiga=jList2.getSelectedValue();
         listModel1.addElement(knjiga);
         listModel2.removeElementAt(a);         
}                                      

    private void desnoActionPerformed(java.awt.event.ActionEvent evt) {                                      
    	int a=jList1.getSelectedIndex();
        if(a==-1)
        	return;
        String knjiga=jList1.getSelectedValue();
        listModel2.addElement(knjiga);
        listModel1.removeElementAt(a); 
        }                                     

    private void lijevo1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	 int a=jList4.getSelectedIndex();
         if(a==-1)
         	return;
         String nastavnik=jList4.getSelectedValue();
         listModel3.addElement(nastavnik);
         listModel4.removeElementAt(a);   
    }                               

    private void desno1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	int a=jList3.getSelectedIndex();
        if(a==-1)
        	return;
        String nastavnik=jList3.getSelectedValue();
        listModel4.addElement(nastavnik);
        listModel3.removeElementAt(a);
    }                                      

    private void snimiActionPerformed(java.awt.event.ActionEvent evt) {                                      
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
		EntityManager em=emf.createEntityManager();
		if(naziv.getText().equals(" ") || skracenica.getText().equals(" ") || brojSemestra.getText().equals(" ") || listModel1.isEmpty() ||listModel3.isEmpty())
		{
			JOptionPane.showMessageDialog(this, "Niste unijeli sve potrebne podatke.");
			return;
		}
		Predmet predmet = new Predmet();
		predmet.setBrojSemestra(Integer.parseInt(brojSemestra.getText()));
		predmet.setNaziv(naziv.getText());
		predmet.setSkracenica(skracenica.getText());
		/*List<Knjiga> listaKnjiga;
		List<Nastavnik> listaNastavnika;*/
	
		for(int i=0; i<listModel1.size(); ++i)
		{
			Knjiga knjiga = (Knjiga)em.createQuery("select e from Knjiga e where e.originalniNaslovKnjige='"+listModel1.get(i)+"'").getSingleResult();
			knjiga.setPredmet(predmet);
			predmet.setKnjiga(knjiga);
			em.getTransaction().begin();
			em.persist(knjiga);
			em.persist(predmet);
			em.getTransaction().commit();	
		}
		
		String Ime="";
		String Prezime="";
		for(int i=0; i<listModel3.size(); ++i)
		{		
				int b=listModel3.get(i).toString().indexOf(" ");
				for(int ii=0;ii<b;++ii)	
						Ime=Ime+listModel3.get(i).toString().charAt(i);
					
				for(int ii=b+1;ii<listModel3.get(i).toString().length();++ii)	
					Prezime=Prezime+listModel3.get(i).toString().charAt(ii);
			Nastavnik nastavnik = (Nastavnik)em.createQuery("select e from Nastavnik e where e.ime='"+Ime+"' and e.prezime='"+Prezime+"'").getSingleResult();
			nastavnik.dodajPredmet(predmet);
			predmet.setNastavnik(nastavnik);
			em.getTransaction().begin();
			em.persist(nastavnik);
			em.persist(predmet);
			em.getTransaction().commit();	
		}
		System.out.println(predmet.getListaKnjiga().size()+ " "+ predmet.getListaNastavnik().size()+" "+ predmet.getNaziv());
		em.close();
		dispose();
	
    }                                     

    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
        dispose();
        }                                    
    private javax.swing.JButton back;
    private javax.swing.JButton desno;
    private javax.swing.JButton desno1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton lijevo;
    private javax.swing.JButton lijevo1;
    private javax.swing.JTextField naziv;
    private javax.swing.JTextField brojSemestra;
    private javax.swing.JTextField skracenica;
    private java.awt.Image slika1,slika2,slika3,slika4,slika5;
    private javax.swing.JButton snimi;         
    private DefaultListModel listModel1=new DefaultListModel();
    private DefaultListModel listModel2=new DefaultListModel();
    private DefaultListModel listModel3=new DefaultListModel();
    private DefaultListModel listModel4=new DefaultListModel();
}
