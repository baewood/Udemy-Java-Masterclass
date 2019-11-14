// Lesson in equals to and the assignment operator

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true.");
        }

        boolean isCar = false;
        if (isCar) {
            // can also use
            // if (isCar == false) or if (!isCar)
            // abbreviated form is recommended
            System.out.println("This is not supposed to happen.");
        }

        // The lesson continues with the NOT operator but does not provide an exercise
        // ! is the NOT operator, also known as the Logical Complement Operator, noted for future reference
    }
}
