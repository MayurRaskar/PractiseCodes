import java.util.Scanner;

public class FindSecondMax {
public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the size of array");
	 int n=sc.nextInt();
	 int temp=0;
	 int a[]=new int[n];	
			 for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	 }
	 for(int i=0;i<n;i++) {
		 for(int j=0;j<n;j++) {
			 if(a[i]<a[j]) {
				 temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			 }
		 }
	 }
	System.out.println("Second largest number"+a[n-2]);
}
}
