import java.util.*;
import java.util.Map.Entry;

public class Test {
	public void getFrequency(int[] arr) {
		 Map<Integer,Integer> map=new TreeMap<>();
		 for(int p: arr) {
			 if(map.get(p)==null) {
				 map.put(p,1);
			 }else {
				 map.put(p, map.get(p)+1);
			 }
		 }
		 for(Entry<Integer, Integer> n:map.entrySet()) {
			 System.out.println("key="+n.getKey()+"  Value="+n.getValue());
		 }
		 
	}
 public static void main(String[] args) {
	 int a[]= {1,1,2,3,-2,0,8,-1};
  Test t=new Test();
  t.getFrequency(a);
  List<String> list = new ArrayList<>();
  List<Integer> lin = new LinkedList<>();
  Queue<Integer> q = new LinkedList<>();
  Queue<Integer> pq = new PriorityQueue<>();
  Stack<String>  st = new Stack<>();
  Set<String> set = new HashSet<>();
  Set<Integer> seti = new LinkedHashSet<>();
  Set<String> setq = new TreeSet<>();
  Map<String,Integer> map = new HashMap<>();
  Map<String,String> nmap = new LinkedHashMap<>();
  Map<String,String> nmp = new TreeMap<>();
  
  
	 
 }
}
