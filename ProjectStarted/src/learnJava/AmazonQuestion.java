package learnJava;

public class AmazonQuestion {

	public static void main(String[] args) {

		int[] a= {100,200,300,400,500,900,1100,1200,1230,1300};
		
		int x = 1000;
		
		amazonWishList(a,x);
	}

	public static int amazonWishList(int[] a, int x) {
		
		int length = a.length;
		int j =0 ;
		int index = 0;
		
		for(int i=length-1; i<=0; i++) {
			
			if(a[j]+a[i] <=1000) {
				
				index = i;
				break;
			}
		}
		
		
		
		
		return -1;
		
	}
	
}
