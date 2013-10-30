
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int items = 52;
		 int factorial = 1;
		 int number =5;
		 int numerator = 1;

		for( int i=0;number > i; ++i )
		{
			numerator = items * numerator;
			factorial = factorial * (i +1);
			items = items -1;

		}
		System.out.println(numerator/factorial);
		

	}

}
