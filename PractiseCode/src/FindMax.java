import java.util.*;
import java.io.*;

public class FindMax {
	public static void main(String args[]) {
 Scanner sc=new Scanner(System.in);
 System.out.print("Enter the size of array");
 int n=sc.nextInt();
 int a[]=new int[n];
 for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();
 }
 int max=a[0],secmax=0;
 for(int i=0;i<n;i++) {
	 if(max<a[i]) {
		 secmax=max;
		 max=a[i];
	 }
}
	
// Arrays.sort(a);
// max=a[n-1];
 System.out.println("Maximum number is "+max+"SecondMax is"+secmax);
	}
}
