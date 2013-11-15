import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ScholarshipModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4387041456221952094L;
	private ArrayList<Paper> publications;
	private ArrayList<Scholar> scholars;
	private ArrayList<Conference> conferences;
	private ArrayList<Journal> journals;
	private ArrayList<ActionListener> actionListenerList;
	
	/**
	 * Constructor
	 */
	public ScholarshipModel()
	{
		this.publications = new ArrayList<Paper>();
		this.scholars = new ArrayList<Scholar>();
		this.conferences = new ArrayList<Conference>();
		this.journals = new ArrayList<Journal>();
		this.actionListenerList = null;
	}
		

	
	public List<Scholar> getScholars()
	{
		return scholars;
	}
	
	public List<Conference> getConferences()
	{
		return conferences;
	}
	
	public List<Paper> getPapers()
	{
		return publications;
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
	
	public void addConference(Conference newCon)
	{
		conferences.add(newCon);
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
				
		for (Scholar scholar: scholars)
		{
			if (scholar.getPapers().contains(outPaper))
			{
				scholar.getPapers().remove(outPaper);
			}
		}
		
		
		
		//remove Paper from conferences
		//ArrayList<Conference> outCon = new ArrayList<Conference>(); //conferences to remove
		
		for (Conference conference: conferences)
		{
			for (Meeting meeting: conference.getMeetings())
			{
				if (meeting.getConPapers().contains(outPaper))
				{
					meeting.getConPapers().remove(outPaper);
//					if (meeting.getConPapers().size() == 0)
//					{
//					//if meeting meeting has no more papers, add the conference to the list
//						outCon.add(conference);
//					}
				}
			}
		}
		
		//remove empty Cons
		//for (Conference conference: outCon)
		//{
		//	conferences.remove(conference);
		//}
		
		//remove Paper from journals
		//ArrayList<Journal> outJournals = new ArrayList<Journal>();
		for (Journal journal: journals)
		{
			for (Volume volume: journal.getVolumes())
			{
				for (Issue issue: volume.getIssues())
				{
					if (issue.getArticles().contains(outPaper))
					{
						issue.getArticles().remove(outPaper);
						//if (issue.getArticles().size() == 0)
						//{
							//if issue is now empty, add journal to outJournals
						//	outJournals.add(journal);
						//}
					}
				}
			}
		}
		
		//remove empty Journals
		//for (Journal journal: outJournals)
		//{
		//	conferences.remove(journal);
		//}
		
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Paper Removed"));
	}
	
	public void removeScholar(Scholar outScholar)
	{
		scholars.remove(outScholar);
		
		//remove the scholar from papers
		ArrayList<Paper> outPapers = new ArrayList<Paper>(); //Papers to remove
		for (Paper paper: publications)
		{
			if (paper.getAuthors().contains(outScholar))
			{
				paper.getAuthors().remove(outScholar);
			}
			//if paper has no more authors add to be removed
			if (paper.getAuthors().size() == 0)
			{
				outPapers.add(paper);
			}
			
		}
		
		//remove empty Papers
		for (Paper paper: outPapers)
		{
			publications.remove(paper);
		}
		
		//remove the scholar from journals
		ArrayList<Journal> outJournals = new ArrayList<Journal>(); //list of Journals to remove
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
						//issue is now empty, add the Journal to remove list
						outJournals.add(journal);
					}	
				}
			}
		}
		
		//remove empty Journals
		for (Journal journal: outJournals)
		{
			journals.remove(journal);
		}
		
		//remove the scholar from conferences
		ArrayList<Conference> outCons = new ArrayList<Conference>(); //list of Cons to remove
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
					//if meeting meeting has no more chairs or members, add the conference to be removed
					outCons.add(conference);
				}	
			}
		}
		
		//remove empty Cons
		for (Conference conference: outCons)
		{
			conferences.remove(conference);
		}
		
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Scholar Removed"));
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
		
		ArrayList<ConPaper> outPapers = new ArrayList<ConPaper>();
		for (ConPaper paper: outCon.getMeetings().get(0).getConPapers())
		{
			outPapers.add(paper);
		}
		for(ConPaper paper: outPapers)
		{
			publications.remove(paper);
		}
		
		processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "Conference Removed"));
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
		
		ArrayList<JournalArticle> outPapers = new ArrayList<JournalArticle>();
		for (JournalArticle paper: outJournal.getVolumes().get(0).getIssues().get(0).getArticles())
		{
			outPapers.add(paper);
		}
		for(JournalArticle paper: outPapers)
		{
			publications.remove(paper);
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
	
	@SuppressWarnings("unchecked")
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
