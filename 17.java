import java.util.Scanner;

//Yangyang Lian CS111B
public class Main
{
    public static void playOneGame()
    {
        int low = 1, high = 100;
        boolean flag = true;
        System.out.println("Guess a number from 1 to 100.");
        // initial guess of user 
        int guess = getMidpoint(low,high); 
        char c;
        // do while loop begins
        do
        {
            c = getUserResponseToGuess(guess);
            switch(c)
            {
                // if guess is higher then increment low value
                case 'h':
                          low = guess + 1;
                          guess = getMidpoint(low, high);
                          break;
                // if guess is lower then decrement high value
                case 'l':
                          high = guess - 1;
                          guess = getMidpoint(low, high);
                          break;
                case 'c':
                          flag = false;
                          break;
            }
            
        }while(low<high && flag);
    }
    
    public static boolean shouldPlayAgain()      
    {
        // Ask the user if he is interested to play again
        System.out.print("Great! Do you want to play again? (y/n): ");  
        Scanner sc = new Scanner(System.in);
        char c = sc.next(".").charAt(0);
        // check if c  yes for y and no for n
        if(Character.compare(c, 'y')==0)
            return true;
        else 
            return false;
    }
    
    public static char getUserResponseToGuess(int guess)
    {
        System.out.print("Is it "+ guess + "?  (h/l/c): ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next(".").charAt(0);
        return c;
    }
    
    public static int getMidpoint(int low, int high)
    {
        // return the middle value 
        return (low+high)/2;
    }
    
        public static void main(String[] args) {
                
                do {
                    // play a game 
                    playOneGame();
                } while(shouldPlayAgain());
                
        }
}
