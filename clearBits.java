public class clearBits {
    public static int clearithBit(int n, int i) {
        int bitMask = ~(1 << i); // this will create a mask with 0 bits not 1
        return n & bitMask; // now due to and operation with zero it will make the ith bit zero that is
                            // clear ith bit
    }

    public static int clearlastiBits(int n, int i) {
        //
        int bitMask = ((~0) << i); // ~0 means all bits are one and ~o << i means ith postion ke left me saare bits
                                   // i.
        return n & bitMask;
    }

    public static int clearBitsinRange(int n, int i, int j) {
        int a = ((~0) << j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static int updateithBit(int n, int i, int newBit) {
        n = clearithBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static void main(String args[]) {
        // System.out.println(clearithBit(10, 1));
        // System.out.println(clearlastiBits(15,2));
        // System.out.println(clearBitsinRange(15, 2, 4));
        System.out.println(updateithBit(10, 2, 1));
    }

}