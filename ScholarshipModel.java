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
<<<<<<< HEAD
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
				removeJournal(journal);
			}
		}
		
=======
>>>>>>> b4d1d0fa3f43b1abf45b4720dba1b253adc29e82
		
	}
	
	public void removeScholar(Scholar outScholar)
	{
		scholars.remove(outScholar);
		
		//remove the scholar from papers
		for (Paper paper: publications)
		{
			if (paper.getAuthors().contains(outScholar))
			{
				paper.getAuthors().remove(outScholar);
			}
			//if paper has no more authors remove it
			if (paper.getAuthors().size() == 0)
			{
				removePaper(paper);
			}
			
		}
		
		//remove the scholar from journals
		for (Journal journal: journals)
		{
			for (Volume volume: journal.getVolumes())
			{
				for (Issue issue: volume.getIssues())
				{
					//remove from Editors
					if (issue.getEditors().contains(outScholar))
					{
						issue.getEditors().remove(outScholar);
					}
					
					//remove from reviewers
					if (issue.getReviewers().contains(outScholar))
					{
						issue.getReviewers().remove(outScholar);
					}
					
					//if there are no more editors or no more reviewers
					if (issue.getEditors().size() == 0 || issue.getReviewers().size() == 0)
					{
						//issue is now empty, remove it
						volume.getIssues().remove(issue);
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
				removeJournal(journal);
			}
		}
		
		//remove the scholar from conferences
		for (Conference conference: conferences)
		{
			for (Meeting meeting: conference.getMeetings())
			{
				if (meeting.getChairs().contains(outScholar))
				{
					meeting.getChairs().remove(outScholar);
				}
				if (meeting.getMembers().contains(outScholar))
				{
					meeting.getMembers().remove(outScholar);
				}
				if (meeting.getMembers().size() == 0 || meeting.getChairs().size() == 0)
				{
					//if meeting meeting has no more chairs or members, remove it
					conference.getMeetings().remove(meeting);
				}
				
			}
			if (conference.getMeetings().size() == 0)
			{
				//if conference has no more meetings, remove it
				removeConference(conference);
			}
		}
		
	}
	
	public void removeConference(Conference outCon)
	{
		conferences.remove(outCon);
		for (Scholar scholar : scholars)
		{
			if (scholar.getEfforts().contains(outCon))
			{
				scholar.getEfforts().remove(outCon);
			}
		}
	}
	
	public void removeJournal(Journal outJournal)
	{
		journals.remove(outJournal);
		
		for(Scholar scholar : scholars)
		{
			if (scholar.getEfforts().contains(outJournal))
			{
				scholar.getEfforts().remove(outJournal);
			}
		}
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
