
public class StaticBlock {
static {
	System.out.println("Hi I invoked before the main method");
}
public static void main(String[] args) {
	System.out.println("Hi I am from main method");
}
}
