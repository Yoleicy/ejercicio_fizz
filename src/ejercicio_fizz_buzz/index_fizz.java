package ejercicio_fizz_buzz;

public class index_fizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i;
        i=0;
        while (i<100) {
            i = i + 1;
        
        if (i % 3 == 0 && i % 5 == 0){
        	System.out.println(" fizzbuzz");
        }else if(i % 3 == 0) {
        	System.out.println(" fizz");
        }else if(i % 5 == 0){
        	System.out.println(" buzz");
        }else {
        	System.out.println(i);
        }
			    
			}
		}
	   
	}
	
