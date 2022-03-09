import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

  	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter any number: ");

    	// This method reads the number provided using keyboard
	int num = scan.nextInt();

    	// Closing Scanner after the use
	scan.close();
    
  	int factorial = 1;
    	for(int i=1; i<=num; i++){
    		factorial *= i;
	}
    	System.out.println("Factorial for " + num + " is " + factorial);

  }
}
