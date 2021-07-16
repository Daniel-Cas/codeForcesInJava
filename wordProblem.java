import java.util.Scanner;


 public class wordProblem{



	 public static void main( String args[]){
	
			Scanner entrada = new Scanner(System.in);


		 	String s = "";
			int upper=0, lower=0;
			s = entrada.nextLine();

			for( int i = 0; i <= s.length() -1  ; i++){
       
				char letter = s.charAt(i);

				if (Character.isUpperCase(letter)){
						upper++;
				} else {
					lower++;
				}
			}
			if( lower >= upper) {
				
				System.out.println(s.toLowerCase());
			} else {
				
				System.out.println(s.toUpperCase());
			}
	 }	

 }

