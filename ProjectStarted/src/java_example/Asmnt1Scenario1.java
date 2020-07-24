package java_example;

import java.util.Scanner;

public class Asmnt1Scenario1 {

	public static void main(String[] args) {
		
		System.out.println("Enter marks in the given order -Mathematics,English,Science,Social");
		
		//Scenario1 obj = new Scenario1();
		
		Scanner sc = new Scanner(System.in);
		
		int Mathematics = sc.nextInt();
		
		System.out.println("Thanks for typing Mathematics mark, now type English mark");
		
		int English  = sc.nextInt();
		
		System.out.println("Now type Science mark");
		
		int Science  = sc.nextInt();

		System.out.println("Now type Social mark");
		
		int Social  = sc.nextInt();
		sc.close();
		
		int Overall_Percentage = percentage(Mathematics,English,Science,Social);
		
		System.out.println("Percentage of this Student is " + Overall_Percentage + "%");
		
		
		if (Overall_Percentage < 40) {
			
			System.out.println("Grade for this percentsge is POOR");
		}else if (Overall_Percentage < 60 ){
			
			System.out.println("Grade for this percentsge is AVERAGE");
		}else if (Overall_Percentage < 80 ){
			
			System.out.println("Grade for this percentsge is GOOD");
		}else if (Overall_Percentage < 90 ){
			
			System.out.println("Grade for this percentsge is VERY_GOOD");
		}else if (Overall_Percentage >= 90 ){
			
			System.out.println("Grade for this percentsge is EXCELLENT");
		}
		
		
	}
	
	public static int percentage(int Mathematics, int English, int Science, int Social) {
		
		int totals = (Mathematics + English + Science + Social);
		
		return (totals / 4) ;
		
		
		
	}

}
