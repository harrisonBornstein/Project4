import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class ScholarshipView extends JFrame implements ActionListener {

	private JPanel contentPane;
	private ScholarshipModel model;
	JButton jbtAddScholar = new JButton("Add Scholar");
	JButton btnDeleteScholars = new JButton("Delete Scholar(s)");
	JButton btnDeleteAllScholars = new JButton("Delete All Scholars");
	JButton button = new JButton("Add Serial");
	JButton button_1 = new JButton("Delete Serial(s)");
	JButton button_2 = new JButton("Delete All Serials");
	JButton button_3 = new JButton("Add Paper");
	JButton button_4 = new JButton("Delete Paper(s)");
	JButton button_5 = new JButton("Delete All Papers");
	JList scholarList = new JList();
	JList serialList = new JList();
	
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
		
		
		scholarList.setBounds(22, 20, 374, 310);
		panel.add(scholarList);
		
		
		btnDeleteScholars.setBounds(123, 344, 136, 29);
		panel.add(btnDeleteScholars);
		
		
		btnDeleteAllScholars.setBounds(258, 344, 155, 29);
		panel.add(btnDeleteAllScholars);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Serials", null, panel_1, null);
		
		
		serialList.setBounds(22, 20, 374, 310);
		panel_1.setLayout(null);
		panel_1.add(serialList);
		
		
		button.setBounds(6, 344, 117, 29);
		panel_1.add(button);
		
		
		button_1.setBounds(123, 344, 136, 29);
		panel_1.add(button_1);
		
		
		button_2.setBounds(258, 344, 155, 29);
		panel_1.add(button_2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Papers", null, panel_2, null);
		panel_2.setLayout(null);
		
		JList list_2 = new JList();
		list_2.setBounds(22, 20, 374, 310);
		panel_2.add(list_2);
		
		
		button_3.setBounds(6, 344, 117, 29);
		panel_2.add(button_3);
		
		
		button_4.setBounds(123, 344, 136, 29);
		panel_2.add(button_4);
		
		
		button_5.setBounds(258, 344, 155, 29);
		panel_2.add(button_5);
		
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
		if (this.model != null) 
		{
			model.addActionListener(this);
		}
	}
	
	public JList getScholarList()
	{
		return list_1;
	}


	@Override
	public void actionPerformed(ActionEvent actionEvent) 
	{
		// TODO Auto-generated method stub
		
	}
}
