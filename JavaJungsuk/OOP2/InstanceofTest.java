package OOP2;

public class InstanceofTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();

		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine istance.");
		}

		if (fe instanceof Car1) {
			System.out.println("This is a Car instance.");
		}

		System.out.println(fe.getClass().getName());
	}
}