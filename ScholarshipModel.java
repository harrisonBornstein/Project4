import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ScholarshipModel {

	private HashMap<String, Paper> publications;
	private HashMap<String, Scholar> scholars;
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
		publications.put(newPaper.getPaperTitle(), newPaper);
	}
	
	public void addScholar(Scholar newScholar)
	{
		scholars.put(newScholar.getFullName(), newScholar);
	}
	
	public void addConference(Conference newCon)
	{
		conferences.add(newCon);
	}
	
	public void addJournal(Journal newJournal)
	{
		journals.add(newJournal);
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
		actionListenerList.add(listener);
	}
	
	private void processEvent(ActionEvent e)
	{
		ArrayList<ActionListener> list;
		synchronized (this) 
		{
			if (actionListenerList == null)
			{
				return;
			}
			list = (ArrayList<ActionListener>) actionListenerList.clone();
		}
		for (int i = 0; i < list.size(); i++) 
		{
			ActionListener listener = list.get(i);
			listener.actionPerformed(e);
		}
	}
	
	public void removeActionListener(ActionListener listener)
	{
		actionListenerList.remove(listener);
	}

}
