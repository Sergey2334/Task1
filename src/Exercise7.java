public class Exercise7 {
    public static void main(String[] args) {
        /*
        Narcissistic Number:
        Sum of all digits to the power of digit amount is the number itself

        Example:
        153 : 1^3 + 5^3 + 3^3 = 153
        */

        System.out.print("=====================================\n");
        System.out.print("\t\tNarcissistic Numbers\n");
        System.out.print("=====================================\n");

        final int MAX_VAL = 1000;

        for (int i = 1, j = 0; i <= MAX_VAL; i++)
        {
            if (getDigitPowerSum(i) == i)
            {
                j++;
                System.out.printf("Narcissistic Number #%d: %d\n", j, i);
            }
        }
    }

    public static int getDigitPowerSum(int num)
    {
        int sum = 0;
        int digitCount = 1;

        for (int i = 10; (num / i) != 0; i *= 10) // Gets Digit Amount
        {
            digitCount++;
        }

        if (digitCount == 1) // All 1-digit Numbers are narcissistic numbers
        {
            return num;
        }

        int currentDigit = 0;
        for (int i = 10, j = 1, k = 0; k < digitCount; i *= 10, j *= 10, k++) // Calculates Sum
        {
            currentDigit = (num % i) / (j);
            sum += (int) Math.pow(currentDigit, digitCount);
        }

        return sum;
    }
}
