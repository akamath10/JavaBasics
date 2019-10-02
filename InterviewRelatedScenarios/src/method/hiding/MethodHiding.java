package method.hiding;

public class MethodHiding {

	public static void main(String[] args) {

		StaticMethodInSubclass subclass = new StaticMethodInSubclass();
		StaticMethodInSuperclass superclass = new StaticMethodInSubclass();
		
		superclass.printMethod();
		subclass.printMethod();
		System.out.println(subclass.a);
	}

}
