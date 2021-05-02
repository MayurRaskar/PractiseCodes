import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SumOfList {
  public static List<Integer> sum(List<Integer> l1 , List <Integer> l2){
	  List<Integer> l3  =  new ArrayList<>();	
	  int n=0,carry=0;
	  int rem=0;
	  int diff=0;
	  
	  diff=Math.abs(diff= l1.size()-l2.size());
	  
	  List <Integer> temp = l1.size() > l2.size() ? l2 : l1 ;
	  
	  for(int i=0;i<diff;i++) {
		  temp.add(i,0);
	  }
	  
	  n=temp.size();
	  for(int i=0;i<n;i++) {
		  int sum=l1.get(n-1-i)+l2.get(n-1-i)+carry;
		  carry = sum/10;
		  l3.add(sum%10);
	  }
	  
	  if(carry!=0) {
		  l3.add(carry);
	  }
	  
	  Collections.reverse(l3);
	  return l3;
  }
 public static void main(String args[]) {
	 List<Integer> l1 = new ArrayList<>();
	 List<Integer> l2 = new ArrayList<>();
	 l1.add(9);
	 l1.add(9);
	 l1.add(9);
	 l2.add(1);
//	 l2.add(0);
	
	 List <Integer> result=sum(l1 , l2);
	System.out.println(result);
 }
}
