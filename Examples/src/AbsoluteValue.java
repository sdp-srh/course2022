
public class AbsoluteValue {

	public static void main(String[] args) {
		int abs = 0;
		int x = -100;
		if (x < 0) {
			abs = x * -1;
		}
		else {
			abs = x;
		}
		System.out.println("The absolute value is "+abs);
	}
}
