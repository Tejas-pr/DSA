//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] elem = {33, 66, 77, 2, 9, 10};
        int ans = linerSearch(elem, 9);
        System.out.println(ans);
    }

    static int linerSearch(int[] arr, int target) {
         for (int j : arr) {
            if (j == target) {
                return j;
            }
        }
        return -1;
    }
}