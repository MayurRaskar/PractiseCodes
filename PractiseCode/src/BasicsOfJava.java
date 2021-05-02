import java.util.Scanner;

class SecondClass{
	int id1;
	String name1;
}
public class BasicsOfJava {
	int id;
	String name;
	public int fact(int n) {
		int fact=1;
		if(n==1 || n==0) {
			return 1;
		}else {
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			return fact;
		}
	}
   public static void main(String [] args) {
	   BasicsOfJava b = new BasicsOfJava();
	   SecondClass s = new SecondClass();
	   System.out.println("ENter the number which you want factorial:");
	   Scanner sc = new Scanner(System.in);
	   int num=sc.nextInt();
	   int factorial=b.fact(num);
	   System.out.println("factorial is:"+factorial);
	   System.out.println(b.id);
	   System.out.println(b.name);
   }
}
