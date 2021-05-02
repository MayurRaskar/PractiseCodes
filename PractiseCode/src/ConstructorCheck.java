
public class ConstructorCheck {
	int n;
	static int count = 0;
	String name;
	static String collegeName = "SIT";

	ConstructorCheck(int n, String name) {
		System.out.println(this.n);
		this.n = n;// resolves the ambiguity in the local and instance variable parameters if both
					// are same
		this.name = name;// points to the instance variable to class;
		count++;
		System.out.println("Constructor Called " + n + " " + name + " " + collegeName + " " + count);
	}

	static int cube(int n) {
		return n * n * n;
	}

	static void changeName() {
		collegeName = "Sinhgad";
		System.out.println("CollegeName chenged from SIT to " + collegeName);
	}

	public static void main(String[] args) {
		ConstructorCheck c = new ConstructorCheck(4, "Mayur");
		ConstructorCheck c1 = new ConstructorCheck(5, "Hrishi");
		changeName();
		int cu = ConstructorCheck.cube(5);
		System.out.println("Cube of number is " + cu);
//	System.out.println(n);Error static method can not call non static data
	}
}
