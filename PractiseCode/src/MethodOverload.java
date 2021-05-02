
public class MethodOverload {
	static void add(int a , int b) {
		System.out.println(a+b);
	}
	static void add(int a , int b , int c) {
		System.out.println(a+b+c);
	}
public static void main(String[] args) {
	MethodOverload.add(12, 15);
	MethodOverload.add(12, 13, 14);
}
}
