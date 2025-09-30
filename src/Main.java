/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Haru
*****************************************************************************************************
*/
public class Main {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3, int num4) {
        return add(add(num1, num2), add(num3, num4));
    }

    public static String morningGreeting(String name) {
        return "早上好, " + name + "!";
    }

    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!";
    }

    public static String triple(String text) {
        return text + text + text;
    }

    public static double half(int number) {
        return number / 2.0;
    }

    public static int roundPositiveValueToNearestInteger(double value) {
        return (int) (value + 0.5);
    }

    public static int roundNegativeValueToNearestInteger(double value) {
        return (int) (value - 0.5);
    }

    public static void main(String[] args) {
        int sumTwo = add(3, 8);
        System.out.println(sumTwo);

        int sumFour = add(3, 8, 4, 9);
        System.out.println(sumFour);

        String morningMessage = morningGreeting("Alice");
        System.out.println(morningMessage);

        String afternoonMessage = afternoonGreeting("Bob");
        System.out.println(afternoonMessage);

        String tripled = triple("Hi");
        System.out.println(tripled);

        double halved = half(8);
        System.out.println(halved);

        int roundedPositive = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundedPositive);

        int roundedNegative = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundedNegative);
    }
}