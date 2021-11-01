import java.util.Random;
import java.util.Scanner;

public class Assignment2
{
	public static void main(String[] args) {
	
        Scanner scan = new Scanner(System.in);
        
        String computerPlays = "rps";
        Random rnd = new Random();
        do{
            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit");
               
                String rps  = scan.nextLine(); 
            
           System.out.println( computerPlays.toLowerCase());
         
          
           if(
             ("userChoice==R&&computerChoice==S")
           ||("userChoice==P&&computerChoice==R")
           ||("userChoice==S&&computerChoice==P")
            )
            System.out.println("User win");
           else 
           System.out.println("Computer win");
         
          break;
         
          char computerChoice = computerPlays.charAt(rnd.nextInt(computerPlays.length()));   
            
            
            
         System.out.println("\n\n");
        }while(true);
    }
}
