package by.epam.javabasic25.classes;

public class L4T3 {
 
	public static void main(String[] args) {
		int[] mas;		
		int c = 0;
			
		
		mas = new int[5];
		
		mas[0] = 123;
		mas[1] = 0;
		mas[2] = 789;
		mas[3] = 0;
		mas[4] = 0;
		
		for(int i = 0; i<mas.length; i++) {
	
		    if ( mas[i]  == 0) {
		    	 c = c +1;   // to count the number of elements equal to 0 		    	 		    			
		    }		
	    }
		
		fillArr (c, mas);
		
  }
	
	public static void fillArr (int c, int[] mas) {
		int[] mas2;	
		mas2 = new int[c];		
		int j = 0;
				
		for(int i = 0; i<mas.length; i++) {
			
		    if (mas[i]  == 0) {
		    	 mas2[j] = i;
		    	 j = j +1;
		    		
		    }		
	    }
		
        for (int k = 0; k <mas2.length; k++)  {
			
	        System.out.print("mas[" + k + "]="+ mas2[k]+ ";");
		
	    }
		
    }	

}
