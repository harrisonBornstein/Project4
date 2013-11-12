
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

	
	
	
	
	private class AddScholarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			System.out.println("test");
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
			
			List<Scholar> scholars = new ArrayList<Scholar>();
			scholars = model.getScholars();
			
			for(Scholar scholar: scholars)
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
				journalView.setVisible(true);
			else if(response == 2)
				conferenceView.setVisible(true);
				
			
		}
		
	}
	
	private class DeleteSerialListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
	
	private class DeleteAllSerialsListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
	
	private class AddPaperListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
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
			String secondaryName = scholarView.textField_1.getText();
			String affiliation = scholarView.textField_2.getText();
			String researchAreas = scholarView.textField_3.getText();
			String fullName = secondaryName + " " + primaryName;
			model.addScholar(new Scholar(fullName, secondaryName,primaryName, affiliation,researchAreas));
			scholarView.setVisible(false);
			
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
		
		
	}
	
}

private class AddJournalReviewersListener implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}

private class AddJournalEditorsListener implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}

private class AddConferenceListener implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}

private class AddConferenceChairsListener implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}

private class AddConferenceMembersListener implements ActionListener{

	
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}
	
public void setModel(ScholarshipModel model)
	{
		this.model = model;
	}
	
public void setView(ScholarshipView view)
	{
		this.view.getAddScholarButton().addActionListener(new AddScholarListener());
		this.view.getDeleteScholarsButton().addActionListener(new DeleteScholarListener());
		this.view.getDeleteAllScholarsButton().addActionListener(new DeleteAllScholarsListener());
		this.view.getAddSerialButton().addActionListener(new AddSerialListener());
		this.view.getDeleteSerialsButton().addActionListener(new DeleteSerialListener());
		this.view.getDeleteAllSerialsButton().addActionListener(new DeleteAllSerialsListener());
		this.view.getAddPaperButton().addActionListener(new AddPaperListener());
		this.view.getDeletePapersButton().addActionListener(new DeletePaperListener());
		this.view.getDelteAllPapersButton().addActionListener(new DeleteAllPapersListener());
		this.view = view;
	}
	
	

}
