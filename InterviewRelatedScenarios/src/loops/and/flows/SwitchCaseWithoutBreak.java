package loops.and.flows;

/*
 * @Author Ashwini Kamath
 * Question : What happens when switch case is written without break statements?
 * Answer : All the cases after the valid case are printed.
 */
public class SwitchCaseWithoutBreak {

	public static void main(String[] args) {
		int argument = 2;
		switch(argument){
		case 1:
			System.out.println("Value 1 has been selected");
		case 2:
			System.out.println("Value 2 has been selected");
		case 3:
			System.out.println("Value 3 has been selected");
		default:
			System.out.println("Value does not match any value");
		}
			
				
	}

}
