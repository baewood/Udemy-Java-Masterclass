package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	double myMinDoubleValue = Double.MIN_VALUE;
	double myMaxDoubleValue = Double.MAX_VALUE;
	System.out.println("Double minimum value = " + myMinDoubleValue);
	System.out.println("Double maximum value = " + myMaxDoubleValue);

	int myIntValue = 5/3;
	float myFloatValue = 5f / 3f;
	double myDoubleValue = 5.00 / 3.00;
	System.out.println("MyIntValue = " + myIntValue);
	System.out.println("MyFloatValue = " + myFloatValue);
	System.out.println("MyDoubleValue = " + myDoubleValue);

	double numberOfPounds = 200d;
	double convertedKilograms = numberOfPounds * 0.45359237d;
	System.out.println("Converted kilograms = " + convertedKilograms);

    }
}
