public class swapVariableWithoutThird {
    public static void main(String args[]) {
        int x = 10;
        int y = 15;

        x = x ^ y;
        y = y ^ x;
        x = x ^ y;

        System.out.println("Swapped value of x is : " + x);
        System.out.println("Swapped value of y is:" + y);
    }
}