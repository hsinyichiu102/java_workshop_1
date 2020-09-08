import java.util.ArrayList;

/**
 * to store the salary of the employee and the average
 * @author Hsin Yi Chiu
 * @version 03.11.2019
 */
public class Salaries {
	ArrayList<double[]> allSalaries;
	/**
	 * allSalaries is a double array ArrayList
	 */
	public Salaries() {
		allSalaries= new ArrayList<double[]>();
	}
	/**
	 * this is a method to add the employees' salaries to the allSalaries
	 * @param employeeSalaries is a double array to store the employees' salaries
	 */
	public void add(double[] employeeSalaries) {
		allSalaries.add(employeeSalaries);
	}
	/**
	 * 1. this is a method to count the average salary of each employee
	 * 2. for-loop to count the annuaSalaries(averageSalaries of each employee), 
	 * if the index in the array of employeeSalaries is not 0, then there is at lease one month salary for the employee
	 * double sum to get the total value of a employee's salary
	 * int count to get the working day of the employee
	 * @param employeeSalaries is an arrays to store the 12 months salaries of each employee
	 * @return annualSalaries to get the average salaries of the employee
	 * @throws IllegalArgumentException if the salary of each month is 0, then it is an exception
	 */
	
	public static double average(double[] employeeSalaries) 
			throws IllegalArgumentException{
		double sum=0;
		double annualSalaries=0;
		int count=0;
	
		for(int i = 0; i< employeeSalaries.length;i++) {	
			if (employeeSalaries[i]!=0) {
				sum=sum+employeeSalaries[i];
				count=count+1;
				}
			annualSalaries=sum/count;
		}
		
		if(sum==0) {
		throw new IllegalArgumentException("noSalary");
		}
		
		return annualSalaries;	
	}
	/**
	 * 1. this method an double ArrayList to store the average salaries of each employee 
	 * of the result from the method of average
	 * 2. the average salaries needs to be a non-zero value
	 * 3. if the average is a non-zero value then to store in the averageSalaries
	 * 4. if there is any wrong, it will be an IllegalArgumentException
	 * @return averageSalaries
	 */
	public ArrayList<Double> averageSalaries(){
		ArrayList<Double> averageSalaries = new ArrayList<Double>();
		
		try {
			for(int i=0; i<allSalaries.size();i++) {
				if(average(allSalaries.get(i))!=0) {
					averageSalaries.add(average(allSalaries.get(i)));
				}
			}
		}
		catch(IllegalArgumentException e){
			System.out.println(e.toString());
		}
		return averageSalaries;
	}
	/**
	 * 1. this is a method to check if the employee's average salary is not higher 
	 * than three times all employees' average salaries. If not higher, return true
	 * 2. initialize the variable i to count the allSalariesAmount
	 * 3. after getting the amount of the all salaries, we can divide the amount with the total employ who has at least one month salary
	 * 4. if the averageSalaries is less than the 3 times allSalariesAverage, return true
	 * ArrayList<Double> averageSalaries is an Double ArrayList to get the average salaries from the method averageSalaries
	 * int count is to count the total employees
	 * double allSalariesAmount is the total amount salaries from all the employees
	 * double allSalariesAverage is the total average of the all employees
	 * @return not3TimesHigher is the boolean value to return the result
	 */

	public boolean not3TimesHigher() {
		ArrayList<Double> averageSalaries = averageSalaries();
		int count=0;
		double allSalariesAmount=0;
		double allSalariesAverage=0;
		boolean not3TimesHigher= true;

		for(int i =0;i<averageSalaries.size();i++) {
	
			allSalariesAmount= allSalariesAmount+averageSalaries.get(i);
			count+=1;
			allSalariesAverage=allSalariesAmount/count;
			if(averageSalaries.get(i) < allSalariesAverage*3) {
				not3TimesHigher=true;
			}
			else {
				not3TimesHigher=false;
			}
		}
		

		return not3TimesHigher;
		
	}

	/**
	 * a main method to check if above method is correct
	 * @param args unused
	 */
	public static void main(String[]args) {
		Salaries allSalaries = new Salaries();

		double[] nickySalary = { 100000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		allSalaries.add(nickySalary);
			
        System.out.println(Salaries.average(nickySalary));//average test
        System.out.println(allSalaries.averageSalaries());// averageSalariestest
        System.out.println(allSalaries.not3TimesHigher());// not3TimesHighertest
		
        

		double[] noSalary = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double[] timSalary = { 2500, 1542, 1345, 2415, 1246, 1876, 0, 0, 0, 0, 0, 0 };
		allSalaries.add(noSalary);
		allSalaries.add(timSalary);
		System.out.println(allSalaries.not3TimesHigher());
		
	}
}
