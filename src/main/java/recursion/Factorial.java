package recursion;

public class Factorial {
    public int factorial(int n) {
        if (n == 2) return 2;
        return n * factorial(n-1);
    }

    public int factorialItertation(int n) {
        int returnValue = 1;
        for (int i = 2; i <= n; i++) {
            returnValue *=i;
        }
        return returnValue;
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println(" Factorial of 5 : " + f.factorial(5));
        System.out.println(" Factorial of 5 : " + f.factorialItertation(5));
    }
}
