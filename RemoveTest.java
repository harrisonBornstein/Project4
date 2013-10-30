import static org.junit.Assert.*;

import org.junit.Test;


public class RemoveTest {

	@Test
	public void test() 
	{
		ScholarshipModel model = new ScholarshipModel();
		Scholar kevin = new Scholar();
		kevin.setFullName("Kevin J. Reimnitz");
		model.addScholar(kevin);
		model.removeScholar(kevin);
		assert.assertEquals(model.scholars.get("Kevin J. Reimnitz"), null);
	}

}
