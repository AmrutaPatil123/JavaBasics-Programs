package Assignment_2;

public class Electricity_Bill_Calculator_Q9 {
    public static void main(String[] args)
    {

        // Given units consumed
        int units = 250;

        // Variable to store total electricity bill
        double total_bill;

        if (units <= 100) {

            // First slab only
            total_bill = units * 1.5;

        } else if (units <= 200) {

            // First 100 + remaining in second slab
            total_bill = (100 * 1.5) + (units - 100) * 2.5;

        } else if (units <= 300) {

            // First + second + third slab calculation
            total_bill = (100 * 1.5) + (100 * 2.5) + (units - 200) * 4.0;

        } else {

            // All slabs + extra units in fourth slab
            total_bill = (100 * 1.5) + (100 * 2.5) + (100 * 4.0) + (units - 300) * 6.0;
        }

        // Final output
        System.out.println("Total bill is: " + total_bill + " for units " + units);
    }
}

