import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ScholarshipModel {

	private List<Paper> publications;
	private List<Scholar> scholars;
	private List<Conference> conferences;
	private List<Journal> journals;
	private ArrayList<ActionListener> actionListenerList;
	
	public ScholarshipModel()
	{
		this.publications = new ArrayList<Paper>();
		this.scholars = new ArrayList<Scholar>();
		this.conferences = new ArrayList<Conference>();
		this.journals = new ArrayList<Journal>();
	}
		
		
	public void addPaper(Paper newPaper)
	{
		publications.add(newPaper);
	}
	
	public void addScholar(Scholar newScholar)
	{
		scholars.add(newScholar);
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
		publications.remove(outPaper);
		
		// remove Paper from scholars
		for (Scholar scholar: scholars)
		{
			if (scholar.getPapers().contains(outPaper))
			{
				scholar.getPapers().remove(outPaper);
				if (scholar.getPapers().size() == 0)
				{
					removeScholar(scholar);
				}
			}
		}
		
		//remove Paper from conferences
		for (Conference conference: conferences)
		{
			for (Meeting meeting: conference.getMeetings())
			{
				if (meeting.getConPapers().contains(outPaper))
				{
					meeting.getConPapers().remove(outPaper);
					if (meeting.getConPapers().size() == 0)
					{
						//if meeting meeting has no more papers, remove it
						conference.getMeetings().remove(meeting);
					}
				}
			}
			if (conference.getMeetings().size() == 0)
			{
				//if conference has no more meetings, remove it
				removeConference(conference);
			}
		}
		
		//remove Paper from journals
		for (Journal journal: journals)
		{
			for (Volume volume: journal.getVolumes())
			{
				for (Issue issue: volume.getIssues())
				{
					if (issue.getArticles().contains(outPaper))
					{
						issue.getArticles().remove(outPaper);
						if (issue.getArticles().size() == 0)
						{
							//if issue is now empty, remove it
							volume.getIssues().remove(issue);
						}
					}
				}
				if (volume.getIssues().size() == 0)
				{
					//if volume is now empty, remove it
					journal.getVolumes().remove(volume);
				}
			}
			if (journal.getVolumes().size() == 0)
			{
				//if journal is now empty, remove it
				journals.remove(journal);
			}
		}
		
		
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
