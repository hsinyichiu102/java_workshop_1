import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * @author hs.chiu
 * @version 2019-11-4
 */

class SalariesTest {
	private Salaries allSalaries;
	
	@BeforeEach
	void init() {
		allSalaries= new Salaries();
		double[] maySalary= { 300,200,100,0,300,200,1000,200,300,0,0,0};
		double[] peterSalary= {0,200,100,0,0,0,0,0,0,0,0,0};
		allSalaries.add(maySalary);
		allSalaries.add(peterSalary);
		
	}
	
	@Test
	void testA() {
		double[] peterSalary= {0,200,100,0,0,0,0,0,0,0,0,0};
		double expectedAverage = 150;
		double actualAverage = Salaries.average(peterSalary);
		assertEquals(expectedAverage, actualAverage);
	}
	
	@Test 
	void testB(){
		
		ArrayList<Double> expectedAverageSalaries = new ArrayList<>();
		expectedAverageSalaries.add(325.00);
		expectedAverageSalaries.add(150.00);
		ArrayList<Double> actualAverageSalaries = allSalaries.averageSalaries();
		for(int i=0;i<actualAverageSalaries.size();i++) {
		assertEquals(expectedAverageSalaries.get(i), actualAverageSalaries.get(i));
		}
	}
	@Test
	void testC() {
		double[] peterSalary= {0,200,100,0,0,0,0,0,0,0,0,0};
		allSalaries.add(peterSalary);
		assertTrue(allSalaries.not3TimesHigher());
	}
	@Test
	void testD() {
		double[] maySalary= { 300,200,100,0,300,200,1000,200,300,0,0,0};
		double expectedAverage = 325;
		double actualAverage = Salaries.average(maySalary);
		assertEquals(expectedAverage, actualAverage);
		
		ArrayList<Double> expectedAverageSalaries = new ArrayList<>();
		expectedAverageSalaries.add(expectedAverage);
		ArrayList<Double> actualAverageSalaries = allSalaries.averageSalaries();
		actualAverageSalaries.add(Salaries.average(maySalary));
		assertEquals(expectedAverageSalaries.add(expectedAverage), actualAverageSalaries.add(Salaries.average(maySalary)));
		
		assertTrue(allSalaries.not3TimesHigher());
	}
	@Test
	void testE() {
		double[] noSalary = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		allSalaries.add(noSalary);
		assertThrows(IllegalArgumentException.class, () -> {
			Salaries.average(noSalary);
		});
		
	}
	
}
