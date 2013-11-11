import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;


public class AddConferenceView extends JDialog {


	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the dialog.
	 */
	public AddConferenceView() {
		setBounds(100, 100, 719, 848);
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
		{
			JLabel lblResearchAreas = new JLabel("Issue:");
			lblResearchAreas.setBounds(395, 27, 102, 16);
			contentPanel.add(lblResearchAreas);
		}
		
		textField = new JTextField();
		textField.setBounds(120, 21, 227, 28);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 107, 227, 28);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(491, 49, 227, 28);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setBounds(42, 113, 61, 16);
		contentPanel.add(lblCountry);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(42, 153, 61, 16);
		contentPanel.add(lblCity);
		
		JLabel lblState = new JLabel("State:");
		lblState.setBounds(42, 190, 61, 16);
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
		lblNewLabel.setBounds(446, 55, 61, 16);
		contentPanel.add(lblNewLabel);
		
		JLabel lblMonth = new JLabel("Month:");
		lblMonth.setBounds(446, 88, 61, 16);
		contentPanel.add(lblMonth);
		
		textField_5 = new JTextField();
		textField_5.setBounds(491, 82, 227, 28);
		contentPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblEditors = new JLabel("Editors:");
		lblEditors.setBounds(6, 236, 61, 16);
		contentPanel.add(lblEditors);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(57, 264, 273, 198);
		contentPanel.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnAdd = new JButton("Add Chairs");
		btnAdd.setBounds(61, 469, 117, 29);
		contentPanel.add(btnAdd);
		
		JLabel lblEditorsAdded = new JLabel("Chairs Added:");
		lblEditorsAdded.setBounds(346, 236, 92, 16);
		contentPanel.add(lblEditorsAdded);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(421, 264, 273, 198);
		contentPanel.add(scrollPane_1);
		
		JList list_2 = new JList();
		scrollPane_1.setViewportView(list_2);
		
		JLabel label = new JLabel("Members:");
		label.setBounds(6, 501, 73, 16);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("Members Added:");
		label_1.setBounds(346, 501, 123, 16);
		contentPanel.add(label_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(57, 527, 273, 198);
		contentPanel.add(scrollPane_2);
		
		JList list_1 = new JList();
		scrollPane_2.setViewportView(list_1);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(421, 529, 273, 198);
		contentPanel.add(scrollPane_3);
		
		JList list_3 = new JList();
		scrollPane_3.setViewportView(list_3);
		
		JButton btnAddReviewers = new JButton("Add Members");
		btnAddReviewers.setBounds(61, 737, 117, 29);
		contentPanel.add(btnAddReviewers);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
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
}
