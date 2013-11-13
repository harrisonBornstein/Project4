import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ScholarshipModel {

	private List<Paper> publications;
	private List<Scholar> scholars;
	private ArrayList<Conference> conferences;
	private List<Journal> journals;
	private ArrayList<ActionListener> actionListenerList;
	
	
	public ScholarshipModel()
	{
		this.publications = new ArrayList<Paper>();
		this.scholars = new ArrayList<Scholar>();
		this.conferences = new ArrayList<Conference>();
		this.journals = new ArrayList<Journal>();
		this.actionListenerList = null;
	}
		
	public Scholar findScholar(Scholar findScholar)
	{
		for(int i =0; this.scholars.size() > i;++i)
		{
			if(findScholar.getFullName() == this.scholars.get(i).getFullName())
			{
				return scholars.get(i);
			}
			
		}
		return null;
	}
	
	public List<Scholar> getScholars()
	{
		return scholars;
	}
	
	public List<Conference> getConferences()
	{
		return conferences;
	}
	
	public List<Journal> getJournals()
	{
		return journals;
	}
	public void addPaper(Paper newPaper)
	{
		publications.add(newPaper);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Paper Added"));
	}
	
	public void addScholar(Scholar newScholar)
	{
		scholars.add(newScholar);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Scholar Added"));
	}
	
	public void addConference(Conference newConference)
	{
		if(newConference.getOrganization() == null)
		{
			System.out.println("addConference organization is null");
		}
		conferences.add(newConference);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Conference Added"));
	}
	
	public void addJournal(Journal newJournal)
	{
		journals.add(newJournal);
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Journal Added"));
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
				removeJournal(journal);
			}
		}
		
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Paper Removed"));
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
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Scholar Removed"));
	}
	
	public void removeConference(Effort outCon)
	{
		conferences.remove(outCon);
		for (Scholar scholar : scholars)
		{
			if (scholar.getEfforts().contains(outCon))
			{
				scholar.getEfforts().remove(outCon);
			}
		}
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Conference Removed"));
	}
	
	public void removeJournal(Effort effort)
	{
		journals.remove(effort);
		
		for(Scholar scholar : scholars)
		{
			if (scholar.getEfforts().contains(effort))
			{
				scholar.getEfforts().remove(effort);
			}
		}
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Journal Removed"));
	}
	
	public synchronized void addActionListener(ActionListener listener)
	{
		if (actionListenerList == null) 
		{
			actionListenerList = new ArrayList<ActionListener>();
		}
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
		if (actionListenerList != null && actionListenerList.contains(listener))
		{
			actionListenerList.remove(listener);
		}
	}

}
