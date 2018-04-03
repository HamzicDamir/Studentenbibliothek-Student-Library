package paket;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ListaPodignutihAdmin extends javax.swing.JFrame {

    public ListaPodignutihAdmin() {
    	try{
			slika1 = ImageIO.read(new File("images/library.png"));
			slika2 = ImageIO.read(new File("images/back.png"));
	}
	catch(IOException e){
			e.printStackTrace();
	}	
    	initComponents();
        setIconImage(slika1);
    }
                        
    private void initComponents() {

        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        uruci = new javax.swing.JButton();
        Trazi = new javax.swing.JButton();
        trazi1 = new javax.swing.JTextField();
        trazi2 = new javax.swing.JTextField();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista Podignutih Knjiga");
        setResizable(false);
        setLocation(new java.awt.Point(400, 200));

        back.setIcon(new javax.swing.ImageIcon(slika2));
        back.setName("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        
        trazi1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                trazi1KeyReleased(evt);
            }
        });

        trazi2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                trazi2KeyReleased(evt);
            }
        });
        jLabel1.setText("Back");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sifra","Naslov Knjige", "Ime Korisnika", "Prezime Korisnika", "Datum Rezervacije"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false,false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null},
                {null, null, null, null,null}
            },
            new String [] {
               " Sifra","Naslov Knjige", "Ime Korisnika", "Prezime Korisnika", "Datum Preuzimanja"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false ,false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel3.setText("Lista Rezervisanih Knjiga");

        jLabel2.setText("Lista Podignutih Knjiga");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Lista podignutih i rezervisanih knjiga");


        uruci.setText("Uru�i");
        uruci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uruciActionPerformed(evt);
            }
        });

        Trazi.setText("Trazi");
        Trazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(trazi2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trazi1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uruci)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(trazi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uruci)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trazi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
        obnoviTabelu1();
        obnoviTabelu2();
        
    }// </editor-fold>                        

    
    public void obnoviTabelu1()
    {
    	String unesenaRijec=trazi1.getText();
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
    	EntityManager em=emf.createEntityManager();
    	List<Rezervacija>listaP=em.createQuery("select i from Rezervacija i where i.Knjiga.knjiga.naslov like '%"+unesenaRijec +"%' or i.korisnik.ime like '%"+unesenaRijec +"%'"
    			+ " or i.korisnik.prezime like '%"+unesenaRijec +"%'").getResultList();
    	emf.close();
    	model=kreiraj(model);
     	Object a[]=null;
     	if(!listaP.isEmpty())
     	{
	     	for(int i=0;i<listaP.size();++i)
	 		{
	 				model.addRow(a);
	 				model.setValueAt(listaP.get(i).getSifra(), i, 0);
	 				model.setValueAt(listaP.get(i).getPrimjerak().getKnjiga().getNaslov(), i, 1);
	 				model.setValueAt(listaP.get(i).getKorisnik().getIme(), i, 2);
	 				model.setValueAt(listaP.get(i).getKorisnik().getPrezime(), i, 3);
	 		}
     	}
     	if(unesenaRijec.equals(""))
			model=kreiraj(model);
		jTable1.setModel(model);
		TableRowSorter<TableModel> sorter=new TableRowSorter<TableModel>(jTable1.getModel());
		jTable1.setRowSorter(sorter);
		jTable1.getTableHeader().setReorderingAllowed(false);
		jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    
    private void obnoviTabelu2()
    {/*
    	Query query =em.createQuery("select e from Rezervacija e");
    	
    	model=kreiraj(model);
    	Object a[]=null;
    	List<Rezervacija> listaRezervacija=query.getResultList();
    	for(int i=0;i<listaRezervacija.size();++i)
		{
				model.addRow(a);
				model.setValueAt(listaRezervacija.get(i).getSifra(), i, 0);
				model.setValueAt(listaRezervacija.get(i).getPrimjerak().getKnjiga().getNaslov(), i, 1);
				model.setValueAt(listaRezervacija.get(i).getKorisnik().getIme(), i, 2);
				model.setValueAt(listaRezervacija.get(i).getKorisnik().getPrezime(), i, 3);
				model.setValueAt(listaRezervacija.get(i).getDatumRezervacije().toLocalDate(), i, 4);
		}		
		jTable1.setModel(model);
		TableRowSorter<TableModel> sorter=new TableRowSorter<TableModel>(jTable1.getModel());
        jTable1.setRowSorter(sorter);

        jTable1.getTableHeader().setReorderingAllowed(false);
        
       // --------------------
       */ 

    	String unesenaRijec=trazi2.getText();
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
    	EntityManager em=emf.createEntityManager();
        Query query1=em.createQuery("select e from Primjerak e where e.dostupnost=0 and e.inventarniBroj not in(select f.Knjiga.inventarniBroj from Rezervacija f) and e.knjiga.naslov like '%"+unesenaRijec+"%'");
        
        List<Primjerak> listaP=query1.getResultList();
        //System.out.println("Duzina liste "+listaP.size());
        emf.close();
        model=kreiraj(model);
    	Object a[]=null;
    	
    	if(!listaP.isEmpty())
    	{
    		for(int i=0;i<listaP.size();++i)
    		{
				model.addRow(a);
				model.setValueAt(listaP.get(i).getInventarniBroj(), i, 0);
				model.setValueAt(listaP.get(i).getKnjiga().getNaslov(), i, 1);
				model.setValueAt(listaP.get(i).getKorisnik().getIme(), i, 2);
				model.setValueAt(listaP.get(i).getKorisnik().getPrezime(), i, 3);
    		}
    	}
    	if(unesenaRijec.equals(""))
			model=kreiraj(model);
		jTable2.setModel(model);
		TableRowSorter<TableModel> sorter1=new TableRowSorter<TableModel>(jTable2.getModel());
        jTable2.setRowSorter(sorter1);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public DefaultTableModel kreiraj(DefaultTableModel model1)
	{
	model1=new DefaultTableModel(
			new Object [][] {

            },
			 new String [] {
		                "Sifra","Naslov Knjige", "Ime Korisnika", "Prezime Korisnika", "Datum Preuzimanja"
		            }
		        ) {
		            boolean[] canEdit = new boolean [] {
		                false, false, false, false ,false
		            };

		            public boolean isCellEditable(int rowIndex, int columnIndex) {
		                return canEdit [columnIndex];
		            }
		        };
        return model1;

}
    private void uruciActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	int red=jTable1.getSelectedRow();
        if(red<0)
        	return;
        int sifraRezervacije=(int) jTable1.getValueAt(red, 0);
        Rezervacija rezervacija=(Rezervacija)em.createQuery("select e from Rezervacija e where e.sifra='"+sifraRezervacije+"'").getSingleResult();
        int sifraKorisnika=rezervacija.getKorisnik().getSifra();
        int sifraPrimjerka=rezervacija.getPrimjerak().getInventarniBroj();
        
        em.getTransaction().begin();
        em.createQuery("Delete from Rezervacija e where e.sifra='"+sifraRezervacije+"'").executeUpdate();
        em.getTransaction().commit();
        
        KorisnickiProfil korisnik=(KorisnickiProfil)em.createQuery("select e from KorisnickiProfil e where e.sifra='"+sifraKorisnika+"'").getSingleResult();
        Primjerak primjerak=(Primjerak)em.createQuery("select e from Primjerak e where e.inventarniBroj='"+sifraPrimjerka+"'").getSingleResult();
        
        List<Primjerak> listaPrimjeraka=new ArrayList(korisnik.getListaPodignutih());
        listaPrimjeraka.add(primjerak);
        korisnik.setListaPodignutih(listaPrimjeraka);
        primjerak.setKorisnik(korisnik);
        em.getTransaction().begin();
        em.persist(korisnik);
        em.persist(primjerak);
        em.getTransaction().commit();
        obnoviTabelu1();
        obnoviTabelu2();
    }                                        

    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                         
        panelBiblioteke=new PanelBiblioteke();
        panelBiblioteke.setVisible(true);
        dispose();
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void trazi1KeyReleased(java.awt.event.KeyEvent evt) {                                   
    	this.obnoviTabelu1();
    } 
     
    
    private void trazi2KeyReleased(java.awt.event.KeyEvent evt) {                                   
    	this.obnoviTabelu2();
    } 
    
    private PanelBiblioteke panelBiblioteke;
    private java.awt.Image slika1,slika2;                 
    private javax.swing.JButton back;
    private javax.swing.JButton uruci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
   	private EntityManager em=emf.createEntityManager();
   	private DefaultTableModel model;
    private javax.swing.JButton Trazi;
    private javax.swing.JTextField trazi1;
    private javax.swing.JTextField trazi2;                 
}

