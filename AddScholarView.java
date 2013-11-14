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
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	private JButton okButton = new JButton("OK");
	

	/**
	 * Creates the dialog.
	 */
	public AddScholarView() 
	{
		setBounds(100, 100, 406, 334);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblScholarName = new JLabel("Scholar Name:");
		lblScholarName.setBounds(6, 27, 102, 16);
		contentPanel.add(lblScholarName);
		
		JLabel lblAffiliation = new JLabel("Institutions:");
		lblAffiliation.setBounds(6, 164, 102, 16);
		contentPanel.add(lblAffiliation);
		{
			JLabel lblResearchAreas = new JLabel("Research Areas:");
			lblResearchAreas.setBounds(6, 208, 102, 16);
			contentPanel.add(lblResearchAreas);
		}
		
		textField = new JTextField();
		textField.setBounds(101, 59, 246, 28);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(82, 158, 265, 28);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 202, 227, 28);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPrimaryName = new JLabel("Primary Name:");
		lblPrimaryName.setBounds(6, 65, 102, 16);
		contentPanel.add(lblPrimaryName);
		
		JLabel lblSecondaryName = new JLabel("Secondary Name:");
		lblSecondaryName.setBounds(6, 95, 132, 16);
		contentPanel.add(lblSecondaryName);
		
		textField_3 = new JTextField();
		textField_3.setBounds(120, 89, 227, 28);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);
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
	public JButton getOkButton()
	{
		return okButton;
	}
	
	
}
