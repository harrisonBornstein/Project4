import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;


public class GraphListView extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();

	ScholarshipModel model;
	JButton okButton = new JButton("OK");
	JButton cancelButton = new JButton("Cancel");
	DefaultListModel<String> scholarListModel = new DefaultListModel<String>();
	List<Scholar> scholarList = new ArrayList<Scholar>();
	private JScrollPane scrollPane = new JScrollPane();
	JList list = new JList(scholarListModel);
	

	/**
	 * Creates the dialog.
	 */
	public GraphListView() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		
		scrollPane.setBounds(6, 6, 438, 227);
		contentPanel.add(scrollPane);
		scrollPane.setViewportView(list);
		
		
		
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
				
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	/**
	 * Fills the JList with authors from the model
	 */
	public void populateGraphList()
	{
		scholarListModel.clear();
		scholarList.clear();
		if (model.getScholars() != null)
			{
				
				for (int i = 0; i < model.getScholars().size(); i++)
				{
					
					scholarList.add(model.getScholars().get(i));
					scholarListModel.addElement((model.getScholars().get(i).getFullName()));
					
				}
			}
	}
	/**
	 * getter
	 * @return
	 */
	public JButton addGraphListOKButton()
	{
		return okButton;
	}
	/**
	 * getter
	 * @return
	 */
	public JButton addGraphListCancelButton()
	{
		return cancelButton;
	}
	/**
	 * getter
	 * @return
	 */
	public Scholar getScholar()
	{
		int index = list.getSelectedIndex();
		return scholarList.get(index);
	}
	/**
	 * 
	 */
	public void actionPerformed(ActionEvent e) 
	{
		
	}
	/**
	 * Makes the Graph List View an actionListener for the model
	 * @param newModel
	 */
	public void setModel(ScholarshipModel newModel)
	{
		this.model = newModel;
		
		if (model != null)
		{
			model.addActionListener(this);
			setVisible(true);
		}
	}
	
}
