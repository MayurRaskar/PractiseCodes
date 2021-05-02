
public class EvenOdd {

	public static int findSecMax(int[] a) {
		int max = Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
                if(a[1]<a[0]) {
                	max=a[1];
                }
		for (int i = 0; i < a.length; i++) {
			System.out.println("SecMax" + secmax);
			if (max < a[i]) {
				 secmax = max;
				max = a[i];
				

			}
			System.out.println("Final MAx" + max);
		}
		return secmax;
	}

	public static void main(String[] args) {

		int a[] = {-1,-2,-3,-4};
		int secMax = findSecMax(a);
		System.out.println("From STatic" + secMax);

	}
}
