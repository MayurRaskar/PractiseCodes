
public class UseOfThis {
	int n;
	UseOfThis(){
		this(10);//call to parameterized  from default 
		
		System.out.println("Hi i am default");
	}
	void display(UseOfThis b) {
		System.out.println("Use of this pass by argument");
	}
	UseOfThis(int n){
		display(this);
		//this();//calls to the default constructor
		this.n=n;//refer to the instance variable outside the constructor 
		System.out.println("Hi i am from Parameterised "+ n);
//		this();
		//Use of this is used to pass by argument to method also
	}
  public static void main(String args[]) {
	  UseOfThis u = new UseOfThis();
	  
  }
}
