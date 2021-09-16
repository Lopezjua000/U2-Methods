import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {

   /*
        1. Get the input - radius
        2. Calculate area
        3. Calculate circumference
        4. Display results - output
    */


    public static void main(String[] args) {

        //1.
        double radius = getInput("What is the radius?");
        //2
        double area = area(radius);
        //3
        double circumference = circumference(radius);
        //4
        JOptionPane.showMessageDialog(null, displayResult(area, circumference));


    }

    //re-write the method to calculate a circle's area using parameters and return statement
    public static double area(double radius) {

        return Math.pow(radius, 2) * Math.PI;

    }

    //Get the input
    public static double getInput(String prompt) {
        return Double.parseDouble(JOptionPane.showInputDialog(prompt));
    }

    //re-write the method to calculate a circle's perimeter using parameters and return statement
    public static double circumference(double radius) {

        return 2 * Math.PI * radius;

    }


    public static String displayResult(double area, double circumference) {

        DecimalFormat round = new DecimalFormat("#.00");

        String message = "The area is: " + area;
        message += " \nThe circumeference is: " + circumference;

        return message;
    }

    public static void outputResults(double area, double circumference) {
        DecimalFormat round = new DecimalFormat("#.00");

        String message = "The area is: " + area;
        message += " \nThe circumeference is: " + circumference;

        JOptionPane.showMessageDialog(null, message);

    }

}
