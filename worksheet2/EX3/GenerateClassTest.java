import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Hsin Yi Chiu
 * @verson 2019-11-2
 */

class GenerateClassTest {
	
	private GenerateClass firstClass;

	@BeforeEach 
	void init() {
		String classNameOne="Apple";
		String[] variableNameOne= {"Ali","Adi"};
		String[] variableTypeOne= {"female","male"};
		firstClass= new GenerateClass(classNameOne, variableNameOne,variableTypeOne);

	}

	@Test
	void testA() {
		String expectedFields = "  private female Ali;\n" + "  private male Adi;\n\n";
		String actualFields = firstClass.makeFields();
		assertEquals(expectedFields, actualFields);
	}
	
	@Test
	void testB() {
		String expectedConstructor = "  public Apple(female Ali, male Adi){\n" + "    this.Ali = Ali;\n"
				+ "    this.Adi = Adi;\n" + "  }\n";
		String actualConstructor = firstClass.makeConstructor();
		assertEquals(expectedConstructor, actualConstructor);
	}
	@Test
	void testC() {
		String expectedGetters = "  public Female getAli(){\n" + "    return Ali;\n" + "  }\n"
				+ "  public Male getAdi(){\n" + "    return Adi;\n" + "  }\n";
		String actualGetters = firstClass.makeGetters();
		assertEquals(expectedGetters, actualGetters);
	}

	@Test
	void testD() {
		String expectedSetters = "  public void setAli(Female Ali){\n" + "    this.Ali = Ali;\n" + "  }\n"
				+ "  public void setAdi(Male Adi){\n" + "    this.Adi = Adi;\n" + "  }\n";
		String actualSetters = firstClass.makeSetters();
		assertEquals(expectedSetters, actualSetters);
	}
	@Test
	void testE() {
		String expectedGetClassname = "Apple";
		String actualGetClassname = firstClass.getClassname();
		assertEquals(expectedGetClassname, actualGetClassname);
		
		String[] expectedGetVariableNameOne={"Ali","Adi"};
		assertArrayEquals(expectedGetVariableNameOne,firstClass.getVariableName());
		
		String[] expectedGetVariableTypeOne={"female","male"};
		assertArrayEquals(expectedGetVariableTypeOne,firstClass.getVariableType());
		
	}
	@Test
	void testF() {
		String[] variableNameA= {"Bobo"};
		String[] variableTypeA= {"male"};
		String expectedSetClassname= "pear";
		firstClass.setClassname(expectedSetClassname);
		firstClass.setVariableName(variableNameA);
		firstClass.setVariableType(variableTypeA);
		assertEquals(expectedSetClassname, firstClass.getClassname());
		assertArrayEquals(variableNameA,firstClass.getVariableName());
		assertArrayEquals(variableTypeA,firstClass.getVariableType());
	}
	
}
