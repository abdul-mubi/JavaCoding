package java_example;

import java.util.Scanner;



public class Switch_condition {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello Guys, Welcome to karigalan Magic show");
		
		boolean flag = true;
		
		while (flag) {
			System.out.println("Please Enter first player name");
			String firstplayer = sc.next();
			System.out.println("Please Enter second player name");
			String secondplayer = sc.next();
			System.out.println("Now decide who is gonna start first\npress 1 for " + firstplayer + " or press 2 for "
					+ secondplayer);
			int input1 = sc.nextInt();
			if (input1 == 1) {

				System.out.println("Hi " + firstplayer + ", Please select card number from 1 to 10");
				int input = sc.nextInt();

				System.out.println("Hi " + secondplayer + ", Please click 1 to reveal the ans");
				int desicion = sc.nextInt();

				if (desicion == 1) {

					switch (input) {

					case 1:
						System.out.println("Card1");
						break;

					case 2:
						System.out.println("Card2");
						break;

					case 3:
						System.out.println("Card3");
						break;

					case 4:
						System.out.println("Card4");
						break;

					case 5:
						System.out.println("Card5");
						break;

					case 6:
						System.out.println("Card6");
						break;

					case 7:
						System.out.println("Card7");
						break;

					case 8:
						System.out.println("Card8");
						break;

					case 9:
						System.out.println("Card9");
						break;

					case 10:
						System.out.println("Card10");
						break;

					default:
						System.out.println("Please Enter correct number");
						break;
					}
				}
			} else {

				System.out.println("Hi " + secondplayer + ", Please select card number from 1 to 10");
				int input = sc.nextInt();

				System.out.println("Hi " + firstplayer + ", Please click 1 to reveal the ans");
				int desicion = sc.nextInt();

				if (desicion == 1) {
					switch (input) {

					case 1:
						System.out.println("Card1");
						break;

					case 2:
						System.out.println("Card2");
						break;

					case 3:
						System.out.println("Card3");
						break;

					case 4:
						System.out.println("Card4");
						break;

					case 5:
						System.out.println("Card5");
						break;

					case 6:
						System.out.println("Card6");
						break;

					case 7:
						System.out.println("Card7");
						break;

					case 8:
						System.out.println("Card8");
						break;

					case 9:
						System.out.println("Card9");
						break;

					case 10:
						System.out.println("Card10");
						break;

					default:
						System.out.println("Please Enter correct number");
						break;
					}
				}

			} 
			
			System.out.println("If you want to continue type - yes \nFor exit press- no");
			String control = sc.next();
			
			if(control.equalsIgnoreCase("yes")) {
				continue;
			}else {
				System.out.println("Exited from this game");
				sc.close();
				System.exit(0);
			}
			
		}
		
		
		
		
		
	}
}

