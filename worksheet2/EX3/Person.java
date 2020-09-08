import java.io.IOException;

public class Person {

	public static void main(String[] args) throws IOException {
		String name= "Apple";
		String[] variableName= {"name"};
		String[] variableType= {"type"};


		
		GenerateClass person = new GenerateClass(name, variableName, variableType);
		person.writeFile();
		
	}
}
