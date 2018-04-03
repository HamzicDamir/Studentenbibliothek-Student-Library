package paket;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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

public class ListaPodignutihKnjiga extends javax.swing.JFrame {

    public ListaPodignutihKnjiga(int Sifra,String Uloga) {
    	try{
			slika1 = ImageIO.read(new File("images/library.png"));
			slika2 = ImageIO.read(new File("images/back.png"));
	}
	catch(IOException e){
			e.printStackTrace();
	}	
    	sifra=Sifra;
    	uloga=Uloga;
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
         vrati = new javax.swing.JButton();

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

        jLabel2.setText("Lista Rezervisanih Knjiga");

        jLabel3.setText("Lista Podignutih Knjiga");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel4.setText("Lista Podignutih Knjiga");
        vrati.setText("Vrati");
        vrati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vratiActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vrati)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vrati)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        
        
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
		EntityManager em=emf.createEntityManager();
        	KorisnickiProfil korisnik = (KorisnickiProfil)em.createQuery("select i from KorisnickiProfil i where i.sifra='"+sifra+"'").getSingleResult();
        	System.out.println(korisnik.getListaPodignutih().size());
        	Query query =em.createQuery("select e from Rezervacija e where e.korisnik.sifra='"+sifra+"'");
        	
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
    		jTable2.setModel(model);
    		TableRowSorter<TableModel> sorter=new TableRowSorter<TableModel>(jTable2.getModel());
            jTable2.setRowSorter(sorter);
            jTable2.getTableHeader().setReorderingAllowed(false);

            jTable2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            emf.close();
            obnoviTabelu();
        pack();
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
	
	
	
	private void obnoviTabelu()
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
		EntityManager em=emf.createEntityManager();
		KorisnickiProfil korisnik = (KorisnickiProfil)em.createQuery("select i from KorisnickiProfil i where i.sifra='"+sifra+"'").getSingleResult();
		List<Primjerak> listaPodignutih=(List<Primjerak>) korisnik.getListaPodignutih();
        model=kreiraj(model);
    	Object a[]=null;
    	
    	if(!listaPodignutih.isEmpty())
    	{
    		for(int i=0;i<listaPodignutih.size();++i)
    		{
				model.addRow(a);
				model.setValueAt(listaPodignutih.get(i).getInventarniBroj(), i, 0);
				model.setValueAt(listaPodignutih.get(i).getKnjiga().getNaslov(), i, 1);
				model.setValueAt(listaPodignutih.get(i).getKorisnik().getIme(), i, 2);
				model.setValueAt(listaPodignutih.get(i).getKorisnik().getPrezime(), i, 3);
    		}
    	}
    	em.close();
    	jTable1.setModel(model);
		TableRowSorter<TableModel> sorter1=new TableRowSorter<TableModel>(jTable1.getModel());
        jTable1.setRowSorter(sorter1);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
    	if(uloga.equals("nastavnik"))
    	{
    		panelNastavnika=new PanelNastavnika(sifra);
    		panelNastavnika.setVisible(true);
    		dispose();
    	}
    	else if(uloga.equals("student"))
    	{
    		panelStudenta=new PanelStudenta(sifra);
    		panelStudenta.setVisible(true);
    		dispose();
    	}
    }                                        

    
    
    private void vratiActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	 int red=jTable1.getSelectedRow();
         if(red<0)
         	return;
        int sifraPrimjerka = (int)jTable1.getValueAt(red, 0);
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
 		EntityManager em=emf.createEntityManager();
 		KorisnickiProfil korisnik = (KorisnickiProfil)em.createQuery("select i from KorisnickiProfil i where i.sifra='"+sifra+"'").getSingleResult();
 		List<Primjerak> listaPodignutih=(List<Primjerak>) korisnik.getListaPodignutih();
 		for(Primjerak a : listaPodignutih)
 		{
 			if(a.getInventarniBroj() == sifraPrimjerka)
 			{
 				a.setDostupnost(true);
 				a.setKorisnik(null);
 				listaPodignutih.remove(a);
 				em.getTransaction().begin();;
 				em.persist(a);
 				em.persist(korisnik);
 				em.getTransaction().commit();
 				em.close();
 				obnoviTabelu();
 				return;
 			}
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
    
    public void setUloga(String Uloga)
    {
        uloga=Uloga;
    }
    
    public String getUloga()
    {
        return uloga;
    }
    
    private int sifra;
    private String uloga;
    private PanelBiblioteke panelBiblioteke;
    private PanelNastavnika panelNastavnika;
    private PanelStudenta panelStudenta;
    private java.awt.Image slika1,slika2;                 
    private javax.swing.JButton back;
    private javax.swing.JButton vrati;
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
}
