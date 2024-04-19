public class oddEven {
    public static int checkOddorEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        return 0;
    }

    public static void main(String args[]) {
        checkOddorEven(3);
        checkOddorEven(4);
    }
}