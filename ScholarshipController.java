
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;




public class ScholarshipController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4141519858294432244L;

	private ScholarshipModel model;
	private ScholarshipView view;
	private AddScholarView scholarView;
	private AddJournalView journalView;
	private AddConferenceView conferenceView;
	private AddPapersView papersView;
	private GraphListView graphListView;
	private GraphView graphView;
	private String graph;
	/**
	 * Listener for JMenu Item Export. Exports the model as a binary file.
	 *
	 */
	private class ExportBinaryListener implements ActionListener{ 

		public void actionPerformed(ActionEvent e)
		{
			try {
				String fileName = JOptionPane.showInputDialog ("Please input a name for the file"); 
				FileOutputStream fileOutputStream = new FileOutputStream(fileName);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
				objectOutputStream.writeObject(model);
				objectOutputStream.close();
			} catch (HeadlessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	/**
	 * Listener for JMenu Item Import. Imports the model as a binary file.
	 *
	 */
	private class ImportBinaryListener implements ActionListener{ 

		public void actionPerformed(ActionEvent e)
		{
			String fileName ="";
			ScholarshipModel model = new ScholarshipModel();
			 JFileChooser fileChooser = new JFileChooser();
			 if (fileChooser.showOpenDialog(null)
				        == JFileChooser.APPROVE_OPTION) 
			 {
				      // Get the selected file
				      java.io.File file = fileChooser.getSelectedFile();
				     fileName = file.getName();
			 }
			 
			try {
				FileInputStream fileInputStream = new FileInputStream(fileName);
					ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
					model = (ScholarshipModel) objectInputStream.readObject();
					objectInputStream.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				view.setModel(model);
				setModel(model);
				
		}
	}
	/**
	 * Listener for the button press for the JmenuItem
	 * @author harrib
	 *
	 */
	private class TypeOfPublicationListener implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			graphListView = new GraphListView();
			graphListView.addGraphListOKButton().addActionListener(new GraphListOkListener());
			graphListView.setModel(model);
			graphListView.populateGraphList();
			graph = "Type of Publication";
		}
	}

	/**
	 * Listener for the button press for the JmenuItem
	 * @author harrib
	 *
	 */
	private class PublicationsPerYearListener implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			graphListView = new GraphListView();
			graphListView.addGraphListOKButton().addActionListener(new GraphListOkListener());
			graphListView.setModel(model);
			graphListView.populateGraphList();
			graph = "Publications per Year";
		}
	}
	

	/**
	 * Listener for the button press for the JmenuItem
	 *
	 */
	private class ConferencePapersPerYearListener implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			graphListView = new GraphListView();
			graphListView.addGraphListOKButton().addActionListener(new GraphListOkListener());
			graphListView.setModel(model);
			graphListView.populateGraphList();
			graph = "Conference Papers per Year";
		}
	}
	

	/**
	 * Listener for the button press for the JmenuItem
	 *
	 */
	private class JournalArticlesPerYearListener implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			graphListView = new GraphListView();
			graphListView.addGraphListOKButton().addActionListener(new GraphListOkListener());
			graphListView.setModel(model);
			graphListView.populateGraphList();
			graph = "Journal Articles per Year";
		}
	}

	/**
	 * Listener for the button press for the JmenuItem
	 *
	 */
	private class CoAuthorsListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			graphListView = new GraphListView();
			graphListView.addGraphListOKButton().addActionListener(new GraphListOkListener());
			graphListView.setModel(model);
			graphListView.populateGraphList();
			graph = "CoAuthors";
		}
	}
	/**
	 * Listener for the button press for the OK button in graphList
	 *
	 */
	private class GraphListOkListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) 
		{
			Scholar newScholar = graphListView.getScholar();
			int index = model.getScholars().indexOf(newScholar);
			graphView = new GraphView(index, graph);
			graphView.setModel(model);
			model.removeActionListener(graphListView);
			graphListView.dispose();
		}
		
	}
	/**
	 * Listener for the scholar cancel button
	 *
	 */
	private class AddScholarCancelListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			scholarView.dispose();
		}
	}
	/**
	 * Listener for the AddScholar button
	 *
	 */
	private class AddScholarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) 
		{
			scholarView = new AddScholarView();
			scholarView.getOkButton().addActionListener(new AddScholarDialogListener());
			scholarView.getCancelButton().addActionListener(new AddScholarCancelListener());
			scholarView.setVisible(true);
		}
		
	}
	/**
	 * Listener for the delete scholar button
	 *
	 */
	private class DeleteScholarListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			Scholar newScholar = new Scholar();
			int index = view.scholarList.getSelectedIndex();
			newScholar = model.getScholars().get(index);
			model.removeScholar(newScholar);
		}
	}
	/**
	 * Listener for the deleteAll scholar button
	 *
	 */
	private class DeleteAllScholarsListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) 
		{
			List<Scholar> scholarList = new ArrayList<Scholar>();
			for (Scholar scholar: model.getScholars())
			{
				scholarList.add(scholar);
			}
			for (Scholar scholar: scholarList)
			{
				model.removeScholar(scholar);
			}
		}
		
	}
	/**
	 * Listener for the journal view cancel button
	 *
	 */
	private class AddJournalCancelListener implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			journalView.dispose();
		}
	}
	/**
	 * Listener for the conference view cancel button
	 *
	 */
	private class AddConferenceCancelListener implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
			conferenceView.dispose();
		}
	}
	/**
	 * Listener for the add serial button
	 *
	 */
	private class AddSerialListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			String optionPane = "Journal or Conference";
			String[] options = {"Cancel", "Journal", "Conference"};
			int response = JOptionPane.showOptionDialog(null, optionPane, "Please Choose A Serial", JOptionPane.PLAIN_MESSAGE, 1, null, options, options[0]);
			if(response == 1)
			{
				journalView = new AddJournalView();
				journalView.setModel(model);
				journalView.populateReviewerJList();
				
				journalView.getOKButton().addActionListener(new AddJournalListener());
				journalView.getAddEditorsButton().addActionListener(new AddJournalEditorsListener());
				journalView.getAddReviewersButton().addActionListener(new AddJournalReviewersListener());
				journalView.getCancelButton().addActionListener(new AddJournalCancelListener());
			}	
			else if(response == 2)
			{
				conferenceView = new AddConferenceView();
				
				conferenceView.setModel(model);
				conferenceView.populateReviewerJList();
				
				conferenceView.getOKButton().addActionListener(new AddConferenceListener());
				conferenceView.getAddEditorsButton().addActionListener(new AddConferenceChairsListener());
				conferenceView.getAddReviewersButton().addActionListener(new AddConferenceMembersListener());
				conferenceView.getCancelButton().addActionListener(new AddConferenceCancelListener());
			}
			
				
			
		}
		
	}
	/**
	 * Listener for the delete serial button
	 *
	 */
	private class DeleteSerialListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) 
		{
			int index = view.serialList.getSelectedIndex();
			Effort effort = view.getEfforts().get(index);
			if (effort.getType().equals("Journal"))
			{
				Journal journal = (Journal) effort;
				model.removeJournal(journal);
			}
			else
			{
				Conference con = (Conference) effort;
				model.removeConference(con);
			}
		}
		
	}
	/**
	 * Listener for the delete all serials button
	 *
	 */
	private class DeleteAllSerialsListener implements ActionListener
	{	
		public void actionPerformed(ActionEvent e) 
		{
			List<Journal> journals = new ArrayList<Journal>();
			for (Journal journal: model.getJournals())
			{
				journals.add(journal);
			}
			List<Conference> conferences = new ArrayList<Conference>();
			for (Conference conference: model.getConferences())
			{
				conferences.add(conference);
			}
			for (Journal journal: journals)
			{
				model.removeJournal(journal);
			}
			for (Conference conference: conferences)
			{
				model.removeConference(conference);
			}	
		}
	}
	/**
	 * Listener for the cancel buttons
	 * @author harrib
	 *
	 */
	private class AddPaperCancelListener implements ActionListener {
		
	

		public void actionPerformed(ActionEvent e) 
		{	
			papersView.dispose();
		}
	}
	/**
	 * Listener for add Paper button
	 *
	 */
	private class AddPaperListener implements ActionListener {

		public void actionPerformed(ActionEvent e) 
		{	
			papersView = new AddPapersView();
			papersView.setModel(model);
			
			papersView.getAddJournalButton().addActionListener(new AddJournalArticleJournalListener());
			papersView.getAddJournalArticleAuthorsButton().addActionListener(new AddJournalArticleScholarListener());
			papersView.getAddJournalArticleButton().addActionListener(new AddJournalArticleListener());
			
			papersView.getAddConferenceButton().addActionListener(new AddConferencePaperConferenceListener());
			papersView.getAddConPaperAuthorsButton().addActionListener(new AddConferencePaperScholarListener());
			papersView.getAddConPaperButton().addActionListener(new AddConferencePaperListener());
			papersView.getJournalCancelButton().addActionListener(new AddPaperCancelListener());
			papersView.getConferenceCancelButton().addActionListener(new AddPaperCancelListener());
			
			papersView.populateAuthorsJList();
			papersView.populateSerialsJlist();
		}
		
	}
	/**
	 * Listener for the delete paper button
	 *
	 */
	private class DeletePaperListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			int index = view.paperList.getSelectedIndex();
			String type = view.getPapers().get(index).getType();
			if(type.equals("Journal"))
			{
				Paper paper = new JournalArticle();
				paper = view.getPapers().get(index);
				model.removePaper(paper);
			}
			else
			{
				Paper paper = new ConPaper();
				paper = view.getPapers().get(index);
				model.removePaper(paper);
				
			}
			
		}
		
	}
	/**
	 * listener for the delete all papers button
	 *
	 */
	private class DeleteAllPapersListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			List<Paper> paperList = new ArrayList<Paper>();
			for (Paper paper: model.getPapers())
			{
				paperList.add(paper);
			}
			for (Paper paper: paperList)
			{
				model.removePaper(paper);
			}
		}
		
	}
	/**
	 * Listener for the add scholar button
	 *
	 */
	private class AddScholarDialogListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) 
		{
			String primaryName = scholarView.textField.getText();
			String secondaryName = scholarView.textField_3.getText();
			String affiliation = scholarView.textField_1.getText();
			String researchAreas = scholarView.textField_2.getText();
			String fullName = secondaryName + ", " + primaryName;
			model.addScholar(new Scholar(fullName, secondaryName,primaryName, affiliation,researchAreas));
			scholarView.dispose();
		}
		
	}
	/**
	 * Listener for add journal article button
	 *
	 */
	private class AddJournalArticleJournalListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			papersView.addJournals();
		}
		
	}
	/**
	 * Listener for the add journal article scholar
	 *
	 */
	private class AddJournalArticleScholarListener implements ActionListener{
	
			
			public void actionPerformed(ActionEvent e) {
				
				papersView.addJournalAuthors();
			}
			
		}
	/**
	 * Listener for add journal article button
	 *
	 */
	private class AddJournalArticleListener implements ActionListener{
	
		
		public void actionPerformed(ActionEvent e) 
		{
			
			String paperTitle = papersView.textField_3.getText();
			String pages = papersView.textField_4.getText();
			String url = papersView.textField_5.getText();
			List<Scholar> authors = papersView.getJournalAuthors();
			Journal journal = papersView.getJournals().get(0);
			JournalArticle paper = new JournalArticle(authors,paperTitle,pages,url,journal);
			for (Scholar author: authors)
			{
				author.addToPapers(paper);
			}
			journal.getVolumes().get(0).getIssues().get(0).addToArticles(paper);
			model.addPaper(paper);
			
			model.removeActionListener(papersView);
			papersView.dispose();
		}
		
	}
	/**
	 * Listener for add conference paper button
	 *
	 */
	private class AddConferencePaperScholarListener implements ActionListener{
	
		
		public void actionPerformed(ActionEvent e) {
			
			papersView.addConferenceAuthors();
			
		}
		
	}
	/**
	 * Listener for add conference button 
	 *
	 */
	private class AddConferencePaperConferenceListener implements ActionListener{
	
		
		public void actionPerformed(ActionEvent e) {
			
			papersView.addConferences();

		}
		
	}
	/**
	 * listener for the add conference paper button
	 *
	 */
	private class AddConferencePaperListener implements ActionListener{
	
		
		public void actionPerformed(ActionEvent e) {
			
			List<Scholar> authors = papersView.getConferenceAuthors();
			String paperTitle = papersView.textField.getText();
			String pages = papersView.textField_1.getText();
			String url = papersView.textField_2.getText();
			Conference conference = papersView.getConferences().get(0);
			ConPaper paper = new ConPaper(authors, paperTitle,pages,url,conference);
			for (Scholar author: authors)
			{
				author.addToPapers(paper);
			}
			conference.getMeetings().get(0).addToConPapers(paper);
			model.addPaper(paper);
			
			model.removeActionListener(papersView);
			papersView.dispose();
			
		}
		
	}
	/**
	 * Listener for the add journal button
	 *
	 */
	private class AddJournalListener implements ActionListener{
	
		
		public void actionPerformed(ActionEvent e) {
			String organization = journalView.textField.getText();
			String country = journalView.textField_1.getText();
			String state = journalView.textField_3.getText();
			String city = journalView.textField_4.getText();
			Location newLocation = new Location(country, state, city);
			String year = journalView.textField_2.getText();
			String month = journalView.textField_5.getText();
			List<Scholar> reviewers = journalView.getReviewers();
			List<Scholar> editors = journalView.getEditors();
			List<JournalArticle> journals = new ArrayList<JournalArticle>();
			Issue newIssue = new Issue(month,year,editors,reviewers,journals);
			ArrayList<Issue> issues = new ArrayList<Issue>();
			issues.add(newIssue);
			Volume newVolume = new Volume(issues);
			ArrayList<Volume> volumes = new ArrayList<Volume>();
			volumes.add(newVolume);
			Journal newJournal = new Journal(organization, newLocation,volumes);
			model.addJournal(newJournal);
			for (Scholar editor: editors)
			{
				editor.addToEfforts(newJournal);
			}
			for (Scholar reviewer: reviewers)
			{
				reviewer.addToEfforts(newJournal);
			}
			
			
			model.removeActionListener(journalView);
			journalView.dispose();
			
		}
		
	}
	/**
	 * Listener for add reviewers button
	 *
	 */
	private class AddJournalReviewersListener implements ActionListener{
	
		
		public void actionPerformed(ActionEvent e) {
			
			journalView.AddReviewers();
			
			
		}
		
	}
	/**
	 * Listener for add editors button
	 *
	 */
	private class AddJournalEditorsListener implements ActionListener{
	
		
		public void actionPerformed(ActionEvent e) {
			
			journalView.AddEditors();
		}
		
	}
	/**
	 * Listener for the add conference button
	 *
	 */
	private class AddConferenceListener implements ActionListener{
	
		
		public void actionPerformed(ActionEvent e) {
			
			String organization = conferenceView.textField.getText();
			String country = conferenceView.textField_1.getText();
			String state = conferenceView.textField_3.getText();
			String city = conferenceView.textField_4.getText();
			Location newLocation = new Location(country, state, city);
			String year = conferenceView.textField_2.getText();
			String month = conferenceView.textField_5.getText();
			List<Scholar> members = conferenceView.getReviewers();
			List<Scholar> chairs = conferenceView.getEditors();
			List<ConPaper> conPapers = new ArrayList<ConPaper>();
			Meeting newMeeting = new Meeting(year,month,newLocation,chairs,members,conPapers);
			ArrayList<Meeting> meetings = new ArrayList<Meeting>();
			meetings.add(newMeeting);
			Conference newCon = new Conference(organization, meetings);
			
			model.addConference(newCon);
			for (Scholar member: members)
			{
				member.addToEfforts(newCon);
			}
			for (Scholar chair: chairs)
			{
				chair.addToEfforts(newCon);
			}	
			model.removeActionListener(conferenceView);
			conferenceView.dispose();
		}
		
	}
	/**
	 * Listener for the add conference chairs button
	 *
	 */
	private class AddConferenceChairsListener implements ActionListener{
	
		
		public void actionPerformed(ActionEvent e) {
			
			conferenceView.AddEditors();
		}
		
	}
	/**
	 * listener for the add conference members listener
	 *
	 */
	private class AddConferenceMembersListener implements ActionListener{
	
		
		public void actionPerformed(ActionEvent e) {
			
			conferenceView.AddReviewers();
		}
		
	}
	
	private class ScholarInfoListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e)
		{
			int index = view.scholarList.getSelectedIndex();
			Scholar scholar = model.getScholars().get(index);
			new ScholarInfoView(scholar);
		}
	}
	/**
	 * Allows the driver to set the model for the controller	
	 * @param model
	 */
	public void setModel(ScholarshipModel model)
		{
			this.model = model;
		}
	/**
	 * Registers all the actionListeners for all the views	
	 * @param view
	 */
	public void setView(ScholarshipView view)
	{
		this.view = view;
		this.view.getAddScholarButton().addActionListener(new AddScholarListener());
		this.view.getDeleteScholarsButton().addActionListener(new DeleteScholarListener());
		this.view.getDeleteAllScholarsButton().addActionListener(new DeleteAllScholarsListener());
		this.view.getAddSerialButton().addActionListener(new AddSerialListener());
		this.view.getDeleteSerialsButton().addActionListener(new DeleteSerialListener());
		this.view.getDeleteAllSerialsButton().addActionListener(new DeleteAllSerialsListener());
		this.view.getAddPaperButton().addActionListener(new AddPaperListener());
		this.view.getDeletePapersButton().addActionListener(new DeletePaperListener());
		this.view.getDelteAllPapersButton().addActionListener(new DeleteAllPapersListener());		
		this.view.getTypeOfPub().addActionListener(new TypeOfPublicationListener());
		this.view.getPubPerYear().addActionListener(new PublicationsPerYearListener());
		this.view.getConPerYear().addActionListener(new ConferencePapersPerYearListener());
		this.view.getJournPerYear().addActionListener(new JournalArticlesPerYearListener());
		this.view.getCoAuthors().addActionListener(new CoAuthorsListener());
		this.view.getExportBinary().addActionListener(new ExportBinaryListener());
		this.view.getImportBinary().addActionListener(new ImportBinaryListener());
		this.view.getInfoButton().addActionListener(new ScholarInfoListener());
	}
	
	

}
