package demoApplicatons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoWebShop {

	public static void main(String[] args) {
		 
		 
		char[] z = {'f','u','c','k'};
		char[] w = {'y','o','u','l','i','f','e','f','u'};
		
		
		for(int i =0; i<z.length; i++) {
			int count =0;
			for(int j=0; j<w.length;j++) {
				
				if(z[i]==w[j]) {
					
					count++;
				}
				
				
			}
			if(count>0)
			System.out.println("Value of element is "+z[i]+" and number of times present in w array is "+count);
		}
}

}    
