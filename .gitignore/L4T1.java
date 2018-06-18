package by.epam.javabasic25.classes;

import java.util.Arrays;

public class L4T1 {
  
	public static void main(String[] args) {
		
		int Sum;		
		Sum = 0;
		int [] mas = new int[20];
		 
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*90)+10;
        }
		
        System.out.println(Arrays.toString(mas));
        
		for(int i = 0; i<mas.length; i++) {
	
		    if ( mas[i] % 2 == 0) {
		    	Sum = Sum + mas[i];
		    }		
	}
		System.out.println("Sum = " + Sum);
  }
		
}
