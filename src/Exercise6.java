import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        /*
        Print a Diamond of Requested Line Number Amount , Must be Odd and Bigger than 3 (5, 7, 9...)

        lineAmount = x
        Print an Up Pointing Triangle:
        Range       = 1 to (lineAmount / 2) + 1 (By jump of +2)
        Spaces      = (lineAmount - currentAmount) / 2
        Asterisks   = currentAmount

        Print a Down Pointing Triangle:
        Range       = (lineAmount / 2) to 1 (By jump of -2)
        Spaces      = (lineAmount - currentAmount) / 2
        Asterisks   = currentAmount

        Example:
        lineAmount = 5
        [0][1]  *          (5 - 1) / (2) = 2 Spaces (Integer) | (1) = 1 Asterisks ("Stars")
        [1][3] ***         (5 - 3) / (2) = 1 Spaces (Integer) | (3) = 3 Asterisks ("Stars")
        [2][5]*****        (5 - 5) / (2) = 0 Spaces (Integer) | (5) = 5 Asterisks ("Stars")

        (Done Print Up Pointing Triangle , Now Print Down Pointing Triangle)

        [3][3] ***         (5 - 3) / (2) = 1 Spaces (Integer) | (3) = 3 Asterisks ("Stars")
        [4][1]  *          (5 - 1) / (2) = 2 Spaces (Integer) | (1) = 1 Asterisks ("Stars")
        */

        Scanner input = new Scanner(System.in);

        System.out.print("=====================================\n");
        System.out.print("\t\t\tPrint Diamond\n");
        System.out.print("=====================================\n");

        int lineAmount = 0;
        do
        {
            System.out.print("Enter Line Amount Number: ");
            lineAmount = input.nextInt();
        }
        while (lineAmount % 2 == 0 || lineAmount <= 3);

        for (int i = 1; i <= lineAmount; i += 2) // Start from 1 to (lineAmount / 2) + 1
        {
            for (int j = 0; j < (lineAmount - i) / 2; j++)
            {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = lineAmount - 2; i >= 1; i -= 2) // Start from (lineAmount / 2) to 1
        {
            for (int j = (lineAmount - i) / 2; j > 0; j--)
            {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
