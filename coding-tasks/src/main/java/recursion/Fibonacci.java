package recursion;

public class Fibonacci {
    // 0, 1, 1, 2, 3, 5, 8, 13, 21 ...
    // f(0), f(1), f(3), f(4) ...

    // Space : O(n)
    // Time : O(2^n)
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }


    // Space : O(n)
    // Time : O(n)
    public int fibonacciIteration(int n) {
        int a = 0;
        int b = 1;
        if (n <= 1) return n;
        int temp;
        for (int i = 2; i <= n; i++) {
            temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fibonacci(5));
        System.out.println(f.fibonacciIteration(5));
    }
}
