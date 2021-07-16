import java.util.Scanner;


public class elephant{
	
	public static void main(String args[]){
			
		Scanner entrada = new Scanner( System.in);

			int input=0, output=0;
			int[] steps = { 5, 4, 3, 2, 1};

	
		input = entrada.nextInt(); // Input a  Integer


		if( input <= 5 && input > 0 ){
				System.out.println(output+1);
		}	else {
			int aux = 0;
			aux = (input / 5);
			if ( input%5 != 0) {
				aux++;
			}	
			

			System.out.println(aux);

		}
	
   

		

	}


}	
