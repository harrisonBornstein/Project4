import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;


public class ScholarshipView extends JFrame {

	private JPanel contentPane;
	private ScholarshipModel model;
	
	public ScholarshipView()
	{
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
		
		JButton btnNewButton = new JButton("Add Scholar");
		btnNewButton.setBounds(6, 344, 117, 29);
		panel.add(btnNewButton);
		
		JList list = new JList();
		list.setBounds(22, 20, 374, 310);
		panel.add(list);
		
		JButton btnDeleteScholars = new JButton("Delete Scholar(s)");
		btnDeleteScholars.setBounds(123, 344, 136, 29);
		panel.add(btnDeleteScholars);
		
		JButton btnDeleteAllScholars = new JButton("Delete All Scholars");
		btnDeleteAllScholars.setBounds(258, 344, 155, 29);
		panel.add(btnDeleteAllScholars);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Serials", null, panel_1, null);
		
		JList list_1 = new JList();
		list_1.setBounds(22, 20, 374, 310);
		panel_1.setLayout(null);
		panel_1.add(list_1);
		
		JButton button = new JButton("Add Serial");
		button.setBounds(6, 344, 117, 29);
		panel_1.add(button);
		
		JButton button_1 = new JButton("Delete Serial(s)");
		button_1.setBounds(123, 344, 136, 29);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("Delete All Serials");
		button_2.setBounds(258, 344, 155, 29);
		panel_1.add(button_2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Papers", null, panel_2, null);
		panel_2.setLayout(null);
		
		JList list_2 = new JList();
		list_2.setBounds(22, 20, 374, 310);
		panel_2.add(list_2);
		
		JButton button_3 = new JButton("Add Paper");
		button_3.setBounds(6, 344, 117, 29);
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("Delete Paper(s)");
		button_4.setBounds(123, 344, 136, 29);
		panel_2.add(button_4);
		
		JButton button_5 = new JButton("Delete All Papers");
		button_5.setBounds(258, 344, 155, 29);
		panel_2.add(button_5);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 12, 445, 22);
		contentPane.add(menuBar);
		
		JMenu mnTest = new JMenu("File");
		menuBar.add(mnTest);
	}
	
	public void actionPerformed()
	{
		
	}
	
	public void setModel(ScholarshipModel newModel)
	{
		
	}
}
