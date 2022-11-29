package day2monday;

public class FunctionPractice {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int result1 = addition(a, b);
        System.out.println(result1);

        int c = 3;
        int d = 4;

        int result2 = subtract(c, d);
        System.out.println(result2);

        int e = 5;
        int f = 6;

        int result3 = multiply(e, f);
        System.out.println(result3);

        int g = 7;
        int h = 8;

        float result4 = divide(g, h);
        System.out.println(result4);
    }

    public static int addition(int x, int y) {
        int temp = x + y;
        return temp;
    }

    public static int subtract(int x, int y) {
        int temp = x - y;
        return temp;
    }

    public static int multiply(int x, int y) {
        int temp = x * y;
        return temp;
    }

    public static float divide(float x, float y) {
        float temp = x / y;
        return temp;
    }
}