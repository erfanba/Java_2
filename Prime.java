import java.util.* ;
import java.lang.*;
public class Prime {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		
		int count = 0 ;
		int i = 1 ;
		
		while(true){

			System.out.println("Enter a value to see if its Prime Or Not!");
			System.out.println("TO EXIT ENTER \"-1\"");
			int number = input.nextInt() ;
			if (number == -1) {
				System.out.println("YOU EXITED");
				System.exit(0) ;
			}
			
			while(i <= number) {
				if(number == 1) {
					count  = 50 ;
				}
				else if (number % i == 0 ) {
					count++ ;
				}
				i++ ;
			}

			if(count < 2){
				System.out.format("%d is Prime\n\n\n",number) ;
				System.out.format("count = %d\n",count);
			}
			else{
				System.out.format("%d is Not Prime\n\n\n",number) ;
			}
			count = 0 ;
			i = 2 ;
		}
	}


}
