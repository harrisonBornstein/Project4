
public class Driver {

	 static ScholarshipModel model;
	 static ScholarshipController controller = new ScholarshipController();
	 static ScholarshipView view = new ScholarshipView();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		model = new ScholarshipModel();
		view.setModel(model);
		controller.setModel(model);
		
		
		
		
	}
		

}
