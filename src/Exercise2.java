import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        /*
        A mathematical series contains:
        a1 - first term
        d - common difference
        n - number of terms

        Example:
        a1 = 1, d = 3, n = 6

        The Mathematical Series: (a1 -> a6)
        1 , 4 , 7 , 10 , 13 , 16 , 19
        */

        Scanner input = new Scanner(System.in);

        System.out.print("=====================================\n");
        System.out.print("\t\tMathematical Series\n");
        System.out.print("=====================================\n");

        System.out.print("Enter a1 = ");
        float a1 = input.nextFloat();
        System.out.print("Enter d = ");
        float d = input.nextFloat();
        int n = 0;
        do
        {
            System.out.print("Enter n (n must be a Positive Integer) = ");
            n = input.nextInt();
        }
        while(n < 0);

        float currentTerm = a1;
        for (int i = 0; i < n; i++)
        {
            System.out.printf("a%d = %.2f\n", i + 1, currentTerm);
            currentTerm = currentTerm + d;
        }
    }
}
