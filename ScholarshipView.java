import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;


public class ScholarshipView extends JFrame implements ActionListener, Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3514779765110433379L;
	private JPanel contentPane;
	private ScholarshipModel model;
	private JButton jbtAddScholar = new JButton("Add Scholar");
	private JButton btnDeleteScholars = new JButton("Delete Scholar(s)");
	private JButton btnDeleteAllScholars = new JButton("Delete All Scholars");
	private JButton button = new JButton("Add Serial");
	private JButton button_1 = new JButton("Delete Serial(s)");
	private JButton button_2 = new JButton("Delete All Serials");
	private JButton button_3 = new JButton("Add Paper");
	private JButton button_4 = new JButton("Delete Paper(s)");
	private JButton button_5 = new JButton("Delete All Papers");
	private JButton btnGetInfo = new JButton("Get Info");
	private JButton btnGetInfoSerial = new JButton("Get Info");
	private JButton btnGetInfoPaper = new JButton("Get Info");
	private JMenuItem mntmImportBinaryScholarship = new JMenuItem("Import Binary Scholarship");
	private JMenuItem mntmExportBinaryScholarship = new JMenuItem("Export Binary Scholarship");
	
	
	private DefaultListModel<String> scholarListModel = new DefaultListModel<String>();
	private DefaultListModel<String> serialListModel = new DefaultListModel<String>();
	private DefaultListModel<String> paperListModel = new DefaultListModel<String>();
	private List<Effort> viewEfforts = new ArrayList<Effort>();
	private List<Paper> publications = new ArrayList<Paper>();
	
	JList<String> paperList = new JList<String>(paperListModel);
	JList<String> scholarList = new JList<String>(scholarListModel);
	JList<String> serialList = new JList<String>(serialListModel);
	
	private final JScrollPane scrollPane = new JScrollPane();
	private final JScrollPane scrollPane_1 = new JScrollPane();
	private JScrollPane scrollPane_2 = new JScrollPane();
	private final JMenu mnPlot = new JMenu("Plot");
	private final JMenuItem mntmTypeOfPublication = new JMenuItem("Type of Publication");
	private final JMenuItem mntmPublicationsPerYear = new JMenuItem("Publications per Year");
	private final JMenuItem mntmConferencePapersPer = new JMenuItem("Conference Papers per Year");
	private final JMenuItem mntmJournalArticlesPer = new JMenuItem("Journal Articles per Year");
	private final JMenuItem mntmCoauthorsPerPublication = new JMenuItem("Co-Authors per Publication");
	
/**
 * Creates the view	
 */
public ScholarshipView(){
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 38, 440, 468);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Scholars", null, panel, null);
		panel.setLayout(null);
		
		
		jbtAddScholar.setBounds(6, 344, 117, 29);
		panel.add(jbtAddScholar);
		
		
		btnDeleteScholars.setBounds(123, 344, 136, 29);
		panel.add(btnDeleteScholars);
		
		
		btnDeleteAllScholars.setBounds(258, 344, 155, 29);
		panel.add(btnDeleteAllScholars);
		scrollPane.setBounds(0, 0, 413, 332);
		
		panel.add(scrollPane);
		scrollPane.setViewportView(scholarList);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Serials", null, panel_1, null);
		panel_1.setLayout(null);
		
		
		button.setBounds(6, 344, 117, 29);
		panel_1.add(button);
		
		
		button_1.setBounds(123, 344, 136, 29);
		panel_1.add(button_1);
		
		
		button_2.setBounds(258, 344, 155, 29);
		panel_1.add(button_2);
		scrollPane_1.setBounds(0, 0, 413, 332);
		
		panel_1.add(scrollPane_1);
		scrollPane_1.setViewportView(serialList);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Papers", null, panel_2, null);
		panel_2.setLayout(null);
		button_3.setBounds(6, 344, 117, 29);
		panel_2.add(button_3);
		button_4.setBounds(123, 344, 136, 29);
		panel_2.add(button_4);
		button_5.setBounds(258, 344, 155, 29);
		panel_2.add(button_5);
		
		
		scrollPane_2.setBounds(0, 0, 413, 332);
		panel_2.add(scrollPane_2);
		scrollPane_2.setViewportView(paperList);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 12, 445, 22);
		contentPane.add(menuBar);
		
		JMenu mnTest = new JMenu("File");
		menuBar.add(mnTest);
		
		
		mnTest.add(mntmImportBinaryScholarship);
		
	
		mnTest.add(mntmExportBinaryScholarship);
		
		menuBar.add(mnPlot);
		
		mnPlot.add(mntmTypeOfPublication);
		
		mnPlot.add(mntmPublicationsPerYear);
		
		mnPlot.add(mntmConferencePapersPer);
		
		mnPlot.add(mntmJournalArticlesPer);
		
		mnPlot.add(mntmCoauthorsPerPublication);
		
		button.setEnabled(false);
		button_3.setEnabled(false);
		btnDeleteScholars.setEnabled(false);
		btnDeleteAllScholars.setEnabled(false);
		
		
		btnGetInfo.setBounds(6, 384, 117, 29);
		panel.add(btnGetInfo);
		
		
		btnGetInfoSerial.setBounds(6, 384, 117, 29);
		panel_1.add(btnGetInfoSerial);
		
		btnGetInfoPaper.setBounds(6, 384, 117, 29);
		panel_2.add(btnGetInfoPaper);
		
		button_1.setEnabled(false);
		button_2.setEnabled(false);
		button_4.setEnabled(false);
		button_5.setEnabled(false);
		
		
		
}
/**
 * getter
 * @return
 */
public JMenuItem getExportBinary()
{
	return mntmExportBinaryScholarship;
}
/**
 * getter
 * @return
 */
public JMenuItem getImportBinary()
{
	return mntmImportBinaryScholarship;
}
	/**
	 * Fills the JList in the paper tab
	 */
	private void populatePaperJList()
	{
		paperListModel.clear();
		publications.clear();
		if (model.getPapers() != null)
		{
			for(int i =0; i<model.getPapers().size();i++)
			{
				paperListModel.addElement((model.getPapers().get(i).getPaperTitle()));
				publications.add(model.getPapers().get(i));
			}
		}
		if (model.getPapers().size() > 0)
		{
			button_4.setEnabled(true);
			button_5.setEnabled(true);
		}
		else
		{
			button_4.setEnabled(false);
			button_5.setEnabled(false);
		}
		
	}
	/**
	 * Fills the jList in the scholar tab
	 */
	private void populateScholarJList()
	{
		scholarListModel.clear();
		if (model.getScholars() != null)
			for (int i = 0; i < model.getScholars().size(); i++) 
			{
				scholarListModel.addElement((model.getScholars().get(i).getFullName()));
			}
		if (model.getScholars().size() > 0)
		{
			button.setEnabled(true);
			btnDeleteScholars.setEnabled(true);
			btnDeleteAllScholars.setEnabled(true);
		}
		else
		{
			button.setEnabled(false);
			button_3.setEnabled(false);
			btnDeleteScholars.setEnabled(false);
			btnDeleteAllScholars.setEnabled(false);
		}
	}
	/**
	 * fills the JList in the serial tab
	 */
	private void populateSerialJList()
	{
		serialListModel.clear();
		viewEfforts.clear();
		if (!model.getConferences().isEmpty())
		{
			for (int i = 0; i < model.getConferences().size(); i++)
			{
		
					viewEfforts.add(model.getConferences().get(i));			
			}
		}
		if(!model.getJournals().isEmpty())
		{
			for(int i =0; i< model.getJournals().size();++i)
			{
					viewEfforts.add(model.getJournals().get(i));
				
			}
		}
		if(!viewEfforts.isEmpty())
		{
			for(int i=0; i< viewEfforts.size(); ++i)
			{
				serialListModel.addElement(viewEfforts.get(i).getOrganization());
			}
		}
		if (viewEfforts.size() > 0)
		{
			button_3.setEnabled(true);
			button_1.setEnabled(true);
			button_2.setEnabled(true);
		}
		else
		{
			button_3.setEnabled(false);
			button_1.setEnabled(false);
			button_2.setEnabled(false);
		}
	}
	/**
	 * getter
	 * @return
	 */
	public JButton getAddScholarButton()
	{
		return jbtAddScholar;
	}
	/**
	 * getter
	 * @return
	 */
	public JButton getDeleteScholarsButton()
	{
		return btnDeleteScholars;
	}
	/**
	 * getter
	 * @return
	 */
	public JButton getDeleteAllScholarsButton()
	{
		return btnDeleteAllScholars;
	}
	/**
	 * getter
	 * @return
	 */
	public JButton getAddSerialButton()
	{
		return button;
	}
	/**
	 * getter
	 * @return
	 */
	public JButton getDeleteSerialsButton()
	{
		return button_1;
	}
	/**
	 * getter
	 * @return
	 */
	public JButton getDeleteAllSerialsButton()
	{
		return button_2;
	}
	/**
	 * getter
	 * @return
	 */
	public JButton getAddPaperButton()
	{
		return button_3;
	}
	/**
	 * getter
	 * @return
	 */
	public JButton getDeletePapersButton(){
		return button_4;
	}
	/**
	 * getter
	 * @return
	 */
	public JButton getDelteAllPapersButton()
	{
		return button_5;
	}
	/**
	 * getter
	 * @return
	 */
	public JMenuItem getTypeOfPub()
	{
		return mntmTypeOfPublication;
	}
	/**
	 * getter
	 * @return
	 */
	public JMenuItem getPubPerYear()
	{
		return mntmPublicationsPerYear;
	}
	/**
	 * getter
	 * @return
	 */
	public JMenuItem getConPerYear()
	{
		return mntmConferencePapersPer;
	}
	/**
	 * getter
	 * @return
	 */
	public JMenuItem getJournPerYear()
	{
		return mntmJournalArticlesPer;
	}
	/**
	 * getter
	 * @return
	 */
	public JMenuItem getCoAuthors()
	{
		return mntmCoauthorsPerPublication;
	}
	/**
	 * getter
	 * @return
	 */
	public JMenuItem getImport()
	{
		return mntmImportBinaryScholarship;
	}
	/**
	 * getter
	 * @return
	 */
	public JMenuItem getExport()
	{
		return mntmExportBinaryScholarship;
	}
	/**
	 * Makes the view as an actionListener on the model
	 * @param newModel
	 */
	public void setModel(ScholarshipModel newModel)
	{
		this.model = newModel;
		
		if (model != null) 
		{
			model.addActionListener(this);
			setVisible(true);
			populateScholarJList();
			populateSerialJList();
			populatePaperJList();
			
		}
	}
	/**
	 * Updates the view if the model changes
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Scholar Added") || e.getActionCommand().equals("Scholar Removed")) {
			populateScholarJList();
			populateSerialJList();
			populatePaperJList();
			
		}
		else if(e.getActionCommand().equals("Journal Added") || e.getActionCommand().equals("Journal Removed"))
		{
			populateSerialJList();
			populatePaperJList();
			populateScholarJList();
			
		}
		else if(e.getActionCommand().equals("Conference Added") || e.getActionCommand().equals("Conference Removed"))
		{
			populateSerialJList();
			populatePaperJList();
			populateScholarJList();
			
		}
		else if(e.getActionCommand().equals("Paper Added") || e.getActionCommand().equals("Paper Removed"))
		{
			populateSerialJList();
			populatePaperJList();
			populateScholarJList();
			
		}
		
	}
	/**
	 * getter
	 * @return
	 */
	public JList<String> getScholarList()
	{
		return scholarList;
	}
	/**
	 * getter
	 * @return
	 */
	public List<Effort> getEfforts()
	{
		return viewEfforts;
	}
	/**
	 * getter
	 * @return
	 */
	public List<Paper> getPapers()
	{
		return publications;
	}
	
	/**
	 * getter
	 * @return
	 */
	public JButton getInfoButton()
	{
		return btnGetInfo;
	}
	
	/**
	 * getter
	 * @return
	 */
	public JButton getSerialInfoButton()
	{
		return btnGetInfoSerial;
	}
	
	/**
	 * getter
	 * @return
	 */
	public JButton getPaperInfoButton()
	{
		return btnGetInfoPaper;
	}
}
