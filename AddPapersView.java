import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;


public class AddPapersView extends JFrame implements ActionListener {

	private JPanel contentPane;
	 JTextField textField;
	 JTextField textField_1;
	JTextField textField_2;
	JTextField textField_3;
	 JTextField textField_4;
	 JTextField textField_5;
	 ScholarshipModel model;

	private JButton btnAddJournal = new JButton("Add Journal");
	private JButton btnAddAuthors_1 = new JButton("Add Authors");
	private JButton btnAddButton = new JButton("Add Paper");
	
	private JButton btnAddConference = new JButton("Add Conference");
	private JButton btnAddAuthors = new JButton("Add Authors");
	private JButton btnAddPaper = new JButton("Add Paper");
	
	private JScrollPane scrollPane_1 = new JScrollPane();
	private JScrollPane scrollPane_5 = new JScrollPane();
	private JScrollPane scrollPane_7 = new JScrollPane();
	private JScrollPane scrollPane_3 = new JScrollPane();
	
	DefaultListModel<String> journalAuthorListModel = new DefaultListModel<String>();
	DefaultListModel<String> conferenceAuthorListModel = new DefaultListModel<String>();
	DefaultListModel<String> journalAuthorListModelAdded = new DefaultListModel<String>();
	DefaultListModel<String> conferenceAuthorListModelAdded = new DefaultListModel<String>();
	
	DefaultListModel<String> journalSerialListModel = new DefaultListModel<String>();
	DefaultListModel<String> conferenceSerialListModel = new DefaultListModel<String>();
	
	DefaultListModel<String> journalSerialListModelAdded = new DefaultListModel<String>();
	DefaultListModel<String> conferenceSerialListModelAdded = new DefaultListModel<String>();
	
	
	
	
	ArrayList<Journal> journalSelectedListSerial = new ArrayList<Journal>();
	ArrayList<Conference> conferenceSelectedListSerial = new ArrayList<Conference>();
	
	ArrayList<Scholar> journalSelectedListScholar = new ArrayList<Scholar>();
	ArrayList<Scholar> conferenceSelectedListScholar = new ArrayList<Scholar>();
	
	ArrayList<Scholar> journalListScholar = new ArrayList<Scholar>();
	ArrayList<Scholar> conferenceListScholar = new ArrayList<Scholar>();
	private List<Conference> viewConferences = new ArrayList<Conference>();
	private List<Journal> viewJournals = new ArrayList<Journal>();
	
	JList journalList = new JList(journalAuthorListModel);
	JList conferenceList = new JList(conferenceAuthorListModel);
	JList journalSerialList = new JList(journalSerialListModel);
	JList conferenceSerialList = new JList(conferenceSerialListModel);
	
	
	public JButton getAddJournalButton()
	{
		return btnAddJournal;
	}
	
	public JButton getAddJournalArticleAuthorsButton()
	{
		return btnAddAuthors_1;
	}
	
	public JButton getAddJournalArticleButton()
	{
		return btnAddButton;
	}
	
	public JButton getAddConferenceButton()
	{
		return btnAddConference;
	}
	
	public JButton getAddConPaperAuthorsButton()
	{
		return btnAddAuthors;
	}
	
	public JButton getAddConPaperButton()
	{
		return btnAddPaper;
	}
	/**
	 * Create the frame.
	 */
	public AddPapersView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 809);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Journal", null, panel, null);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Paper Title:");
		label.setBounds(6, 12, 110, 16);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Pages:");
		label_1.setBounds(6, 40, 52, 16);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Authors:");
		label_2.setBounds(6, 405, 61, 16);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Journal:");
		label_3.setBounds(6, 144, 97, 16);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("URL:");
		label_4.setBounds(6, 68, 61, 16);
		panel.add(label_4);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(29, 168, 246, 188);
		panel.add(scrollPane_4);
		scrollPane_4.setViewportView(journalSerialList);
		
		
		JLabel label_5 = new JLabel("Journal Added:");
		label_5.setBounds(280, 145, 135, 15);
		panel.add(label_5);
		
		
		scrollPane_5.setBounds(290, 168, 255, 188);
		panel.add(scrollPane_5);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(29, 433, 246, 188);
		panel.add(scrollPane_6);
		scrollPane_6.setViewportView(journalList);
		
		JLabel label_6 = new JLabel("Authors Added:");
		label_6.setBounds(280, 405, 110, 16);
		panel.add(label_6);
		
		
		scrollPane_7.setBounds(299, 433, 246, 188);
		panel.add(scrollPane_7);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(83, 6, 134, 28);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(83, 34, 134, 28);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(83, 62, 134, 28);
		panel.add(textField_5);
		
		
		btnAddJournal.setBounds(25, 368, 117, 29);
		panel.add(btnAddJournal);
		
		
		btnAddAuthors_1.setBounds(25, 633, 117, 29);
		panel.add(btnAddAuthors_1);
		
		
		btnAddButton.setBounds(428, 696, 117, 29);
		panel.add(btnAddButton);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Conference", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblPaperTitle = new JLabel("Paper Title:");
		lblPaperTitle.setBounds(6, 6, 110, 16);
		panel_1.add(lblPaperTitle);
		
		JLabel lblPages = new JLabel("Pages:");
		lblPages.setBounds(6, 34, 52, 16);
		panel_1.add(lblPages);
		
		JLabel lblAuthors = new JLabel("Authors:");
		lblAuthors.setBounds(6, 399, 61, 16);
		panel_1.add(lblAuthors);
		
		JLabel lblConferences = new JLabel("Conference:");
		lblConferences.setBounds(6, 138, 97, 16);
		panel_1.add(lblConferences);
		
		JLabel lblUrl = new JLabel("URL:");
		lblUrl.setBounds(6, 62, 61, 16);
		panel_1.add(lblUrl);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 162, 246, 188);
		panel_1.add(scrollPane);
		scrollPane.setViewportView(conferenceSerialList);
		
		JLabel lblConferenceAdded = new JLabel("Conference Added:");
		lblConferenceAdded.setBounds(280, 139, 135, 15);
		panel_1.add(lblConferenceAdded);
		
	
		scrollPane_1.setBounds(290, 162, 255, 188);
		panel_1.add(scrollPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(29, 427, 246, 188);
		panel_1.add(scrollPane_2);
		scrollPane_2.setViewportView(conferenceList);
		
		JLabel lblAuthorsAdded = new JLabel("Authors Added:");
		lblAuthorsAdded.setBounds(280, 399, 110, 16);
		panel_1.add(lblAuthorsAdded);
		
		
		scrollPane_3.setBounds(299, 427, 246, 188);
		panel_1.add(scrollPane_3);
		
		textField = new JTextField();
		textField.setBounds(83, 0, 134, 28);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83, 28, 134, 28);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(83, 56, 134, 28);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		
		btnAddConference.setBounds(29, 358, 155, 29);
		panel_1.add(btnAddConference);
		
		
		btnAddAuthors.setBounds(22, 627, 162, 29);
		panel_1.add(btnAddAuthors);
		
		
		btnAddPaper.setBounds(390, 696, 155, 29);
		panel_1.add(btnAddPaper);
	}
	public void clear()
	{
		 textField.setText("");
		  textField_1.setText("");
		 textField_2.setText("");
		 textField_3.setText("");
		  textField_4.setText("");
		  textField_5.setText("");
			journalAuthorListModel.clear();
			journalListScholar.clear();
			conferenceListScholar.clear();
			conferenceAuthorListModel.clear();
			journalSerialListModel.clear();
			conferenceSerialListModel.clear();
			viewConferences.clear();
			viewJournals.clear();
			conferenceSelectedListScholar.clear();
			journalSelectedListScholar.clear();
			conferenceSelectedListSerial.clear();
			journalSelectedListSerial.clear();
	}
	public List<Scholar> getJournalAuthors()
	{
		return journalSelectedListScholar;
	}
	
	public List<Journal> getJournals()
	{
		return journalSelectedListSerial;
	}
	
	public List<Scholar> getConferenceAuthors()
	{
		return conferenceSelectedListScholar;
	}
	
	public List<Conference> getConferences()
	{
		return conferenceSelectedListSerial;
	}
	
	public void setModel(ScholarshipModel newModel)
	{
		this.model = newModel;
		
		if (model != null)
		{
			model.addActionListener(this);
			setVisible(true);
		}
	}

	public void populateAuthorsJList()
	{
		journalAuthorListModel.clear();
		journalListScholar.clear();
		conferenceListScholar.clear();
		conferenceAuthorListModel.clear();
		

		if (model.getScholars() != null)
		{
			
			for (int i = 0; i < model.getScholars().size(); i++)
			{
				journalListScholar.add(model.getScholars().get(i));
				conferenceListScholar.add(model.getScholars().get(i));
				journalAuthorListModel.addElement((model.getScholars().get(i).getFullName()));	
				conferenceAuthorListModel.addElement((model.getScholars().get(i).getFullName()));	
			}
		}	
	}
	
	public void populateSerialsJlist()
	{
		journalSerialListModel.clear();
		conferenceSerialListModel.clear();
		viewConferences.clear();
		viewJournals.clear();
		if (!model.getConferences().isEmpty())
		{
			for (int i = 0; i < model.getConferences().size(); i++)
			{
		
					viewConferences.add(model.getConferences().get(i));			
			}
		}
		if(!model.getJournals().isEmpty())
		{
			for(int i =0; i< model.getJournals().size();++i)
			{
					viewJournals.add(model.getJournals().get(i));
				
			}
		}
		if(!viewConferences.isEmpty())
		{
			for(int i=0; i< viewConferences.size();++i)
			{
				conferenceSerialListModel.addElement(viewConferences.get(i).getOrganization());
		
				
			}
		}
		if(!viewJournals.isEmpty())
		{
			for(int i=0; i< viewJournals.size();++i)
			{
				journalSerialListModel.addElement(viewJournals.get(i).getOrganization());
			}
		}
	}
	
	public void addJournals()
	{
		journalSelectedListSerial.add(viewJournals.get(journalSerialList.getSelectedIndex()));
		journalSerialListModelAdded.addElement(journalSerialList.getSelectedValue().toString());
		
		
		JList list = new JList(journalSerialListModelAdded);
	
		
		scrollPane_5.setViewportView(list);
		
	}
	public void addConferences()
	{
		conferenceSelectedListSerial.add(viewConferences.get(conferenceSerialList.getSelectedIndex()));
		conferenceSerialListModelAdded.addElement(conferenceSerialList.getSelectedValue().toString());
		
		JList list = new JList(conferenceSerialListModelAdded);
		scrollPane_1.setViewportView(list);
		System.out.println("check2");
	}
	
	public void addJournalAuthors()
	{
		journalSelectedListScholar.add(journalListScholar.get(journalList.getSelectedIndex()));
		journalAuthorListModelAdded.addElement(journalList.getSelectedValue().toString());
		
		
		//reviewerListModel.remove(reviewerList.getSelectedIndex());
		JList list = new JList(journalAuthorListModelAdded);
	
		
		scrollPane_7.setViewportView(list);
	}
	
	public void addConferenceAuthors()
	{
		conferenceSelectedListScholar.add(conferenceListScholar.get(conferenceList.getSelectedIndex()));
		conferenceAuthorListModelAdded.addElement(conferenceList.getSelectedValue().toString());
		
		
		//reviewerListModel.remove(reviewerList.getSelectedIndex());
		JList list = new JList(conferenceAuthorListModelAdded);
	
		
		scrollPane_3.setViewportView(list);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
