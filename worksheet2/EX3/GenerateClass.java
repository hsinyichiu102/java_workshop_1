import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * to write a class of GenerateClass with the classmate, name and the type
 * @author HSIN YI Chiu
 * @version 29.10.2019
 */
public class GenerateClass {
	private String classname;
	int variableLength;
	private String[] variableName=new String[variableLength];
	private String[] variableType=new String[variableLength];
	/**
	 * A constructor for 1 String variable and 2 arrays
	 * @param classname is a String
	 * @param variableName is a String array to put the name
	 * @param variableType is a String array to put the type
	 */
	public GenerateClass(String classname, String[] variableName, String[] variableType) {
		
		this.classname = classname;
		this.variableName = variableName;
		this.variableType = variableType;
	}
	
	/**
	 * A getter of @param classname to get the classmate 
	 * @return getClassname is an String
	 */

	public String getClassname() {
		return classname;
	}
	
	/**
	 * A setter of @param classname to set the new String classmate into
	 * @param classname is an String 
	 */
	public void setClassname(String classname) {
		this.classname = classname;
	}
	
	/**
	 * A getter of String array of variableName
	 * @return getVariableName is an array
	 */
	public String[] getVariableName() {
		return variableName;
	}
	
	/**
	 * A setter of the String array @param variableName to set a new array of the variableName
	 * @param variableName is an array
	 */
	public void setVariableName(String[] variableName) {
		this.variableName = variableName;
	}

	/**
	 * A getter of the String Array of @param veriableType
	 * @return getVariableType is an array
	 */
	public String[] getVariableType() {
		return variableType;
	}
	
	/**
	 * A setter of the String array of @param variableTye
	 * @param variableType is an array
	 */
	public void setVariableType(String[] variableType) {
		this.variableType = variableType;
	}
	
	/**
	 * A method of the makeFields
	 * setting i as an integer variable and i is less than the length of variableType. as we know the length of variableType
	 * is same as the variableName, we just need to compare with one from them
	 * @return makeFields including the variableType and variableName which is the same format as the requested
	 */
	public String makeFields() {
		String makeFields = "";
		for(int i=0;i<variableType.length;i++) {
			makeFields=makeFields+ "  private "+ variableType[i] +" "
					+variableName[i]+";\n";
		}
		
		return makeFields+"\n";
	}
	
	/**
	 * a method of the @param makeConstructor
	 * to set three empty String which are makeConstructorA, makeConstructorB and makeConstructorC
	 * in order to put the elements from the loop
	 * as know there might be empty array, which has no element inside
	 * thus we need to clarify if the array is empty or not
	 * if the length of the variableName is greater than 0, then we can know that there is elements inside the array
	 * then putting the variable integer i into the array to get the element
	 * 
	 * String makeConstructorA is to make a String of the elements as the i in the location of array variableType and variableName 
	 * String makeConstructorB is to make a String of the variableName as the i in the location of array variableType and variableName
	 * @return makeConstructorC which is included the String of constructorB and C
	 */
	public String makeConstructor() {
		String makeConstructorA="";
		String makeConstructorB="";
		String makeConstructorC="";
		if(variableName.length>0) {
		for (int i=0;i<variableName.length;i++) {
				if(i>0) {
					makeConstructorA= makeConstructorA+", "+variableType[i]+" "+variableName[i];
					makeConstructorB= makeConstructorB+"\n"+"    this."+variableName[i]+" = "+variableName[i]+";";
					
				}
				else{
					makeConstructorA= makeConstructorA+variableType[i]+" "+variableName[i];
					makeConstructorB= makeConstructorB+"    this."+variableName[i]+" = "+variableName[i]+";";
				}	
			}
		makeConstructorC="  public "+ getClassname()+"("+ makeConstructorA+"){\n"+
				makeConstructorB+"\n  }";
		}
		else {
			makeConstructorC="  public "+ getClassname()+"(){}";	
		}
		
		
		return makeConstructorC+"\n";
		}
	
	/**
	 * A method of the String makeGetters
	 * setting a for loop to compare the integer i with the length of variableName
	 * String typeToUpper is to swap the first letter of variableType to capital letter
	 * String nameToUpper is to swap the first letter of variableName to capital letter
	 * setting the condition in the if-statement to get the element from the array of variableName and variableType
	 * @return makeGetters to get the String with the variableType and variableName
	 */
	public String makeGetters() {
		String makeGetters="";
		for(int i=0; i<variableName.length;i++) {
			String typeToUpper= variableType[i].substring(0,1).toUpperCase()+variableType[i].substring(1);
			String nameToUpper= variableName[i].substring(0,1).toUpperCase()+variableName[i].substring(1);
			if(i<2) {
				makeGetters= makeGetters +"  public "+typeToUpper+" "+
						"get"+ nameToUpper+"(){\n"+
						"    return "+variableName[i]+";\n  }\n";
			}
			else {
				makeGetters= makeGetters +"  public "+variableType[i]+" "+
						"get"+ nameToUpper+"(){\n"+
						"    return "+variableName[i]+";\n  }\n";
			}
			}
		return makeGetters;
		}
	
	/**
	 * a method of the makeSetter to get the correspond String made with variableType and variableName
	 * setting the condition in the if-else statement to get the element from the array of variableName and variableType
	 * String makeSetters is set as a empty String to put the element from the for-loop
	 * String typeToUpper is to swap the first letter of variableType to capital letter
	 * String nameToUpper is to swap the first letter of variableName to capital letter
	 * @return makeSetters
	 */
	public String makeSetters() {
		String makeSetters="";
			for(int i=0; i<variableName.length;i++) {
				
				String typeToUpper= variableType[i].substring(0,1).toUpperCase()+variableType[i].substring(1);
				String nameToUpper= variableName[i].substring(0,1).toUpperCase()+variableName[i].substring(1);
				
				if(i<2) {
					
					makeSetters= makeSetters+"  public void "+
							"set"+ nameToUpper+"("+typeToUpper+" "+variableName[i]+"){\n"+
							"    this."+variableName[i]+" = "+variableName[i]+";\n  }\n";
				}
				else{
					
					makeSetters=makeSetters+"  public void "+
							"set"+ nameToUpper+"("+variableType[i]+" "+variableName[i]+"){\n"+
							"    this."+variableName[i]+" = "+variableName[i]+";\n  }\n";
				}
				
			}
			return makeSetters;
		}
	
	/**
	 * a writeFile method to make a file to put all elements from above method into
	 * if cannot write any item inside, it is an exception
	 * @throws IOException if the generateClass is existed and with .java file then printout all the file inside 
	 */
	
	public void writeFile() 
		throws IOException{
	// create a file
		File file = new File("file.java");
	// create a writer subclass to write into the file generateClass
		Writer writer = new FileWriter(file);
	// create a bufferWriter subclass to write all the methods of generateClass and close it
		BufferedWriter bw= new BufferedWriter(writer);
		bw.write("  "+classname+"\n");
		for (int i=0; i< variableName.length;i++) {
			bw.write("  "+variableName[i]+"\n");
			bw.write("  "+variableType[i]+"\n");
		}
		bw.write(makeFields());
		bw.write(makeConstructor());
		bw.write(makeGetters());
		bw.write(makeSetters());
		bw.close();
		writer.close();
	
		if(file.exists() && file.getName().endsWith(".java"))
		{
			Reader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			String str=null;
			while((str = br.readLine())!=null)
			{
				System.out.println(str);
			}
			reader.close();
			br.close();
		}
		
	}
}
//	/**
//	 * to check if all methods are correct
//	 * @param args unused
//	 * @throws IOException if the writeFile cannot be read, throw IOException
//	 */
//	public static void main(String[] args) throws IOException {
//		String classNameOne="Apple";
//		String[] variableNameOne = new String[] {"Ali","Adi"};
//		String[] variableTypeOne = new String[]{"female","male"};
//		GenerateClass a = new GenerateClass(classNameOne, variableNameOne,variableTypeOne);
//	
////		System.out.print(a.makeFields());
////		System.out.print(a.makeConstructor());
////		System.out.print(a.makeGetters());
////		System.out.print(a.makeSetters());
//		
//		a.writeFile();
////		System.out.print(a.getVariableName());
//		
//	}
//}