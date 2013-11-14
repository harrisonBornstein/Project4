import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class GraphView extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2732951555205179751L;
	private Scholar scholar;
	private String type;
	private ScholarshipModel model;
	private BarGraph paperTypes;
	private int index;
	
	/**
	 * Creates a graph view 
	 * @param scholar author specified
	 * @param type Type of graph
	 */
	public GraphView(int index, String type)
	{
		this.index = index;
		this.type = type;
	}

	private void getData()
	{
		if (type.equals("Type of Publication")) 
		{
			double[] data = { countTypes(scholar)[0], countTypes(scholar)[1] };
			String[] names = { "Conference Papers", "Journals" };
			paperTypes = new BarGraph(data, names,
					"Types of Papers by " + scholar.getFullName());
			paperTypes.setVisible(true);
			
		}
		else if (type.equals("Publications per Year"))
		{
			ArrayList<int[]> years = countYears(scholar); //get data from author
			
			for (int g = 0; g < years.size(); g++) //order data in list by year, most recent year first
			{
				for (int i = 0; i < years.size()-g - 1; ++i)
				{
					if (years.get(i)[0] > years.get(i + 1)[0]) 
					{
						Collections.swap(years, i, i + 1);
					}
				}
			}
			int range = years.get(years.size() -1)[0] - years.get(0)[0];
			double[] pubsInYear = new double[range +1]; //param to pass into BarGraph
			String[] stringYears = new String[range +1]; //param to pass into BarGraph
			
			for(int i = 0; i <= range; i++) //check if there is a pub at that year and find index
			{	
				int index =0;
				boolean containsYear = false;
				for(int j =0; j < years.size(); ++j)
				{
					if(years.get(j)[0] == i + years.get(0)[0])
					{
						index =j;
						containsYear = true;
					}
				}
				if(containsYear) //if there is a pub(s), add how many to the array
				{
					pubsInYear[i] = years.get(index)[1];
				}
				else //if not set the value to zero
				{
					pubsInYear[i]= 0;
				}
				stringYears[i] = "" +(i +years.get(0)[0]); // add the corresponding year to the string array
			}
			
			paperTypes = new BarGraph(pubsInYear, stringYears, "Papers per Year by " + scholar.getFullName());
			paperTypes.setVisible(true);
		}
		else if (type.equals("Conference Papers per Year"))
		{
			ArrayList<int[]> years = countYears(scholar); //get data from author
			
			for (int g = 0; g < years.size(); g++) //order data in list by year, most recent year first
			{
				for (int i = 0; i < years.size()-g - 1; ++i)
				{
					if (years.get(i)[0] > years.get(i + 1)[0]) 
					{
						Collections.swap(years, i, i + 1);
					}
				}
			}
			int range = years.get(years.size() -1)[0] - years.get(0)[0];
			double[] pubsInYear = new double[range +1]; //param to pass into BarGraph
			String[] stringYears = new String[range +1]; //param to pass into BarGraph
			
			for(int i = 0; i <= range; i++) //check if there is a pub at that year and find index
			{	
				int index =0;
				boolean containsYear = false;
				for(int j =0; j < years.size(); ++j)
				{
					if(years.get(j)[0] == i + years.get(0)[0])
					{
						index =j;
						containsYear = true;
					}
				}
				if(containsYear) //if there is a pub(s), add how many to the array
				{
					pubsInYear[i] = years.get(index)[2];
				}
				else //if not set the value to zero
				{
					pubsInYear[i]= 0;
				}
				stringYears[i] = "" +(i +years.get(0)[0]); // add the corresponding year to the string array
			}
			
			
			paperTypes = new BarGraph(pubsInYear, stringYears, "Conference Papers per Year by " + scholar.getFullName());
			paperTypes.setVisible(true);
		}
		else if (type.equals("Journal Articles per Year"))
		{
			ArrayList<int[]> years = countYears(scholar); //get data from author
			
			for (int g = 0; g < years.size(); g++) //order data in list by year, most recent year first
			{
				for (int i = 0; i < years.size()-g - 1; ++i)
				{
					if (years.get(i)[0] > years.get(i + 1)[0]) 
					{
						Collections.swap(years, i, i + 1);
					}
				}
			}
			int range = years.get(years.size() -1)[0] - years.get(0)[0];
			double[] pubsInYear = new double[range +1]; //param to pass into BarGraph
			String[] stringYears = new String[range+1]; //param to pass into BarGraph
			
			for(int i = 0; i <= range; i++) //check if there is a pub at that year and find index
			{	
				int index =0;
				boolean containsYear = false;
				for(int j =0; j < years.size(); ++j)
				{
					if(years.get(j)[0] == i + years.get(0)[0])
					{
						index =j;
						containsYear = true;
					}
				}
				if(containsYear) //if there is a pub(s), add how many to the array
				{
					pubsInYear[i] = years.get(index)[3];
				}
				else //if not set the value to zero
				{
					pubsInYear[i]= 0;
				}
				stringYears[i] = "" +(i +years.get(0)[0]); // add the corresponding year to the string array
			}
			
			
			paperTypes = new BarGraph(pubsInYear, stringYears, "Journals per Year by " + scholar.getFullName());
			paperTypes.setVisible(true);
		}
		else
		{
			double[] data = countCoAuthors(scholar);
			String[] numberOfCoAuthors = new String[data.length];
			for(int i =0; i < numberOfCoAuthors.length; ++i)
			{
				numberOfCoAuthors[i] = "" + i;
			}
			paperTypes = new BarGraph(data, numberOfCoAuthors, "Co-Authors Per Publication for " + scholar.getFullName());
			paperTypes.setVisible(true);
		}
	}
	
	public void setModel(ScholarshipModel model)
	{
		this.model = model;
		if (model != null)
		{
			model.addActionListener(this);
			this.scholar = model.getScholars().get(index);
			getData();
			setSize(paperTypes.getSizeOfWindow()[0] * 100 + 200, 500);
			getContentPane().add(paperTypes);
			setVisible(true);
		}	
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if (!model.getScholars().contains(scholar))
		{
			model.removeActionListener(this);
			this.dispose();
		}
		getContentPane().remove(paperTypes);
		getData();
		getContentPane().add(paperTypes);
	}
	
	/**
	 * 
	 * @param author author to check
	 * @return an array with [0] =  the number of Conference Papers and [1] = the number of Journals
	 */
	public int[] countTypes(Scholar author)
	{
		int cons = 0;
		int journs = 0;
		for (int i = 0; i < author.getPapers().size(); i++) //go through list of titles
		{
			if (author.getPapers().get(i).getType().equals("Conference Paper")) //if the paper is a Conference Paper
			{
				cons++;
			}
			else
			{
				journs++;
			}
		}
		
		int[] types =  {cons, journs};
		
		return types;
	}
	
	/**
	 * 
	 * @param author Author object to get data from
	 * @return An ArrayList<int[]> with each int[] formatted as follows:
	 *          [0]: Year     [1]: Papers in that year     
	 *          [2]:  Conference Papers in that year  [3]: Journals in that year
	 *          
	 */
	public ArrayList<int[]> countYears(Scholar author)
	{
		ArrayList<int[]> data = new ArrayList<int[]>();
		
		ArrayList<String[]> years = new ArrayList<String[]>();
		
		
		for (Paper paper: author.getPapers())
		{
			String type = paper.getType();
			String date;
			if(type.equals("Conference Paper"))
			{
				ConPaper conPaper = (ConPaper) paper;
				date = conPaper.getCon().getMeetings().get(0).getYear();
			}
			else
			{
				JournalArticle journal = (JournalArticle) paper;
				date = journal.getJournal().getVolumes().get(0).getIssues().get(0).getYear();
			}
			String[] yearAndType = {date, paper.getType()};
			years.add(yearAndType); //add year as a string
		}
		
		
		
		while (years.size() != 0)
		{
			int count = 0;
			int cons = 0;
			int journs = 0;
			String check = years.get(0)[0];
			for (int i = 0; i < years.size(); i++)
			{
				if (years.get(i)[0].equals(check))
				{
					if (years.get(i)[1].equals("Conference Paper"))
					{
						cons++;
					}
					else
					{
						journs++;
					}
					years.remove(i);
					i--;
					count++;
				}
			}	
			int[] pair = {Integer.parseInt(check), count, cons, journs};
			data.add(pair);
		}
		
		
		return data;
		
	}
	/**
	 * 
	 * @param author
	 * @return a double[] which consists of the number CoAuthors with each [i] = amount of papers with i co-authors
	 */
	public double[] countCoAuthors(Scholar author)
	{
		int max =0;
		for(int i =0; i < author.getPapers().size(); i++)
		{
			int coAuthors = author.getPapers().get(i).getAuthors().size()-1;
			if(coAuthors > max)
					{
						max = coAuthors;
					}
		}
		double[] data = new double[max + 1];
		for (int i =0; i < author.getPapers().size(); i++)
		{
			int coAuthors = author.getPapers().get(i).getAuthors().size()-1;
			data[coAuthors]++;
		}
		return data;
	}
}
