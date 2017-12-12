package demos;

/** 
 * A class to illustrate class design and use.
 * Used in module 2 of the UC San Diego MOOC Object Oriented Programming in Java
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * 
 *
 */
public class LocationTester {
	public static void main(String[] args)
	{
		double latitude = -15.5;
		SimpleLocation ucsd = new SimpleLocation(32.9, -117.2);
		SimpleLocation lima = new SimpleLocation(latitude, -77.0);
		
		lima = ucsd;
		ucsd.latitude = 2;
		
		System.out.println(lima.latitude);
//		System.out.println(ucsd.distance(lima));
	}

}
