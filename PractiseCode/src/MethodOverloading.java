
public class MethodOverloading {
//Main method can be overloaded.
	public static void main(String args[]) {
		System.out.println("from pure main");
	}
	public static void main(String name) {
		System.out.println("from second main");
	}
	public static void main() {
		System.out.println("From third with no argument");
	}
}
