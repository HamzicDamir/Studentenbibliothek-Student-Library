package paket;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ListaKnjiga extends javax.swing.JFrame {

    public ListaKnjiga(int Sifra,String Uloga,String Text) {
    	try{
			slika1 = ImageIO.read(new File("images/library.png"));
			slika2 = ImageIO.read(new File("images/back.png"));
	}
	catch(IOException e){
			e.printStackTrace();
	}	
    	sifra=Sifra;
    	uloga=Uloga;
    	text=Text;
    	initComponents();
        setIconImage(slika1);
        setTitle("Lista Knjiga");
    }

                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        trazi = new javax.swing.JButton();
        detalji = new javax.swing.JButton();
        rezervisi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        back = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Search");

        trazi.setFont(new java.awt.Font("Tahoma", 0, 12));
        trazi.setText("Trazi");
        trazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traziActionPerformed(evt);
            }
        });

        rezervisi.setText("Rezervi�i");
        rezervisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rezervisiActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sifra", "Naziv", "Izdavac", "Dostupnost", "Vrsta",
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setDragEnabled(true);
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
            tabela.getColumnModel().getColumn(2).setResizable(false);
            tabela.getColumnModel().getColumn(3).setResizable(false);
            tabela.getColumnModel().getColumn(4).setResizable(false);
        }

        back.setIcon(new javax.swing.ImageIcon(slika2)); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jLabel2.setText("Back");

        detalji.setText("Detalji");
        detalji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detaljiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(trazi, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rezervisi, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(detalji, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(trazi, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(search)))
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(detalji)
                        .addGap(5, 5, 5)
                        .addComponent(rezervisi)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        
        if(uloga.equals("admin"))
        	rezervisi.setVisible(false);
        pack();                 
    }
    private void traziActionPerformed(java.awt.event.ActionEvent evt) {                                      
    	obnoviTabelu();
    }                                     

    private void backActionPerformed(java.awt.event.ActionEvent evt) {  
    	
    	if(uloga.equals("admin"))	
    	{
    		panelBiblioteke= new PanelBiblioteke();
    		panelBiblioteke.setVisible(true);
    		dispose();
    	}
    	else if(uloga.equals("student"))
    	{
    		panelStudenta=new PanelStudenta(sifra);
    		panelStudenta.setVisible(true);
    		dispose();
    	}
    	else if(uloga.equals("nastavnik"))
    	{
    		panelNastavnika=new PanelNastavnika(sifra);
    		panelNastavnika.setVisible(true);
    		dispose();	
    	}
    }                                    

    private void izbrisiActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	delete();
    }
    
private void tabelaKeyPressed(java.awt.event.KeyEvent evt) {                       
        int key=evt.getKeyCode();
        if(key==KeyEvent.VK_U)
        {
        	rezervisi();
        }
        else if(key==KeyEvent.VK_D)
        {
        	//delete();
        }
    }  
    
    private void delete()
    {
    	if(search.getText().equals(""))
    		return;
    	int red=tabela.getSelectedRow();
		String nazivKnjige=(String) tabela.getValueAt(red, 1);
    	System.out.print(nazivKnjige);
    }
	private void rezervisi()
	{
		if(search.getText().equals(""))
    		return;
		
		int red=tabela.getSelectedRow();
		if(red<0)
			return;
		int sifraKnjige = (int) tabela.getValueAt(red, 0);
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
		EntityManager em=emf.createEntityManager();
		Knjiga knjiga =(Knjiga) em.createQuery("select e from Knjiga e where e.sifraKnjiga='"+sifraKnjige+"'").getSingleResult();
	
		Query query1 = em.createQuery("select e from KorisnickiProfil e where e.sifra='"+sifra+"'");
		KorisnickiProfil k = (KorisnickiProfil)query1.getSingleResult();
		List<Primjerak> listaP = (List<Primjerak>) k.getListaPodignutih();
		for(int i=0; i<listaP.size(); ++i)
		{
			if(listaP.get(i).getKnjiga().getSifra() == knjiga.getSifra())
			{	
				JOptionPane.showMessageDialog(this, "Nije dozovoljeno istovremeno podizati dva primjerka iste knjige!!!");
				break;
			}
			else
				continue;
		}
		
		Query query=em.createQuery("select e from Rezervacija e where e.korisnik.sifra='"+sifra+"'");
		List<Rezervacija> listaRezervacija=query.getResultList();
		int broj= listaRezervacija.size()+listaP.size();
		if(listaRezervacija.size()>=3 || broj>=3)
		{
			JOptionPane.showMessageDialog(this, "Nije dozvoljeno rezervisati vise od tri primjerka!!!");	
			return;
		}
		for(int i=0;i<listaRezervacija.size();++i)
		{
			if(listaRezervacija.get(i).getPrimjerak().getKnjiga().getSifra()==sifraKnjige)
			{
				JOptionPane.showMessageDialog(this, "Nije dozvoljeno dva puta rezervisati istu knjigu!!!");
				return;
			}
		}
		
		Primjerak primjerak = knjiga.getPrimjerak();
		if(primjerak==null)
		{
			JOptionPane.showMessageDialog(this,"Knjiga trenutno nije dostupna!!!");
			return;
		}
		PodesavanjeRezervacije rezervacija=new PodesavanjeRezervacije(knjiga,uloga,sifra);
		rezervacija.setVisible(true);
		dispose();
	}

    private void rezervisiActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	rezervisi();
    	
    } 
    
    private void searchKeyReleased(java.awt.event.KeyEvent evt) {
    	obnoviTabelu();
    }      
    
    private void detaljiActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	if(search.getText().equals(""))
    		return;
		
		int red=tabela.getSelectedRow();
		if(red<0)
			return;
		int sifraKnjige = (int) tabela.getValueAt(red, 0);
		ProfilKnjige profilKnjige=new ProfilKnjige(sifraKnjige);
		profilKnjige.setVisible(true);
    } 
    
    public void obnoviTabelu()
    {
    	String unesenaRijec=search.getText();
    	/*
    	Query query =em.createQuery("select i from KorisnickiProfil i where i.ime like '%"+unesenaRijec +"%' or i.prezime like '%"+unesenaRijec +"%'"
    			+ "or i.uloga like '%"+unesenaRijec+"%'",KorisnickiProfil.class);
    	*/
    	EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
    	EntityManager em=emf.createEntityManager();
    	List<Knjiga>knjList=em.createQuery("select i from Knjiga i where i.naslov like '%"+unesenaRijec +"%' or i.vrsta like '%"+unesenaRijec +"%'"
    			+ " or i.izdavac.naziv like '%"+unesenaRijec +"%'").getResultList();
    	emf.close();
    	model=kreiraj(model);
    	if(!knjList.isEmpty())
    	{
			Object a[]=null;
			for (int i = 0;i<knjList.size();++i) {
				model.addRow(a);
				model.setValueAt(knjList.get(i).getSifra(), i, 0);
				model.setValueAt(knjList.get(i).getNaslov(), i, 1);
				model.setValueAt(knjList.get(i).getIzdavac().getNaziv(), i, 2);
				model.setValueAt(knjList.get(i).getBrojDostupnihKnjiga(), i, 3);
				model.setValueAt(knjList.get(i).getVrsta(), i, 4);
				}
    	}
		if(unesenaRijec.equals(""))
			model=kreiraj(model);
		tabela.setModel(model);
		TableRowSorter<TableModel> sorter=new TableRowSorter<TableModel>(tabela.getModel());
        tabela.setRowSorter(sorter);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    	
    public DefaultTableModel kreiraj(DefaultTableModel model1)
    {
    	model1=new DefaultTableModel(
    			new Object [][] {

                },
                new String [] {
                    "Sifra", "Naziv","Izdavac", "Dostupnost", "Vrsta",
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            };
            return model1;

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
    public void setText(String Text)
    {
        text=Text;
    }
    public String getText()
    {
        return text;
    }
    private String text;
    private int sifra;
    private String uloga;
    private java.awt.Image slika1,slika2;
    private javax.swing.JButton back;
    private javax.swing.JButton detalji;
    private javax.swing.JButton rezervisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    private javax.swing.JTable tabela;
    private javax.swing.JButton trazi; 
    private PanelBiblioteke panelBiblioteke;
    private PanelStudenta panelStudenta;
    private PanelNastavnika panelNastavnika;
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
	private EntityManager em=emf.createEntityManager();
	private DefaultTableModel model;
}
