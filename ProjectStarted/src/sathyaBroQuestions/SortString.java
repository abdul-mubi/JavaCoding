package sathyaBroQuestions;

public class SortString {

	public static void main(String[] args) {

		String name = "edcba";
		char[] arr = name.toCharArray();
		char temp = 'a';
		
		for(int i = 0; i<name.length();i++) {
			for(int j=1; j<name.length()-i; j++) {
				
				if(name.charAt(j-1) > name.charAt(j)) {
					
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				}	
			}
		}
		
		String sort="";
		
		for(int i=0; i<arr.length;i++) {
			
			sort += arr[i];
		}
		
		System.out.println(sort);
		
		
	}

}
