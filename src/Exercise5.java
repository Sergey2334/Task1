import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        /*
        Fibonacci Sequence  :)
        Get user's Requested Number
        Do a Fibonacci Sequence Series and Check
        If currentNumber equal to requestedNumber or Bigger
        currentNumber == requestedNumber - Number is in the Series
        Bigger - Number is Not in The Series

        Example:
        Fibonacci Sequence: 1 ,1 ,2 ,3 ,5 ,8 ,13 ,21 ...
        Number = 15
        1, 1, ... 13, 21 (!) - Current Number Bigger Than 15 == Number Not in Series
        Number = 34
        1, 1, ... 21, 34 (!) - Current  Number Equal To 34   == Number in Series
        */

        Scanner input = new Scanner(System.in);

        System.out.print("==================================\n");
        System.out.print("\t\tFibonacci Sequence\n");
        System.out.print("==================================\n");

        System.out.print("Enter a Number: ");
        int requestedNumber = input.nextInt();

        int previousNum = 0;
        int currentNum = 1;
        int tempNum = 0;

        while(true)
        {
            // Check Requested Number
            if(currentNum >= requestedNumber)
            {
                if (currentNum == requestedNumber || requestedNumber == 0)
                {
                    System.out.printf("The Number %d Is In The Fibonacci Sequence :D\n", requestedNumber);
                    break;
                }
                System.out.printf("The Number %d Is Not In The Fibonacci Sequence :'(\n", requestedNumber);
                break;
            }

            // The Fibonacci Sequence
            tempNum = currentNum;
            currentNum = currentNum + previousNum;
            previousNum = tempNum;
        }
    }
}
