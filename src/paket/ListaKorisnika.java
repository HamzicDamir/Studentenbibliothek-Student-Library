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

public class ListaKorisnika extends javax.swing.JFrame {

    public ListaKorisnika(String Text) {
    	try{
			slika1 = ImageIO.read(new File("images/library.png"));
			slika2 = ImageIO.read(new File("images/back.png"));
	}
	catch(IOException e){
			e.printStackTrace();
	}	
    	text=Text;
        initComponents();
        setIconImage(slika1);
        setTitle("Lista Korisnika");
    }

                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        trazi = new javax.swing.JButton();
        uredi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        back = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        
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

        uredi.setText("Uredi");
        uredi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urediActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sifra", "Ime", "Prezime", "Uloga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        }

        back.setIcon(new javax.swing.ImageIcon(slika2));
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


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uredi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(trazi, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(trazi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uredi))
                .addContainerGap())
        );

        pack();                 
    }
    private void traziActionPerformed(java.awt.event.ActionEvent evt) {                                      
    	obnoviTabelu();
    }                                     

    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
    	panelBiblioteke= new PanelBiblioteke();
    	panelBiblioteke.setVisible(true);
    	dispose();

    }                                    

    
    
private void tabelaKeyPressed(java.awt.event.KeyEvent evt) {                       
        int key=evt.getKeyCode();
        if(key==KeyEvent.VK_U)
        {
        	uredi();
        }
        
    }  
    
	private void uredi()
	{
		if(search.getText().equals(""))
    		return;
		
		int red=tabela.getSelectedRow();
		if(red==-1)
			return;
		//Zamijeniti sa indexom ili ime.prezime od nastavnika 
		int sifra=(int) tabela.getValueAt(red, 0);
		String ulogaKorisnika=(String)tabela.getValueAt(red, 3);
		if(ulogaKorisnika.equals("student"))
		{
			Student korisnik =(Student) em.createQuery("select e from Student e where e.sifra='"+sifra+"'").getSingleResult();
			urediProfile=new UrediProfile(korisnik.getSifra(),korisnik.getUloga(),search.getText());
			urediProfile.setVisible(true);
			dispose();
		}
		else if(ulogaKorisnika.equals("nastavnik"))
		{
			Nastavnik korisnik =(Nastavnik) em.createQuery("select e from Nastavnik e where e.sifra='"+sifra+"'").getSingleResult();
			urediProfile=new UrediProfile(korisnik.getSifra(),korisnik.getUloga(),search.getText());
			urediProfile.setVisible(true);
			dispose();
		}
	}

    private void urediActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	uredi();
    	
    } 
    
    private void searchKeyReleased(java.awt.event.KeyEvent evt) {
    	obnoviTabelu();
    }      
    public void obnoviTabelu()
    {
    	String unesenaRijec=search.getText();
    	
    	Query query =em.createQuery("select i from Student i where i.ime like '%"+unesenaRijec +"%' or i.prezime like '%"+unesenaRijec +"%'"
    			+ "or i.uloga like '%"+unesenaRijec+"%'",KorisnickiProfil.class);
    	List<Student>korList=query.getResultList();
    	Query query1 =em.createQuery("select i from Nastavnik i where i.ime like '%"+unesenaRijec +"%' or i.prezime like '%"+unesenaRijec +"%'"
    			+ "or i.uloga like '%"+unesenaRijec+"%'",KorisnickiProfil.class);
    	List<Nastavnik>korList1=query1.getResultList();
    	model=kreiraj(model);
    	if(!korList.isEmpty() || !korList1.isEmpty())
    	{
			Object a[]=null;
			int i;
			for (i = 0;i<korList.size();++i) {
				model.addRow(a);
				model.setValueAt(korList.get(i).getSifra(), i, 0);
				model.setValueAt(korList.get(i).getIme(), i, 1);
				model.setValueAt(korList.get(i).getPrezime(), i, 2);
				model.setValueAt(korList.get(i).getUloga(), i, 3);
				}
			for (int j = 0;j<korList1.size();++i,++j) {
				model.addRow(a);
				model.setValueAt(korList1.get(j).getSifra(), i, 0);
				model.setValueAt(korList1.get(j).getIme(), i, 1);
				model.setValueAt(korList1.get(j).getPrezime(), i, 2);
				model.setValueAt(korList1.get(j).getUloga(), i, 3);
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
                      "Sifra", "Ime", "Prezime", "Uloga"
                  }
              ) {
                  boolean[] canEdit = new boolean [] {
                      true, false, false, false
                  };

                  public boolean isCellEditable(int rowIndex, int columnIndex) {
                      return canEdit [columnIndex];
                  }
              };
	        return model1;

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
    private java.awt.Image slika1,slika2;
    private javax.swing.JButton back;
    private javax.swing.JButton uredi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    private javax.swing.JTable tabela;
    private javax.swing.JButton trazi; 
    private PanelBiblioteke panelBiblioteke;
    private Nastavnik nastavnik;
    private Student student;
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentskaBiblioteka");
	private EntityManager em=emf.createEntityManager();
	private DefaultTableModel model;
	private UrediProfile urediProfile;
}
