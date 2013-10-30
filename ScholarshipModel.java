import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ScholarshipModel {

	private HashMap<String, Paper> publications;
	HashMap<String, Scholar> scholars;
	private List<Conference> conferences;
	private List<Journal> journals;
	private ArrayList<ActionListener> actionListenerList;
	
	public ScholarshipModel()
	{
		this.publications = new HashMap<String, Paper>();
		this.scholars = new HashMap<String, Scholar>();
		this.conferences = new ArrayList<Conference>();
		this.journals = new ArrayList<Journal>();
	}
		
		
	public void addPaper(Paper newPaper)
	{
		
	}
	
	public void addScholar(Scholar newScholar)
	{
		
	}
	
	public void addConference(Conference newCon)
	{
		
	}
	
	public void addJournal(Journal newJournal)
	{
		
	}
	
	public void removePaper(Paper outPaper)
	{
		
	}
	
	public void removeScholar(Scholar outScholar)
	{
		
	}
	
	public void removeConference(Conference outCon)
	{
		
	}
	
	public void removeJournal(Journal outJournal)
	{
		
	}
	
	public void addActionListener(ActionListener listener)
	{
		
	}
	
	private void processEvent(ActionEvent e)
	{
		
	}
	
	public void removeActionListener(ActionListener listener)
	{
		
	}

}
