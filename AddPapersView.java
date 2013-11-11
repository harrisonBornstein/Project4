import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;


public class AddPapersView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPapersView frame = new AddPapersView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
		
		JLabel label_5 = new JLabel("Journal Added:");
		label_5.setBounds(280, 145, 135, 15);
		panel.add(label_5);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(290, 168, 255, 188);
		panel.add(scrollPane_5);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(29, 433, 246, 188);
		panel.add(scrollPane_6);
		
		JLabel label_6 = new JLabel("Authors Added:");
		label_6.setBounds(280, 405, 110, 16);
		panel.add(label_6);
		
		JScrollPane scrollPane_7 = new JScrollPane();
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
		
		JButton btnAddJournal = new JButton("Add Journal");
		btnAddJournal.setBounds(25, 368, 117, 29);
		panel.add(btnAddJournal);
		
		JButton btnAddAuthors_1 = new JButton("Add Authors");
		btnAddAuthors_1.setBounds(25, 633, 117, 29);
		panel.add(btnAddAuthors_1);
		
		JButton btnAddButton = new JButton("Add Paper");
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
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblConferenceAdded = new JLabel("Conference Added:");
		lblConferenceAdded.setBounds(280, 139, 135, 15);
		panel_1.add(lblConferenceAdded);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(290, 162, 255, 188);
		panel_1.add(scrollPane_1);
		
		JList list_1 = new JList();
		scrollPane_1.setViewportView(list_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(29, 427, 246, 188);
		panel_1.add(scrollPane_2);
		
		JList list_2 = new JList();
		scrollPane_2.setViewportView(list_2);
		
		JLabel lblAuthorsAdded = new JLabel("Authors Added:");
		lblAuthorsAdded.setBounds(280, 399, 110, 16);
		panel_1.add(lblAuthorsAdded);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(299, 427, 246, 188);
		panel_1.add(scrollPane_3);
		
		JList list_3 = new JList();
		scrollPane_3.setViewportView(list_3);
		
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
		
		JButton btnAddConference = new JButton("Add Conference");
		btnAddConference.setBounds(29, 358, 155, 29);
		panel_1.add(btnAddConference);
		
		JButton btnAddAuthors = new JButton("Add Authors");
		btnAddAuthors.setBounds(22, 627, 162, 29);
		panel_1.add(btnAddAuthors);
		
		JButton btnAddPaper = new JButton("Add Paper");
		btnAddPaper.setBounds(390, 696, 155, 29);
		panel_1.add(btnAddPaper);
	}

}
