package learnJava;

public class LinearySearchUsingRecursion {

	public static void main(String[] args) {

		int a[]= {10,30,20,40,50};
		
		System.out.println(recursion(a,2,50));
		
	}
	
	public static int recursion(int[]a, int i, int x) {
		
		
		if(i>=a.length) {
			return -1;
		}
			
		else if(a[i]==x) {
			
			return i;
		}
			
		
		return recursion(a,i+1,x);
		
		
	}

}
