import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        /*
        =============================================================================================
        Program that calculates a quadratic formula:
        (a * x^2) +- (b * x) +- (c) = 0
        a, b, c
        delta = (b ^ 2) - (4 * a * c)
        x1,2 = (-(b) +- sqrt(delta)) / (2 * a)

        Example:
        x^2 + 3x - 4 = 0
        a = 1, b = 3, c = -1
        delta = (3 ^ 2) - (4 * 1 * (-4)) = 9 - (-16) = 25
        x1 = (-(3) + sqrt(delta)) / (2 * 1) , (+) = (-3 + sqrt(25)) / (2) = (-3 + 5) / (2) = 1
        x2 = (-(3) - sqrt(delta)) / (2 * 1) , (-) = (-3 - sqrt(25)) / (2) = (-3 - 5) / (2) = -4

        can be 2 answers x1,2 , delta > 0
        can be 1 answer , delta = 0
        can be 0 answer* , delta < 0
        (* In that case delta is "i" and the answer is a Complex number "z = a + bi")
        =============================================================================================
        */

        Scanner input = new Scanner(System.in);

        System.out.print("=====================================\n");
        System.out.print("\t\tCalculate A Quadratic\n");
        System.out.print("=====================================\n");

        System.out.print("(ax\u00B2) + (bx) + (c) = 0\n");  // "\u00B2" == "^2"

        System.out.print("Enter a = ");
        float a = input.nextFloat();
        System.out.print("Enter b = ");
        float b = input.nextFloat();
        System.out.print("Enter c = ");
        float c = input.nextFloat();

        System.out.printf("(%.1fx\u00B2) + (%.1fx) + (%.1f) = 0\n\n",  a, b, c);  // "\u00B2" == "^2"

        float delta = calculateDelta(a, b, c);
        //System.out.printf("Delta = %.2f\n", delta);
        float sqrtDelta = (float) Math.sqrt(delta);
        //System.out.printf("sqrt(Delta) = %.2f\n", sqrtDelta);

        if (delta > 0)
        {
            print2Results(a, b, sqrtDelta);
        }

        else if (delta == 0)
        {
            print1Results(a, b);
        }

        else
        {
            printNoResult();

            System.out.print("\nAlternatively..\n");
            System.out.print("********************************\n");
            System.out.print("*** The Complex Number World ***\n\n");
            print2ComplexNumberResults(a, b, delta);
            System.out.print("********************************\n");
        }
    }

    public static float calculateDelta(float a, float b , float c)
    {
        return (b * b) - (4 * a * c);
    }

    public static void print2Results(float a, float b, float sqrtDelta) //If delta > 0 , 2 Answers
    {
        float x1 = (-(b) + (sqrtDelta)) / (2 * a); // (+)
        float x2 = (-(b) - (sqrtDelta)) / (2 * a); // (-)

        System.out.print("2 Answers:\n");
        System.out.printf("x1 = %.3f\n", x1);
        System.out.printf("x2 = %.3f\n", x2);
    }

    public static void print1Results(float a, float b) //If delta = 0 , 1 Answer
    {
        float x = (-(b)) / (2 * a);

        System.out.print("1 Answer:\n");
        System.out.printf("x = %.3f\n", x);
    }

    public static void printNoResult() // If delta < 0 , No Answer* (Complex Number Answer)
    {
        System.out.print("No Answer , delta < 0 , Answer is a Complex Number\n");
    }

    public static void print2ComplexNumberResults(float a, float b, float delta) // If delta < 0 , Complex Number Answer , "sqrt(-1)" = "i"
    {
        /*
        z = (Re) + (Im) * i
        Re = (-(b)) / (2 * (a))
        Im = ((sqrt(-(delta))) / (2 * (a)))

        x1 = (Re) + (Im) * i , (+)
        x2 = (Re) - (Im) * i , (-)
        */

        float imaginarySqrtDelta = (float) Math.sqrt(-(delta));
        float realNumber = (-(b)) / (2 * a);
        float imaginaryNumber = (imaginarySqrtDelta) / (2 * a);

        System.out.print("2 (Complex Number) Answers:\n");
        System.out.printf("x1 = (%.3f) + (%.3f)i\n", realNumber, imaginaryNumber); // (+)
        System.out.printf("x2 = (%.3f) - (%.3f)i\n", realNumber, imaginaryNumber); // (-)
    }
}
