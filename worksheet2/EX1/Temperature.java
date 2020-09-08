/**
 * write a method to return the lowest temperature
 * @author HSIN YI CHIU
 * @version 29.10.2019
 */
public class Temperature {
	
	/**
	 * A method to find the coldest day in the year
	 * setting the first lowest temperature is 0 and 
	 * comparing the all the temperature in the year with the first lowest day
	 * @param temperatures is an array to put the temperature inside
	 * @return lowestTemp plus one as the position is from 0 to 365 and there are 366 days
	 * if return position 0 in the array, it represents the day 1.
	 */
	public static int coldest(double[] temperatures) {
		int lowestTemp = 0;
		for (int i = 1; i<temperatures.length;i++) {
			if (temperatures[i]<temperatures[lowestTemp]) {
				lowestTemp= i;
			}
		}
		return lowestTemp+1;
	}

	/**
	 * set an array with 365 empty columns
	 * putting some value to test the array and the method
	 * to get the coldest day from the method temperatures
	 * @param args unused
	 */
	public static void main(String[] args) {
		double[] temperatures = new double[365];
		temperatures[0]=-100;
		temperatures[1]=20;
		temperatures[2]=-20;
		temperatures[3]=-20;
	
		System.out.println(coldest(temperatures));
	}

		
 }
