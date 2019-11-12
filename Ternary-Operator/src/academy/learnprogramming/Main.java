// Short lesson on the Ternary Operator
// The ternary operator is a shortcut to assigning one of two values to a variable depending on a given condition

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true.");
        }
    }
}
