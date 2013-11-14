import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

/*This class is almost a direct copy of JournalView*/
public class AddConferenceView extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	protected JTextField textField;
	protected JTextField textField_1;
	protected JTextField textField_2;
	protected JTextField textField_3;
	protected JTextField textField_4;
	protected JTextField textField_5;
	private JButton btnAddEditors = new JButton("Add Chairs");
	private JButton okButton = new JButton("OK");
	private JButton btnAddReviewers = new JButton("Add Members");
	private DefaultListModel<String> reviewerListModel = new DefaultListModel<String>();
	private DefaultListModel<String> reviewerListModelAdded = new DefaultListModel<String>();
	
	private ArrayList<Scholar> reviewerListScholars = new ArrayList<Scholar>();
	private ArrayList<Scholar> reviewerSelectedList = new ArrayList<Scholar>();
	private ArrayList<Scholar> editorListScholars = new ArrayList<Scholar>();
	private ArrayList<Scholar> editorSelectedList = new ArrayList<Scholar>();
	
	private DefaultListModel<String> editorListModel = new DefaultListModel<String>();
	private DefaultListModel<String> editorListModelAdded = new DefaultListModel<String>();
	
	private ScholarshipModel model;
	private JScrollPane scrollPane = new JScrollPane();
	JList reviewerList = new JList(reviewerListModel);
	JList editorList = new JList(editorListModel);
	JScrollPane scrollPane_2 = new JScrollPane();
	JScrollPane scrollPane_1 = new JScrollPane();
	JScrollPane scrollPane_3 = new JScrollPane();
	
	
	


	

	/**
	 * Creates the dialog.
	 */
	public AddConferenceView() {
		setBounds(100, 100, 714, 683);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblScholarName = new JLabel("Organization:");
		lblScholarName.setBounds(6, 27, 244, 16);
		contentPanel.add(lblScholarName);
		
		JLabel lblAffiliation = new JLabel("Location:");
		lblAffiliation.setBounds(6, 71, 102, 16);
		contentPanel.add(lblAffiliation);
		
		textField = new JTextField();
		textField.setBounds(120, 21, 227, 28);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 107, 227, 28);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(446, 21, 227, 28);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setBounds(42, 113, 61, 16);
		contentPanel.add(lblCountry);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(42, 190, 61, 16);
		contentPanel.add(lblCity);
		
		JLabel lblState = new JLabel("State:");
		lblState.setBounds(42, 153, 61, 16);
		contentPanel.add(lblState);
		
		textField_3 = new JTextField();
		textField_3.setBounds(120, 147, 227, 28);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(120, 184, 227, 28);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Year:");
		lblNewLabel.setBounds(392, 27, 61, 16);
		contentPanel.add(lblNewLabel);
		
		JLabel lblMonth = new JLabel("Month:");
		lblMonth.setBounds(381, 71, 61, 16);
		contentPanel.add(lblMonth);
		
		textField_5 = new JTextField();
		textField_5.setBounds(446, 65, 227, 28);
		contentPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblEditors = new JLabel("Chairs:");
		lblEditors.setBounds(6, 236, 61, 16);
		contentPanel.add(lblEditors);
		
		
		scrollPane.setBounds(57, 264, 273, 100);
		contentPanel.add(scrollPane);
		
		
		scrollPane.setViewportView(editorList);
		
		
		btnAddEditors.setBounds(57, 375, 117, 29);
		contentPanel.add(btnAddEditors);
		
		JLabel lblEditorsAdded = new JLabel("Chairs Added:");
		lblEditorsAdded.setBounds(346, 236, 92, 16);
		contentPanel.add(lblEditorsAdded);
		
		
		scrollPane_1.setBounds(421, 264, 273, 100);
		contentPanel.add(scrollPane_1);
		
		
		
		JLabel label = new JLabel("Members:");
		label.setBounds(10, 415, 73, 16);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("Members Added:");
		label_1.setBounds(351, 415, 131, 16);
		contentPanel.add(label_1);
		
		
		scrollPane_2.setBounds(57, 442, 273, 100);
		contentPanel.add(scrollPane_2);
		
		
		scrollPane_2.setViewportView(reviewerList);
		
		
		scrollPane_3.setBounds(421, 442, 273, 100);
		contentPanel.add(scrollPane_3);
		
	
		
		
		btnAddReviewers.setBounds(57, 553, 117, 29);
		contentPanel.add(btnAddReviewers);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	/**
	 * getter
	 * @return
	 */
	public JButton getAddEditorsButton()
	{
		return btnAddEditors;
	}
	/**
	 * getter
	 * @return
	 */
	public JButton getAddReviewersButton()
	{
		return btnAddReviewers;
	}
	/**
	 * getter
	 * @return
	 */
	public JButton getOKButton()
	{
		return okButton;
	}
	/**
	 * Fills the reviewer JList
	 */
	public void populateReviewerJList()
	{
		reviewerListModel.clear();
		editorListModel.clear();
		reviewerListScholars.clear();
		editorListScholars.clear();
		if (model.getScholars() != null)
		{
			
			for (int i = 0; i < model.getScholars().size(); i++)
			{
				editorListScholars.add(model.getScholars().get(i));
				reviewerListScholars.add(model.getScholars().get(i));
				reviewerListModel.addElement((model.getScholars().get(i).getFullName()));
				editorListModel.addElement((model.getScholars().get(i).getFullName()));
			}
		}	
	}
	/**
	 * 
	 */
	public void actionPerformed(ActionEvent e) {
		
			
		}	
	/**
	 * Makes the conferenceView an ActionListener
	 * @param newModel
	 */
	public void setModel(ScholarshipModel newModel)
	{
		this.model = newModel;
		
		if (model != null) {
			model.addActionListener(this);
			setVisible(true);
		}
	}
	/**
	 * Moves the selected editor to the other JList
	 */
	public void AddEditors()
	{
		editorSelectedList.add(editorListScholars.get(editorList.getSelectedIndex()));
		editorListModelAdded.addElement(editorList.getSelectedValue().toString());
		//reviewerListModel.remove(reviewerList.getSelectedIndex());
		JList list = new JList(editorListModelAdded);
		scrollPane_1.setViewportView(list);
		
		
	}
	/**
	 * Moves the selected reviewer to the other JList
	 */
	public void AddReviewers()
	{
		reviewerSelectedList.add(reviewerListScholars.get(reviewerList.getSelectedIndex()));
		reviewerListModelAdded.addElement(reviewerList.getSelectedValue().toString());
		//reviewerListModel.remove(reviewerList.getSelectedIndex());
		JList list_2 = new JList(reviewerListModelAdded);
		scrollPane_3.setViewportView(list_2);
	
	}
	/**
	 * getter
	 * @return
	 */
	public List<Scholar> getReviewers()
	{
		return reviewerSelectedList;
	}
	/**
	 * getter
	 * @return
	 */
	public List<Scholar> getEditors()
	{
		return editorSelectedList;
	}
	/**
	 * Clears the jLists
	 */
	public void clearView()
	{
		reviewerSelectedList.clear();
		editorSelectedList.clear();
		reviewerListModelAdded.clear();
		editorListModelAdded.clear();
		
	}
	
	
}

