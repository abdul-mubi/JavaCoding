package java_example;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Assnmnt2_MainScenario extends NumberException{

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(
				"Welcome to Grade Calculator\n*************************************\n*************************************");

		int TotalSubjects;
		boolean flag = true;
		
			while (flag) {
				boolean flag1 = true;
				while (flag1) {
						System.out.println("Please Enter Total number of subject's mark you wants to calculate");
						try {
						TotalSubjects = sc.nextInt();
						percentage(TotalSubjects);
						flag1 = false;
					} catch (InputMismatchException e) {

						System.out.println("Please Enter numbers only");
						sc.next();
					} 
				}
				boolean flag2 = true;
				while (flag2) {
					try {
						System.out.println("Please Enter 1 to continue or 2 to exit");
						int result = sc.nextInt();
						if (result == 1) {
							flag2 =false;
							continue;
						} else if (result == 2) {
							
							System.exit(0);
						}else {
							System.out.println("Please click 1 or 2 dont use other numbers");
						}
					} catch (Exception e) {

						System.out.println("Please click 1 or 2 dont use letters");
						sc.next();
					} 
				}
				
			}
		
		
	}

	@SuppressWarnings("resource")
	public static int[] subjectNameAndMarks(int total) {

		String[] arr = new String[total];

		System.out.println("Please Enter names of the subject one by one");

		for (int i = 0; i < total; i++) {

			boolean flag2 = true;
			while (flag2) {
				try {
					System.out.println("Please Enter name of the subject ");
					Scanner sc1 = new Scanner(System.in);
					arr[i] = sc1.next();
					if(!arr[i].matches("[a-zA-Z]+")) {
						throw new NumberException();
					}
					flag2= false;
				} catch (NumberException e) {
					System.out.println("Please use alphabets, dont use numbers");
					
				} 
			}
		}
		
		
		int[] marks = new int[total];

		for (int i = 0; i < total; i++) {
			boolean flag=true;
			while(flag) {
			
			try {
				
				System.out.println("Please Enter " + arr[i] + " marks ");
                marks[i] = sc.nextInt();
                
			} catch (Exception e) {
				
				System.out.println("Please Enter numbers, dont use alphabets");
				sc.next();
				continue;
			}
			
			if (marks[i] < 0 || marks[i] > 100) {
				System.out.println("Please Enter marks from range 0 to 100");
				continue;
			}
			flag = false;
			}
		}
		return marks;
	}
	
	public static void percentage(int TotalSubjects) {
		
		int[] allSubjectMarks = subjectNameAndMarks(TotalSubjects);
		int temp =0;
		
		for(int i=0; i<TotalSubjects; i++) {
			
			temp = temp + allSubjectMarks[i];
		}
		
		int percentage = temp/TotalSubjects;
		System.out.println("This Student Percentage is "+percentage+" % ");
		
		if(percentage < 40) {
			System.out.println("Grade is Poor");
		}else if(percentage < 60) {
			System.out.println("Grade is Average");
		}else if(percentage < 80) {
			System.out.println("Grade is Good");
		}else if(percentage < 90) {
			System.out.println("Grade is Very Good");
		}else {
			System.out.println("Grade is Excellent");
		}
	}

}
