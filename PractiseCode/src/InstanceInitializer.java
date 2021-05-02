
public class InstanceInitializer {
    public InstanceInitializer() {
		System.out.println("from contructor");
	}
    static{
    	System.out.println("From static block");//Static block  has highest priority
    }
    {
    	System.out.println("from the instance initializer block");
    }
    public static void main(String args[]) {
    	InstanceInitializer i = new InstanceInitializer();
    	InstanceInitializer i1 = new InstanceInitializer();

    }
}
