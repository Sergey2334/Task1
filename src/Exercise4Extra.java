import java.util.Scanner;

public class Exercise4Extra {
    public static void main(String[] args) {
        /*
        Prime Numbers , Numbers That Can Be Exactly Divided Only By 1 And Themselves (Have Only 2 Factors)
        Get a Number x and check all the numbers below it
        And if exactly divided means Not a Prime Number
        Else means A Prime Number

        We can skip all Even Numbers after 2 , All can be divided by 2 (Start Checking From Number % 2)
        Future Note: I think I can skip all number % evenNumber Checks

        +-------------------------------------------------------------------------+
        Extra:
        I think we can do this in a different way..
        In Exercise4 we had a Number X and we checked all the numbers below X in range of (2 to X-1)
        With big Primes it can take more than 1000 Checks each number , it can add up. And that's a no no
        In the Future Note we said we can Skip all even number checks , because 2 is the Only Even Prime number
        Every other Even number can be divided by 2 means not a Prime number
        We can try even better than this and check if sqrt(X) is an Integer, if so means not a Prime number
        And we dont need to check every number on the way to X, we need to check only Primes
        Because every number that is not a Prime has a Prime Factor

        Im not sure tho.. that's why its in the "Extra" but here's how the checks work:
        1. Check if even - Not Prime
        2. Check if sqrt(X) is Integer - Not Prime
        3. Check X % (Prime Numbers, from 2 to X - 1) == 0 - Not Prime

        We can skip step 1, because we check isEven in step 3

        Examples:
        X = 121
        sqrt(X) = 11 , Integer
        121 % 11 == 0 , Not Prime
        Old Version : 9 Division Checks
        New Version : 1 Sqrt() Check

        X = 243,013 - Not Prime
        First Factor 487 (Prime Number #93)
        Old Version : 486 Division Checks
        New Version : 1 Sqrt() + 92 Division Checks , Not best but better

        X = 104,729 , #10,000 Prime Number
        Old Version : 104,729 Checks from 2 to X-1 means 104,726 Division Checks :'(
        New Version : 1 Sqrt() + 104,729 % Primes ≈ 9,999 Division Checks , Not good but better

        Final Flow:
        X = requested number to check
        1. Check if sqrt(X) = Integer - X Not Prime
        2. Check X % Primes == 0 - X Not Prime
        If pass both - X Prime :)

        Doesn't Work When N = 1,000,000 :'(
        But 100,000 its Beautiful :')
        +-------------------------------------------------------------------------+

        Example:
        1 - Not Prime , has only 1 Factor , Itself
        2 - Is Prime  , Has 2 Factors (1 and 2) (The only even Prime Number)
        7 - Is Prime  , Has 2 Factors (1 and 7)
        9 - Not Prime , Has more than 2 Factors (1 , 3 , 9)
        */

        Scanner input = new Scanner(System.in);

        System.out.print("=====================================\n");
        System.out.print("\t\tPrime Numbers (New)\n");
        System.out.print("=====================================\n");

        System.out.print("Enter Amount N: ");
        int N = input.nextInt();

        int[] primeArray = new int[N]; // We need N amount of Prime Numbers

        // 2 - Is The First Prime Number , i - Current Number Being Checked
        // j - PrimeIndex (Resets each second loop and ends when All ArrayElements are filled)
        for (int i = 2, j = 0; j < N; i++)
        {
            // If sqrt(i) == Integer - Skip
            if (!isRootAnInteger(i))
            {
                for (j = 0; j < primeArray.length; j++)
                {
                    // (if primeArray[j] == 0 - i is Prime at primeArray[j])
                    if (primeArray[j] == 0)
                    {
                        primeArray[j] = i;
                        break;
                    }

                    // Go through primeArray to see i % primeArray[j] == 0 - Skip
                    if (i % primeArray[j] == 0)
                    {
                        break;
                    }
                }
            }
        }

        // Print N amount of Prime Numbers
        for (int i = 0; i < primeArray.length; i++)
        {
            System.out.printf("#%d Prime : %d\n",  i + 1, primeArray[i]);
        }
    }

    public static boolean isRootAnInteger(int currentNumber)
    {
        // If the double == int , then sqrt(currentNumber) is an Integer
        return (double) Math.sqrt(currentNumber) == (int) Math.sqrt(currentNumber);
    }
}
