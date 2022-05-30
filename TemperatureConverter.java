/**
 * Logan Morris
 * 30 May 2022
 * Simple temperature converter program with user input and conversions
 */

import java.util.Scanner;

public class TemperatureConverter {
  public static void main(String[] args) {
    // Initial welcome message
    Scanner myObj = new Scanner(System.in);
    System.out.println("Welcome to the temperature converter! Enter a " +
      "temperature in either Fahrenheit or Celsius: ");

    String temperature = myObj.nextLine();

    // User input validation for the unit
    String unit = "";
    boolean done = false;
    while (!done) {
      System.out.println("Is this F or C?");
      unit = myObj.nextLine();

      if (unit.toLowerCase().equals("c") || 
          unit.toLowerCase().equals("f")) {
        done = true;
      }

      else {
        System.out.println("The only values you can enter are C or F, " +
          "please try again");
      }
    }
    myObj.close();

    // Initial print
    System.out.println("The temperature you entered was: " + temperature + 
      " degrees " + unit);
    float conv_temp = convert_degrees(unit, temperature);

    // Print statement for Fahrenheit conversion
    if (unit.toLowerCase().equals("c")) {
      System.out.println("The converted temperature is: " + conv_temp + 
      " degrees F");
    } 
    
    // Print statement for Celsius conversion
    else {
      System.out.println("The converted temperature is: " + conv_temp + 
      " degrees C");
    }
  }

  /**
   * Unit conversion method; takes a string input, converts it to an int
   * and performs the necessary unit conversion
   * @param unit the unit the user inputted
   * @param temp the temp the user inputted
   * @return the newly converted temperature as a string for output
   */
  private static float convert_degrees(String unit, String temp) {
    float conv_temp = 0;
    
    // Conversion for F to C
    if (unit.toLowerCase().equals("f")) {
      conv_temp = (Float.parseFloat(temp) - 32) * 5 / 9; 
    }
    
    // Conversion for C to F
    else {
      conv_temp = Float.parseFloat(temp) * 9 / 5 + 32;
    }
    
    return conv_temp;
  }
}
