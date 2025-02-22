import java.util.*;
class Game
{
    Scanner kb = new Scanner(System.in);
    Random rand = new Random();
    int n , a, c;
    Game() {n=rand.nextInt(100); } // Constructor to generate random number . 
    int takeUserInput() 
    { 
    a = kb.nextInt(); 
    return a;
    }
    int isCorrectNumber(int a)  {
        if (a == n)
        {
            c =  1; // Retuen 1 if the value is exact 
        }
        else if (a > n)
        {
            c =  2; // Returns 2 if value is larger then the entered value
        }
        else if (a < n)
        {
            c =  3 ; // REturns 3 if number is smalller then the entered valuee
        }
        else 
        {
            c =  4 ; // Number entered is invaild . 
        }
        return c;
    }
    boolean p = false;
    void displayResult(int c){
      switch(c){
        case 1 : 
        System.out.println("CONGRATULATIONS YOU WON THE GAME");
        p = true;
        break;
        case 2 : 
        System.out.println("YOUR GUESS IS LARGER THEN THE NUMBER");
        break;
        case 3 : 
        System.out.println("YOUR GUESS IS SMALLER THEN THE NUMBER");
        break;
        default  : 
        System.out.println("INVALID INPUT");
      }
        
    }
    int getRound()
    {
        int Rn = kb.nextInt();
        return Rn;
    }
    void showScore(int i , int Rn)
    {
        if (p = false)
        {
            System.out.printf("Your Score is 0 ");
        }
        else
        {
            System.out.printf("Your Score is %d out of %d" , Rn-i , Rn);
        }
    }
    void playGame(){
        System.out.println("========================================================");
        System.out.println("             Welcome to Guess the number game               ");
        System.out.println("========================================================");
        System.out.print("Feeling Confident! Enter the number of rounds u want to guess the number : \n" + 
        " Minimum round = 1 \n Maximum Round = 10" + 
                                  " one guess = 1 round \n => ");
        int Rn = getRound();
        int i;
        if (Rn > 0 && Rn <= 10)
        {
            int x = 0;      // counter of Rounds 
            for (i = 1 ; i <= Rn ; i++)
            {
                if (p)
                break;
                else {
                    System.out.printf("Enter your %d guess : " , i );
                    a = takeUserInput();
                    displayResult(isCorrectNumber(a));
                    x++;
                }
            }
          
            if (x >= Rn)
            {
                System.out.println("Out Of Rounds You Lost ! ");
            }
            showScore(i , Rn);
        }
        else
            System.out.println("Invalid Input Please try again! ");
    }
    
}
public class main
{
    public static void main(String args[])
    {
        Game obj = new Game();
        obj.playGame();
    }
}
