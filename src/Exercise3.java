import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        /*
        Get Sum Of Digits In A Number
        (ABCDE % (10 ^ x)) / (10 ^ x-1) = E , (x = 1)
        (ABCDE % (10 ^ x)) / (10 ^ x-1) = D , (x = 2)
        ...
        (ABCDE % (10 ^ x)) / (10 ^ x-1) = A , (x = 5)
        (ABCDE % (10 ^ x)) / (10 ^ x-1) = Nothing , (x = 6)


        Get Digits Count
        (ABCDE) / 10  = (ABCD) , (digitCount = 1)
        (ABCD) / 10  = (ABC) , (digitCount = 2)
        ...
        (AB) / 10  = (A) , (digitCount = 4)
        (A) / 10  = (0) , (digitCount = 4)


        Example:
        5241 => 5 + 2 + 4 + 1 = 12
        (5241 % (10 ^ 3)) / (10 ^ 2) = (5241 % 1000)  / 100  = 241  / 100  = 2 , *Integer*
        (5241 % (10 ^ 4)) / (10 ^ 3) = (5241 % 10000) / 1000 = 5241 / 1000 = 5 , *Integer*

        (5241) / (10) = 524 != 0 , *Integer* , digitCount = 1
        (524) / (10)  = 52  != 0 , *Integer* , digitCount = 2
        ...
        (5) / (10)    = 0   == 0 , *Integer* , digitCount = 4
        */

        Scanner input = new Scanner(System.in);

        System.out.print("=====================================\n");
        System.out.print("\t\t\tSum Of Digits\n");
        System.out.print("=====================================\n");

        System.out.print("Enter an Integer: ");
        int number = input.nextInt();

        int sum = 0;
        int digitCount = 0;
        int tempNumber = number;

        // Get Integer Count
        do
        {
            digitCount++;
            tempNumber /= 10;
        }
        while (tempNumber != 0);

        // Sum Digits And Print
        System.out.print("The Sum Of The Digits are : ");
        for (int i = 1; i <= digitCount; i++)
        {
            int currentDigit = Math.abs( (int) ((number % (Math.pow((double)10, (double)i)))
                                        / (Math.pow((double)10, (double)(i - 1)))) );
            if (i == digitCount)
            {
                System.out.printf("%d = ", currentDigit);
            }
            else
            {
                System.out.printf("%d + ", currentDigit);
            }
            sum += currentDigit;
        }
        System.out.printf("%d\n", sum);
    }
}
