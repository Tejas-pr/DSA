package maths;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 0;
        boolean ans = n > 0 && (n & (n - 1)) == 0;
        System.out.println(ans);
    }
}
