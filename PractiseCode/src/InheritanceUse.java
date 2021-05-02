
public class InheritanceUse extends ParentClass {
	int bonus=10000;
	int salary=10;
	InheritanceUse(){
		super();
		System.out.println("from constructor");
	}
	{
		System.out.println("from the child initializer");
	}
	void display() {
		System.out.println("Hi this salary is from parent "+super.salary);
		System.out.println("Hi this bonus  is from parent "+bonus);
	}
public static void main(String args[]) {
	InheritanceUse u = new InheritanceUse();
	u.display();
}
}
