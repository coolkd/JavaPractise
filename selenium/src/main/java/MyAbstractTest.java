
public class MyAbstractTest {

	public static void main(String[] args) {

		MyAbstractClass abc = new MyChildClass1();
		abc.myMethode();

		System.out.println("-----------------");
		MyAbstractClass abc2 = new MyChildClass2();

		abc2.myMethode();

	}

}
