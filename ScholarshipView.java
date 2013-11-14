import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;


public class ScholarshipView extends JFrame implements ActionListener {

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
	
	
	private DefaultListModel<String> scholarListModel = new DefaultListModel<String>();
	private DefaultListModel<String> serialListModel = new DefaultListModel<String>();
	private DefaultListModel<String> paperListModel = new DefaultListModel<String>();
	private List<Effort> viewEfforts = new ArrayList<Effort>();
	private List<Paper> publications = new ArrayList<Paper>();
	
	JList paperList = new JList(paperListModel);
	JList scholarList = new JList(scholarListModel);
	JList serialList = new JList(serialListModel);
	
	private final JScrollPane scrollPane = new JScrollPane();
	private final JScrollPane scrollPane_1 = new JScrollPane();
	private JScrollPane scrollPane_2 = new JScrollPane();
	
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
		
		JMenuItem mntmImportBinaryScholarship = new JMenuItem("Import Binary Scholarship");
		mnTest.add(mntmImportBinaryScholarship);
		
		JMenuItem mntmExportBinaryScholarship = new JMenuItem("Export Binary Scholarship");
		mnTest.add(mntmExportBinaryScholarship);
}
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
	}
	private void populateScholarJList()
	{
		scholarListModel.clear();
		if (model.getScholars() != null)
			for (int i = 0; i < model.getScholars().size(); i++) {
				scholarListModel.addElement((model.getScholars().get(i).getFullName()));
			}
	}
	
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
			for(int i=0; i< viewEfforts.size();++i)
			{
				serialListModel.addElement(viewEfforts.get(i).getOrganization());
			}
		}
	}
	
	public JButton getAddScholarButton()
	{
		return jbtAddScholar;
	}
	
	public JButton getDeleteScholarsButton()
	{
		return btnDeleteScholars;
	}
	
	public JButton getDeleteAllScholarsButton()
	{
		return btnDeleteAllScholars;
	}
	
	public JButton getAddSerialButton()
	{
		return button;
	}
	
	public JButton getDeleteSerialsButton()
	{
		return button_1;
	}
	
	public JButton getDeleteAllSerialsButton()
	{
		return button_2;
	}
	
	public JButton getAddPaperButton()
	{
		return button_3;
	}
	
	public JButton getDeletePapersButton(){
		return button_4;
	}
	
	public JButton getDelteAllPapersButton()
	{
		return button_5;
	}
	
	
	public void setModel(ScholarshipModel newModel)
	{
		this.model = newModel;
		
		if (model != null) {
			model.addActionListener(this);
			setVisible(true);
		}
	}
	
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
			
		}
		else if(e.getActionCommand().equals("Conference Added") || e.getActionCommand().equals("Conference Removed"))
		{
			populateSerialJList();
			populatePaperJList();
			
		}
		else if(e.getActionCommand().equals("Paper Added") || e.getActionCommand().equals("Paper Removed"))
		{
			populatePaperJList();
			
		}
		
	}
	
	public JList<String> getScholarList()
	{
		return scholarList;
	}
	
	public List<Effort> getEfforts()
	{
		return viewEfforts;
	}
	public List<Paper> getPapers()
	{
		return publications;
	}
}
