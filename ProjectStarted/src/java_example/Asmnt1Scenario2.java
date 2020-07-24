package java_example;

import java.util.Scanner;

public class Asmnt1Scenario2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Micheal its your turn please enter your bid value");
		
		int Micheal = sc.nextInt();
		
		System.out.println("Bruce its your turn please enter your bid value");
		
		int Bruce = sc.nextInt();
		sc.close();
		
		if(Micheal>Bruce) {
			System.out.println("Micheal bits higher than Bruce");
		}else {
			System.out.println("Bruce bits higher than Micheal");
		}

	}

}
