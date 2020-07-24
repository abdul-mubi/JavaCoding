package learnJava;

public class Interger_12345 {

	public static void main(String[] args) {
		
		//print-12345
		
		int temp = 1;
		
		for(int i = 1; i<5; i++) {
			
			 temp = (temp*10) + (i+1);
			
		}
		
		System.out.println(temp);
		
		//reverse printing - 54321
		
		int temp1 = 5;
		
		for(int i = 4; i>0; i--) {
			
			 temp1 = (temp1*10) + (i);
			
		}
		
		System.out.println(temp1);
		
		//another way of printing - 54321(if questions come as - take 12345 as input and print the reverse)
		
		int num = 12345;
		
		int rev = 0;
		
		while(num!=0) {
			
			rev = (rev*10) + num%10 ;
			
			num = num/10;
			
		}
		
		System.out.println("Reverse - "+rev);
		
		//another way of printing - 54321 by using StringBuffer
		
		int num1 = 12345;
		
		StringBuffer sb = new StringBuffer(String.valueOf(num1));
		
		sb.reverse();
		
		System.out.println(sb);
		

	}

}
