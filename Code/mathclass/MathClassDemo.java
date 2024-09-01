package core.mathclass;

public class MathClassDemo {

    public static void main(String[] args) {

        // 1. Math.abs() - Returns the absolute value of a number
        int absValue = Math.abs(-10);
        System.out.println("Absolute value of -10: " + absValue); // Output: 10

        // 2. Math.max() - Returns the larger of two values
        int maxValue = Math.max(10, 20);
        System.out.println("Max of 10 and 20: " + maxValue); // Output: 20

        // 3. Math.min() - Returns the smaller of two values
        int minValue = Math.min(10, 20);
        System.out.println("Min of 10 and 20: " + minValue); // Output: 10

        // 4. Math.sqrt() - Returns the square root of a number
        double sqrtValue = Math.sqrt(16);
        System.out.println("Square root of 16: " + sqrtValue); // Output: 4.0

        // 5. Math.pow() - Returns the value of the first argument raised to the power of the second argument
        double powerValue = Math.pow(2, 3);
        System.out.println("2 raised to the power 3: " + powerValue); // Output: 8.0

        // 6. Math.round() - Rounds the argument to the nearest integer
        long roundValue = Math.round(3.5);
        System.out.println("Round of 3.5: " + roundValue); // Output: 4

        // 7. Math.ceil() - Rounds the argument up to the nearest integer
        double ceilValue = Math.ceil(3.45);
        System.out.println("Ceil of 3.45: " + ceilValue); // Output: 4.0

        // 8. Math.floor() - Rounds the argument down to the nearest integer
        double floorValue = Math.floor(3.99);
        System.out.println("Floor of 3.99: " + floorValue); // Output: 3.0

        // 9. Math.random() - Returns a random double value between 0.0 and 1.0
        double randomValue = Math.random();
        System.out.println("Random value: " + randomValue); // Output: (random number between 0.0 and 1.0)

        // 10. Math.log() - Returns the natural logarithm (base e) of a number
        double logValue = Math.log(Math.E);
        System.out.println("Natural log of e: " + logValue); // Output: 1.0
    }
}
