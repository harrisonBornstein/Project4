import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class PaperInfoView extends JDialog
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8398989475698098660L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	private DefaultListModel<String> authors = new DefaultListModel<String>();
	
	/**
	 * creates a display window with the data from paper
	 * @param paper
	 */
	public PaperInfoView(Paper paper) 
	{
		getContentPane().setLayout(null);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setBounds(10, 11, 67, 14);
		getContentPane().add(lblType);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(10, 36, 67, 14);
		getContentPane().add(lblTitle);
		
		JLabel lblPages = new JLabel("Pages:");
		lblPages.setBounds(10, 61, 67, 14);
		getContentPane().add(lblPages);
		
		JLabel lblUrl = new JLabel("Url:");
		lblUrl.setBounds(10, 86, 46, 14);
		getContentPane().add(lblUrl);
		
		JLabel lblSerial = new JLabel("Serial:");
		lblSerial.setBounds(10, 111, 46, 14);
		getContentPane().add(lblSerial);
		
		JLabel lblAuthors = new JLabel("Authors:");
		lblAuthors.setBounds(10, 136, 46, 14);
		getContentPane().add(lblAuthors);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(66, 150, 150, 100);
		getContentPane().add(scrollPane);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(66, 8, 150, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(66, 36, 150, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(66, 61, 150, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(66, 86, 150, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(66, 111, 150, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		if (paper.getType().equals("Conference Paper"))
		{
			ConPaper conPaper = (ConPaper) paper;
			textField.setText("Conference Paper");
			textField_1.setText(conPaper.getPaperTitle());
			textField_2.setText("N/A");
			textField_3.setText(conPaper.getUrl());
			textField_4.setText(conPaper.getCon().getOrganization());
			for (Scholar author: conPaper.getAuthors())
			{
				authors.addElement(author.getFullName());
			}
		}
		else
		{
			JournalArticle article = (JournalArticle) paper;
			textField.setText("Journal Article");
			textField_1.setText(article.getPaperTitle());
			textField_2.setText(article.getPages());
			textField_3.setText(article.getUrl());
			textField_4.setText(article.getJournal().getOrganization());
			for (Scholar author: article.getAuthors())
			{
				authors.addElement(author.getFullName());
			}
		}
		
		JList<String> list = new JList<String>(authors);
		scrollPane.setViewportView(list);
		
		setBounds(100, 100, 250, 300);
		setVisible(true);
		
	}

}
