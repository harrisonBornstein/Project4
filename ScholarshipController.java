import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;




public class ScholarshipController {
	
	private ScholarshipModel model;
	private ScholarshipView view;
	
	
	private class AddScholarListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
			AddScholarView scholarView = new AddScholarView();
			scholarView.setVisible(true);
			String primaryName = scholarView.textField.getText();
			String secondaryName = scholarView.textField_1.getText();
			String affiliation = scholarView.textField_2.getText();
			String researchAreas = scholarView.textField_3.getText();
			
		}
		
	}
	
	private class DeleteScholarListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
	
	private class DeleteAllScholarsListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
	private class AddSerialListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			
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
