import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        /*
        Prime Numbers , Numbers That Can Be Exactly Divided Only By 1 And Themselves (Have Only 2 Factors)
        Get a Number x and check all the numbers below it
        And if exactly divided means Not a Prime Number
        Else means A Prime Number

        We can skip all Even Numbers after 2 , All can be divided by 2 (Start Checking From Number % 2)
        Future Note: I think I can skip all number % evenNumber Checks

        Example:
        1 - Not Prime , has only 1 Factor , Itself
        2 - Is Prime  , Has 2 Factors (1 and 2) (The only even Prime Number)
        7 - Is Prime  , Has 2 Factors (1 and 7)
        9 - Not Prime , Has more than 2 Factors (1 , 3 , 9)
        */

        Scanner input = new Scanner(System.in);

        System.out.print("=====================================\n");
        System.out.print("\t\t\tPrime Numbers\n");
        System.out.print("=====================================\n");

        System.out.print("Enter Amount N: ");
        int N = input.nextInt();

        int numberCounter = 0;
        boolean isPrime = true;
        for(int i = 2; numberCounter < N; i++)
        {
            isPrime = true;

            for (int j = 2; j < i; j++) // Not checking i % 1 (Can Skip) , Not checking i == j (i % j Will Return 0)
            {
                if (i % j == 0) // Not a Prime Number
                {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
            {
                numberCounter++;
                System.out.printf("#%d Prime : %d\n", numberCounter, i);
            }
        }
    }
}
