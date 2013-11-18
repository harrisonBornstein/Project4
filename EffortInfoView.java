import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JScrollPane;


public class EffortInfoView extends JDialog 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8775223475096348476L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	private DefaultListModel<String> leaders = new DefaultListModel<String>();
	private DefaultListModel<String> helpers = new DefaultListModel<String>();
	
	public EffortInfoView(Effort effort) 
	{
		getContentPane().setLayout(null);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(10, 11, 46, 14);
		getContentPane().add(lblType);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(100, 8, 150, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblOrganization = new JLabel("Organization:");
		lblOrganization.setBounds(10, 36, 77, 14);
		getContentPane().add(lblOrganization);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(100, 33, 150, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setBounds(10, 61, 77, 14);
		getContentPane().add(lblCountry);
		
		JLabel lblState = new JLabel("State:");
		lblState.setBounds(10, 86, 46, 14);
		getContentPane().add(lblState);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(10, 111, 46, 14);
		getContentPane().add(lblCity);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(100, 58, 150, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(100, 83, 150, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(100, 108, 150, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(260, 11, 46, 14);
		getContentPane().add(lblDate);
		
		JLabel lblYear = new JLabel("Year:");
		lblYear.setBounds(270, 36, 46, 14);
		getContentPane().add(lblYear);
		
		JLabel lblMonth = new JLabel("Month: ");
		lblMonth.setBounds(280, 61, 46, 14);
		getContentPane().add(lblMonth);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(326, 33, 150, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(336, 58, 140, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblEditors = new JLabel("Editors:");
		lblEditors.setBounds(10, 160, 77, 14);
		getContentPane().add(lblEditors);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(102, 160, 148, 100);
		getContentPane().add(scrollPane);
		
		JLabel lblReviewers = new JLabel("Reviewers:");
		lblReviewers.setBounds(260, 160, 86, 14);
		getContentPane().add(lblReviewers);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(326, 160, 150, 100);
		getContentPane().add(scrollPane_1);
		
		if (effort.getType().equals("Journal"))
		{
			Journal journal = (Journal) effort;
			Issue issue = journal.getVolumes().get(0).getIssues().get(0);
			textField.setText(journal.getType());
			textField_1.setText(journal.getOrganization());
			textField_2.setText(journal.getLocation().getCountry());
			textField_3.setText(journal.getLocation().getState());
			textField_4.setText(journal.getLocation().getCity());
			textField_5.setText(issue.getYear());
			textField_6.setText(issue.getMonth());
			for (Scholar leader: issue.getEditors())
			{
				leaders.addElement(leader.getFullName());
			}
			for (Scholar helper: issue.getReviewers())
			{
				helpers.addElement(helper.getFullName());
			}
		}
		else
		{
			Conference con = (Conference) effort;
			Meeting meeting = con.getMeetings().get(0);
			textField.setText(con.getType());
			textField_1.setText(con.getOrganization());
			textField_2.setText(meeting.getLocation().getCountry());
			textField_3.setText(meeting.getLocation().getState());
			textField_4.setText(meeting.getLocation().getCity());
			textField_5.setText(meeting.getYear());
			textField_6.setText(meeting.getMonth());
			for (Scholar leader: meeting.getChairs())
			{
				leaders.addElement(leader.getFullName());
			}
			for (Scholar helper: meeting.getMembers())
			{
				helpers.addElement(helper.getFullName());
			}
			lblEditors.setText("Chairs");
			lblReviewers.setText("Members");
		}
		
		JList<String> list = new JList<String>(leaders);
		scrollPane.setViewportView(list);
		
		JList<String> list2 = new JList<String>(helpers);
		scrollPane_1.setViewportView(list2);
		
		setBounds(100, 100, 550, 325);
		setVisible(true);
	}
}
