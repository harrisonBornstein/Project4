import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class ScholarInfoView extends JDialog{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5440719143996742670L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private DefaultListModel<String> papers = new DefaultListModel<String>();
	private DefaultListModel<String> efforts = new DefaultListModel<String>();
	
	public ScholarInfoView(Scholar scholar) 
	{
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 11, 46, 14);
		getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(100, 8, 181, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText(scholar.getFullName());
		
		JLabel label = new JLabel("");
		label.setBounds(10, 36, 46, 14);
		getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("Institution:");
		lblNewLabel.setBounds(10, 51, 99, 14);
		getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(100, 48, 181, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setText(scholar.getInstitutions());
		
		JLabel lblResearchArea = new JLabel("Research Area:");
		lblResearchArea.setBounds(10, 91, 88, 14);
		getContentPane().add(lblResearchArea);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(100, 88, 181, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setText(scholar.getResearchAreas());
		
		JLabel lblPapers = new JLabel("Papers:");
		lblPapers.setBounds(10, 131, 46, 14);
		getContentPane().add(lblPapers);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(100, 131, 181, 80);
		getContentPane().add(scrollPane);
		for (Paper paper: scholar.getPapers())
		{
			papers.addElement(paper.getPaperTitle());
		}
		JList<String> list = new JList<String>(papers);
		scrollPane.setViewportView(list);
		
		JLabel lblNewLabel_1 = new JLabel("Efforts:");
		lblNewLabel_1.setBounds(10, 231, 46, 14);
		getContentPane().add(lblNewLabel_1);
		for (Effort effort: scholar.getEfforts())
		{
			efforts.addElement(effort.getOrganization());
		}
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(100, 244, 181, 80);
		getContentPane().add(scrollPane_1);
		
		JList<String> list2 = new JList<String>(efforts);
		scrollPane_1.setViewportView(list2);
	
		setBounds(100, 100, 400, 400);
		setVisible(true);
	}
}
