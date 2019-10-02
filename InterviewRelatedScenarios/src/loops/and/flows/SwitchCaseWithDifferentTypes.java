package loops.and.flows;

public class SwitchCaseWithDifferentTypes {

	public static void main(String[] args) {
		int argument = 2;
		final char x = '2';
		switch(argument){
		case 1:
			System.out.println("Value 1 has been selected");
		break;
		case 2:
			System.out.println("Value 2 has been selected");
		break;
		case x:
			System.out.println("Value Char 2 has been selected");
		break;
		case 3:
			System.out.println("Value 3 has been selected");
		break;
		default:
			System.out.println("Value does not match any value");
		break;
		}
	}
}
