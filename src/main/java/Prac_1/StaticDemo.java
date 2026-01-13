package Prac_1;

public class StaticDemo {


        // static variables
        static int count = 0;
        static String company = "GFG";

        StaticDemo() {
            count++; // increase static variable
        }

        public static void main(String[] args) {

            StaticDemo d1 = new StaticDemo();
            StaticDemo d2 = new StaticDemo();
            StaticDemo d3 = new StaticDemo();
            StaticDemo d4 = new StaticDemo();

            // printing using different objects
            System.out.println("Count from d1: " + d1.count);
            System.out.println("Count from d2: " + d2.count);
            System.out.println("Count from d3: " + d3.count);
            System.out.println("Count from d3: " + d4.count);


            System.out.println("Company from d1: " + d1.company);
            System.out.println("Company from d2: " + d2.company);
            System.out.println("Company from d3: " + d3.company);
        }
    }


