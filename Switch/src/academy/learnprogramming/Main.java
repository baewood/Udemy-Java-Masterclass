package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // First way of writing the code, without switch statement

        //int value = 1;
        //if(value == 1) {
        //    System.out.println("Value was 1");
        //} else if(value ==2) {
        //    System.out.println("Value was 2");
        //} else {
        //    System.out.println("Was not 1 or 2");
        //}

        int switchValue = 6;

        switch(switchValue) {
            case 1:
                System.out.println("Value wwas 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4, or 5");
                break;
        }

        // Create a new switch statement using char instead of int

        char charValue = 'A'; // single quotes indicate char, double indicate string
        switch(charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");

            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;
        }

        // Create a new switch statement with a string

        String month = "January";
        switch(month) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
