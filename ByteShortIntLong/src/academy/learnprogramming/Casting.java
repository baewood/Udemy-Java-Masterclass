package academy.learnprogramming;

public class Casting {
    public static void main(String[] args) {

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        /* By adding (byte) before the math, it casts the value to a byte instead of an int */
        /* You can do the same with the other primitive types since Java uses int by default */

    }
}

