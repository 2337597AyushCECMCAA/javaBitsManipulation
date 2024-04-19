public class addOneToInteger {
    // adding one to an integer using bitwise not operator
    public static int addOne(int n) {
        int invNum = ~n;
        // int result = invNum & (invNum + 1);
        int result = (-(~n));
        return result;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println("Original Number is:" + n);
        System.out.println("Resulted Number is:" + addOne(5));

    }
}