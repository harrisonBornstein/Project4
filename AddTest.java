import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class AddTest
{
	@Test
	public void testAdd()
	{
		ScholarshipModel model = new ScholarshipModel();
		Scholar kevin = new Scholar();
		kevin.setFullName("Kevin J. Reimnitz");
		model.addScholar(kevin);
		//assert.assertEquals(model.scholars.get("Kevin J. Reimnitz"), kevin);
	}
}
