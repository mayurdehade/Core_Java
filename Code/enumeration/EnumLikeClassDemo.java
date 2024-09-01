package core.enumeration;

public class EnumLikeClassDemo {
	
	public enum Days {
		 SUNDAY("Holiday", false),
	     MONDAY("Workday", true),
	     TUESDAY("Workday", true),
	     WEDNESDAY("Workday", true),
	     THURSDAY("Workday", true),
	     FRIDAY("Workday", true),
	     SATURDAY("Holiday", false);

	     // Enum variables
	     private String typeOfDay;
	     private boolean isWeekday;

	     //Constructor of DaysEnum
	     Days(String typeOfDay, boolean isWeekday) {
	         this.typeOfDay = typeOfDay;
	         this.isWeekday = isWeekday;
	     }

	     // Method to get the type of day
	     public String getTypeOfDay() {
	         return typeOfDay;
	     }

	     // Method to check if it's a weekday
	     public boolean isWeekday() {
	         return isWeekday;
	     }

	     // Additional method to print a custom message
	     public void printDayInfo() {
	         System.out.println(this.name() + " is a " + typeOfDay + ".");
	         if (isWeekday) {
	             System.out.println("You have to work!");
	         } else {
	             System.out.println("It's time to relax!");
	         }
	     }
	}


	public static void main(String[] args) {
		// Accessing and printing information of a specific day
        Days today = Days.SATURDAY;
        System.out.println("Today is: " + today);
        System.out.println("Type of day: " + today.getTypeOfDay());
        System.out.println("Is it a weekday? " + today.isWeekday());

        // Calling the custom method of the enum
        today.printDayInfo();

        // Iterating over all days and printing their information
        for (Days day : Days.values()) {
            System.out.println("\nDay: " + day);
            day.printDayInfo();
        }

	}

}

/* 
Output: 
Today is: SATURDAY
Type of day: Holiday
Is it a weekday? false
SATURDAY is a Holiday.
It's time to relax!

Day: SUNDAY
SUNDAY is a Holiday.
It's time to relax!

Day: MONDAY
MONDAY is a Workday.
You have to work!

Day: TUESDAY
TUESDAY is a Workday.
You have to work!

Day: WEDNESDAY
WEDNESDAY is a Workday.
You have to work!

Day: THURSDAY
THURSDAY is a Workday.
You have to work!

Day: FRIDAY
FRIDAY is a Workday.
You have to work!

Day: SATURDAY
SATURDAY is a Holiday.
It's time to relax!


*/
