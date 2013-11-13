
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;




public class ScholarshipController {
	
	private ScholarshipModel model;
	private ScholarshipView view;
	private AddScholarView scholarView = new AddScholarView();
	private AddJournalView journalView = new AddJournalView();
	private AddConferenceView conferenceView = new AddConferenceView();
	private AddPapersView papersView = new AddPapersView();

	
	
	
	
	private class AddScholarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			
			scholarView.setVisible(true);
			
			
		}
		
	}
	
	private class DeleteScholarListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			Scholar newScholar = new Scholar();
			int index = view.scholarList.getSelectedIndex();
			newScholar = model.getScholars().get(index);
			model.removeScholar(newScholar);
			
			
		}
		
	}
	
	private class DeleteAllScholarsListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			
			for(Scholar scholar: model.getScholars())
			{
				model.removeScholar(scholar);
			}
			
			
			
		}
		
	}
	private class AddSerialListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			String optionPane = "Journal or Conference";
			String[] options = {"Cancel", "Journal", "Conference"};
			int response = JOptionPane.showOptionDialog(null, optionPane, "Please Choose A Serial", JOptionPane.PLAIN_MESSAGE, 1, null, options, options[0]);
			if(response == 1)
			{
				journalView.setModel(model);
				journalView.populateReviewerJList();
			}	
			else if(response == 2)
			{
				conferenceView.setModel(model);
				conferenceView.populateReviewerJList();
			}
			
				
			
		}
		
	}
	
	private class DeleteSerialListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) 
		{
			int index = view.serialList.getSelectedIndex();
			Effort effort = view.getEfforts().get(index);
			if (effort.getType().equals("Journal"))
			{
				model.removeJournal(effort);
			}
			else
			{
				model.removeConference(effort);
			}
		}
		
	}
	
	private class DeleteAllSerialsListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) 
		{
			for (Journal journal: model.getJournals())
			{
				model.removeJournal(journal);
			}
			for (Conference conference: model.getConferences())
			{
				model.removeConference(conference);
			}	
		}
		
	}
	
	private class AddPaperListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			
			papersView.setModel(model);
			papersView.populateAuthorsJList();
		}
		
	}
	
	private class DeletePaperListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
	
	private class DeleteAllPapersListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
	
	private class AddScholarDialogListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			String primaryName = scholarView.textField.getText();
			String secondaryName = scholarView.textField_3.getText();
			String affiliation = scholarView.textField_1.getText();
			String researchAreas = scholarView.textField_2.getText();
			String fullName = secondaryName + ", " + primaryName;
			model.addScholar(new Scholar(fullName, secondaryName,primaryName, affiliation,researchAreas));
			scholarView.setVisible(false);
			scholarView.textField.setText("");
			scholarView.textField_1.setText("");
			scholarView.textField_2.setText("");
			scholarView.textField_3.setText("");
			
		}
		
	}
	
	private class AddJournalArticleJournalListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
	
private class AddJournalArticleScholarListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}

private class AddJournalArticleListener implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}

private class AddConferencePaperScholarListener implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
private class AddConferencePaperConferenceListener implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}

private class AddConferencePaperListener implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}

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
		
		System.out.println("Organization is " + newJournal.getOrganization());
		journalView.setVisible(false);
		journalView.textField.setText("");
		journalView.textField_1.setText("");
		journalView.textField_2.setText("");
		journalView.textField_3.setText("");
		journalView.textField_4.setText("");
		journalView.textField_5.setText("");
		journalView.clearView();
		
	}
	
}

private class AddJournalReviewersListener implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		journalView.AddReviewers();
		
		
	}
	
}

private class AddJournalEditorsListener implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		journalView.AddEditors();
	}
	
}

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
		System.out.println("newCon is " + newCon.getOrganization() + newCon.getType());
		model.addConference(newCon);
		System.out.println("Organization is " + model.getConferences().get(0).getOrganization());
		conferenceView.setVisible(false);
		conferenceView.textField.setText("");
		conferenceView.textField_1.setText("");
		conferenceView.textField_2.setText("");
		conferenceView.textField_3.setText("");
		conferenceView.textField_4.setText("");
		conferenceView.textField_5.setText("");
		conferenceView.clearView();
		
		
	}
	
}

private class AddConferenceChairsListener implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		conferenceView.AddEditors();
	}
	
}

private class AddConferenceMembersListener implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		conferenceView.AddReviewers();
	}
	
}
	
public void setModel(ScholarshipModel model)
	{
		this.model = model;
	}
	
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
		
		scholarView.getOkButton().addActionListener(new AddScholarDialogListener());
		
		journalView.getOKButton().addActionListener(new AddJournalListener());
		journalView.getAddEditorsButton().addActionListener(new AddJournalEditorsListener());
		journalView.getAddReviewersButton().addActionListener(new AddJournalReviewersListener());
		
		conferenceView.getOKButton().addActionListener(new AddConferenceListener());
		conferenceView.getAddEditorsButton().addActionListener(new AddConferenceChairsListener());
		conferenceView.getAddReviewersButton().addActionListener(new AddConferenceMembersListener());
		
		papersView.getAddJournalButton().addActionListener(new AddJournalArticleJournalListener());
		papersView.getAddJournalArticleAuthorsButton().addActionListener(new AddJournalArticleScholarListener());
		papersView.getAddJournalButton().addActionListener(new AddJournalArticleListener());
		
		papersView.getAddConferenceButton().addActionListener(new AddConferencePaperConferenceListener());
		papersView.getAddConPaperAuthorsButton().addActionListener(new AddConferencePaperScholarListener());
		papersView.getAddConPaperButton().addActionListener(new AddConferencePaperListener());
		
		
		
	}
	
	

}
