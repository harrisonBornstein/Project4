
public class Driver {

	 static ScholarshipModel model;
	 static ScholarshipController controller = new ScholarshipController();
	 static ScholarshipView ScholarshipView = new ScholarshipView();

	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		model = new ScholarshipModel();
		ScholarshipView.setModel(model);
		controller.setModel(model);
		controller.setView(ScholarshipView);
		
		
	}
		

}
