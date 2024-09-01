package core.enumeration;

// Enum declared outside the class
enum Example {
    // We can declare an enum here, but it's not used in this example
}

// EnumDemo class demonstrating enum usage
public class EnumDemo {

    // Enum declared inside the class
    // Enum can be used to represent a set of constants
    public enum Status {
        RUNNING, SUCCESS, ERROR, FAILED
    }

    public static void main(String[] args) {

        // Accessing an enum value
        Status currentStatus = Status.ERROR;

        // Printing the enum value
        System.out.println("Current Status: " + currentStatus);

        // Accessing and printing an enum value from another enum
        System.out.println("Today is: " + Days.MONDAY);

        // Getting all enum values using values() method
        Days[] daysArray = Days.values();

        // Printing each value in enum with its ordinal (index)
        for (Days day : daysArray) {
            System.out.println(day + " : " + day.ordinal());
        }

        // Using if-else statement with enum
        if (currentStatus == Status.RUNNING) {
            System.out.println("The process is currently running.");
        } else if (currentStatus == Status.SUCCESS) {
            System.out.println("The process completed successfully.");
        } else if (currentStatus == Status.ERROR) {
            System.out.println("The process encountered an error.");
        } else {
            System.out.println("The process failed.");
        }

        // Using switch statement with enum
        switch (currentStatus) {
            case RUNNING:
                System.out.println("Switch: The process is running.");
                break;
            case SUCCESS:
                System.out.println("Switch: The process succeeded.");
                break;
            case ERROR:
                System.out.println("Switch: An error occurred in the process.");
                break;
            case FAILED:
                System.out.println("Switch: The process failed.");
                break;
            default:
                System.out.println("Switch: Unknown status.");
                break;
        }

        // Example of switching over the Days enum
        Days today = Days.SATURDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Switch: It's Monday, start of the work week!");
                break;
            case FRIDAY:
                System.out.println("Switch: It's Friday, almost the weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Switch: It's the weekend, time to relax!");
                break;
            default:
                System.out.println("Switch: It's a weekday.");
                break;
        }
        
        //Because enum extends Enum class
        System.out.println(currentStatus.getClass().getSuperclass());
        //class java.lang.Enum
    }
}

/*
 * Output:
 * Current Status: ERROR
 * Today is: MONDAY
 * SUNDAY : 0
 * MONDAY : 1
 * TUESDAY : 2
 * WEDNESDAY : 3
 * THURSDAY : 4
 * FRIDAY : 5
 * SATURDAY : 6
 * The process encountered an error.
 * Switch: An error occurred in the process.
 * Switch: It's the weekend, time to relax!
 * class java.lang.Enum
 */
