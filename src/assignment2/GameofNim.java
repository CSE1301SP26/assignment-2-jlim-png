import java.util.Scanner;

public class GameofNim {

    public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);

            System.out.println("Input an initial number of sticks that is less than 15");

            int NumberOfSticks = in.nextInt();
             

            while (NumberOfSticks > 0) {
                System.out.println("There are " + NumberOfSticks + " sticks remaining.");
                System.out.println("Pick 1 or 2 sticks to remove:");
                int playerChoice = in.nextInt();

                if (playerChoice != 1 && playerChoice != 2) {
                    System.out.println("Number of sticks invalid. Choose either 1 or 2"); } 
                else {
                        NumberOfSticks -= playerChoice; 
                        System.out.println("There are " + NumberOfSticks + " sticks remaining.");
                    
                
                    if (NumberOfSticks < 0) {
                        NumberOfSticks = 0;
                    }
                    int computerTake;
                    double computerChoice = Math.random(); 
                    if (NumberOfSticks == 0) {
                        System.out.println("You win!");
                    }
                    else if (computerChoice > 0.5) {
                        computerTake = 2; 
                        NumberOfSticks -= computerTake; 
                        System.out.println("The computer takes " + computerTake + " sticks."); 
                        if (NumberOfSticks < 0) {
                            NumberOfSticks = 0;
                        System.out.println("There are " + NumberOfSticks + " sticks remaining."); } 
                        if (NumberOfSticks == 0) {
                            System.out.print("Computer Wins!");
                        }
                    }
                    else {
                        computerTake = 1;
                        NumberOfSticks -= computerTake; 
                        System.out.println("The computer takes " + computerTake + " sticks."); 
                        if (NumberOfSticks < 0) {
                            NumberOfSticks = 0;
                        }
                        System.out.println("There are: " + NumberOfSticks + " sticks remaining.");
                         if (NumberOfSticks == 0) {
                            System.out.print("Computer Wins!");
                        }
                }
		        }
	        }
    
        }
    }




            

    

    























    

