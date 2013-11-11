import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class AddScholarView extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	

	/**
	 * Create the dialog.
	 */
	public AddScholarView() {
		setBounds(100, 100, 450, 203);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblScholarName = new JLabel("Scholar Name:");
		lblScholarName.setBounds(6, 27, 102, 16);
		contentPanel.add(lblScholarName);
		
		JLabel lblAffiliation = new JLabel("Affiliation:");
		lblAffiliation.setBounds(6, 71, 102, 16);
		contentPanel.add(lblAffiliation);
		{
			JLabel lblResearchAreas = new JLabel("Research Areas:");
			lblResearchAreas.setBounds(6, 111, 102, 16);
			contentPanel.add(lblResearchAreas);
		}
		
		textField = new JTextField();
		textField.setBounds(120, 21, 227, 28);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 65, 227, 28);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 105, 227, 28);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
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
